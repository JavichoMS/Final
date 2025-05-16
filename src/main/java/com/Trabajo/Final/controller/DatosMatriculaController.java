package com.Trabajo.Final.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Trabajo.Final.model.Alumno;
import com.Trabajo.Final.model.Apoderado;
import com.Trabajo.Final.model.DatosMatricula;
import com.Trabajo.Final.repository.AlumnoRepository;
import com.Trabajo.Final.repository.ApoderadoRepository;
import com.Trabajo.Final.repository.DatosMatriculaRepository;

@Controller
public class DatosMatriculaController {

    @Autowired
    private ApoderadoRepository apoderadoRepository;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private DatosMatriculaRepository datosMatriculaRepository;

    // Paso 1: Mostrar el formulario
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("apoderado", new Apoderado());
        model.addAttribute("alumno", new Alumno());
        model.addAttribute("datosMatricula", new DatosMatricula());
        return "formulario";  // Este es el archivo formulario.html
    }

    // Este es el método que procesa el formulario
    @PostMapping("/procesarFormulario")
    public String procesarFormulario(
            @ModelAttribute Apoderado apoderado,
            @ModelAttribute Alumno alumno,
            @ModelAttribute DatosMatricula datosMatricula,
            RedirectAttributes redirectAttributes) {

        // Guardar los datos en la base de datos
        Apoderado apoderadoGuardado = apoderadoRepository.save(apoderado);
        alumno.setApoderado(apoderadoGuardado);
        Alumno alumnoGuardado = alumnoRepository.save(alumno);
        datosMatricula.setAlumno(alumnoGuardado);
        datosMatriculaRepository.save(datosMatricula);

        // Redirigir al dashboard con un mensaje
        redirectAttributes.addFlashAttribute("mensaje", "Matrícula registrada correctamente.");
        return "redirect:/confirmacion"; // Redirige a la página de confirmación
    }
}
