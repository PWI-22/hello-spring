package br.edu.unisep.hello.controller;

import br.edu.unisep.hello.dto.MessageDto;
import br.edu.unisep.hello.dto.RegisterDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello, Spring Boot!";
    }

    @GetMapping("/message")
    public MessageDto getMessage(@RequestParam("name") String name) {
        return new MessageDto("Hello!", name);
    }

    @GetMapping("/start/{id}")
    public String start(@PathVariable("id") Integer id) {
        return "Started: " + id;
    }

    @PostMapping("/register")
    public void registerUser(@RequestBody RegisterDto register) {
        System.out.println("Recebido");
        System.out.println("Name: " + register.getName());
        System.out.println("Email: " + register.getEmail());
        System.out.println("Password: " + register.getPassword());
    }

}
