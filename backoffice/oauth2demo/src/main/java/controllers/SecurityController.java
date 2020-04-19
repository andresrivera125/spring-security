package controllers;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello world";
    }

    @GetMapping("/restricted")
    public String restricted() {
        return "You don't have access";
    }
}
