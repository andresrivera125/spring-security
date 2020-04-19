package com.example.oauth2demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    private String startSpan = "<span style='font-size: xx-large;'>";
    private String endSpan = "</span>";

    @GetMapping("/")
    public String helloWorld(){
        return addSpan("Hi. You have access to this resource");
    }

    @GetMapping("/restricted")
    public String restricted(){
        return addSpan("Congratulations, you are logged!");
    }

    @GetMapping("/not-restricted")
    public String notRestricted() {
        return addSpan("You do not need to be logged in");
    }

    private String addSpan(String s) {
        return startSpan + s + endSpan;
    }
}
