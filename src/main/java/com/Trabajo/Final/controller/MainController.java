package com.Trabajo.Final.controller;

import com.Trabajo.Final.model.Matricula;
import com.Trabajo.Final.model.User;
import com.Trabajo.Final.service.UserService;
import com.Trabajo.Final.service.MatriculaService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {


    @Autowired
    private UserService userService;

    @Autowired
    private MatriculaService matriculaService;


    @GetMapping("/index")
    public String index() {
        return "index"; // Carga index.html
    }

    @GetMapping("/beneficios")
    public String beneficios() {
        return "BENEFICIOS"; // Carga BENEFICIOS.html
    }

    @GetMapping("/comunidad")
    public String comunidad() {
        return "COMUNIDAD"; // Carga COMUNIDAD.html
    }

    @GetMapping("/cursos")
    public String cursos() {
        return "CURSOS"; // Carga CURSOS.html
    }

    @GetMapping("/elementos-clave")
    public String elementosClave() {
        return "ELEMENTOS CLAVE"; // Carga ELEMENTOS CLAVE.html
    }

    @GetMapping("/historia")
    public String historia() {
        return "HISTORIA"; // Carga HISTORIA.html
    }

    @GetMapping("/confirmacion")
    public String mostrarConfirmacion() {
        return "confirmacion";
    }

    @GetMapping("/nosotros")
    public String nosotros() {
        return "NOSOTROS"; // Carga NOSOTROS.html
    }

    @GetMapping("/sedes")
    public String sedes() {
        return "SEDES"; // Carga SEDES.html
    }

    @GetMapping("/preguntas")
    public String preguntas() {
        return "PREGUNTAS"; // Carga PREGUNTAS_FRECUENTES.html
    }


    //SITIO DE REGISTRO Y LOGIN ADMINISTRADOR
    @GetMapping("/iniciar-sesion")
    public String iniciarSesion(Model model) {
        return "Iniciar Sesión"; // Carga Iniciar Sesión.html
    }

    @PostMapping("/registrarse")
    public String register(@ModelAttribute User user, Model model) {
    try {
        userService.saveUser(user);
        model.addAttribute("success", "Registro exitoso. Puedes iniciar sesión.");
        return "Iniciar Sesión"; // Redirige a la misma vista para mostrar el mensaje
    } catch (Exception e) {
        model.addAttribute("error", "Error al registrar el usuario: " + e.getMessage());
        return "Iniciar Sesión"; // Vuelve a mostrar el formulario con el error
    }
    }

    @PostMapping("/iniciar-sesion")
    public String login(@ModelAttribute User user, Model model) {
        User authenticatedUser = userService.findByEmailAndPassword(user.getEmail(), user.getPassword());
    if (authenticatedUser != null) {
        return "redirect:/dashboard"; // Cambia a la ruta correspondiente despues de inciar sesión admi
    } else {
        model.addAttribute("error", "Credenciales inválidas");
        return "Iniciar Sesión"; // Vuelve a mostrar el formulario con error
    }
    }

    //SITIO DE MATRICULA DEL PADRE O APODERADO
    @GetMapping("/matricula2025")
    public String matricula2025(Model model) {
        model.addAttribute("matricula", new Matricula()); // Inicializa un nuevo objeto Matricula
        return "MATRICULA2025"; // Carga MATRICULA2025.html
    }

    @PostMapping("/matricula-registrarse")
    public String registerMatricula(@ModelAttribute Matricula matricula, Model model) {
        String confirmPassword = matricula.getPassword(); // Asegúrate de manejar este campo adecuadamente

        if (confirmPassword.equals(matricula.getPassword())) {
            try {
                matriculaService.saveLoginMatricula(matricula); // Guarda la matrícula
                model.addAttribute("success", "Registro exitoso. Puedes iniciar sesión.");
            } catch (Exception e) {
                model.addAttribute("error", "Error al registrar el usuario: " + e.getMessage());
            }
        } else {
            model.addAttribute("error", "Las contraseñas no coinciden.");
        }

        return "MATRICULA2025"; // Regresa a la página de matrícula
    }

    // Método para iniciar sesión
    @PostMapping("/matricula-login")
    public String loginMatricula(@ModelAttribute Matricula matricula, Model model) {
        Matricula authenticatedUser = matriculaService.findByEmailAndPassword(matricula.getEmail(), matricula.getPassword());
        if (authenticatedUser != null) {
            return "redirect:/formulario"; // Redirige si las credenciales son correctas
        } else {
            model.addAttribute("error", "Credenciales inválidas");
            return "MATRICULA2025"; // Regresa con error
        }
    }
}