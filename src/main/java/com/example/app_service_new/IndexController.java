package com.example.app_service_new;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        List<Usuario> usuarios = List.of(
                new Usuario(1, "Marmo", "Cabro"),
                new Usuario(2, "Luis", "luis@email.com"),
                new Usuario(3, "Carla", "carla@email.com")
        );
        model.addAttribute("usuarios", usuarios);
        return "index";
    }
}
