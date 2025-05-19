package com.vistula.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RestContoller
public class HelloController {

    @GetMapping(value = "/")
    public String hello() {return "Hello Vistula, in my first Spring controller";}

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "Prince") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting"; // Looks for greeting.html in templates/
    }
    //http://localhost:8080/greeting?name=Prince

}
