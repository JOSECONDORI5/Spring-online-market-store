package com.josecondoridev.onlinemarketstore.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class HolaMundoController {

    @GetMapping("/hello")
    public String greet() {
        return "Hola Mundo 🐱‍🏍";
    }
}
