package br.edu.ifmt.websecurityjdbc.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {


    @GetMapping("/")
    public String home() {
        return "<h1> Welcome </h1>";
    }

    @GetMapping("/users")
    @Secured("ROLE_USER")
    public String users() {
        return "<h1> Welcome User </h1>";
    }


    @GetMapping("/admin")
    @Secured("ROLE_ADMIN")
    public String admin() {
        return "<h1>Welcome admin </h1>";
    }



}
