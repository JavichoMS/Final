package com.Trabajo.Final.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Trabajo.Final.dto.MatriculaDTO;
import com.Trabajo.Final.model.Docente;
import com.Trabajo.Final.service.DatosMatriculaService;
import com.Trabajo.Final.service.DocenteService;

@Controller
public class DashboardController {

    @Autowired
    private DatosMatriculaService datosMatriculaService;

    @Autowired
    private DocenteService docenteService;

    // Carga el dashboard con todas las matrículas y docentes
    @GetMapping("/dashboard")
    public String obtenerDashboard(Model model) {
        // Obtener las matrículas desde el servicio
        List<MatriculaDTO> matriculas = datosMatriculaService.obtenerMatrículas(); 
        model.addAttribute("matriculas", matriculas);

        // Obtener los docentes
        List<Docente> docentes = docenteService.getAllDocentes();   
        model.addAttribute("docentes", docentes);

        return "dashboard";  // Plantilla HTML
    }

    // Registrar un nuevo docente
    @PostMapping("/docentes")
    public String registrarDocente(@ModelAttribute Docente docente) {
        docenteService.saveDocente(docente);
        return "redirect:/dashboard";
    }

    // Editar una matrícula
    @PostMapping("/dashboard/editar")
    public String editarMatricula(@ModelAttribute MatriculaDTO matriculaDto) {
        datosMatriculaService.actualizarMatricula(matriculaDto);
        return "redirect:/dashboard";
    }

    // Eliminar una matrícula
    @GetMapping("/dashboard/eliminar/{id}")
    public String eliminarMatricula(@PathVariable Long id) {
        datosMatriculaService.eliminarMatricula(id);
        return "redirect:/dashboard";
    }
}
