package ru.netology.jdbs.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jdbs.service.JdService;

import java.util.List;

@RestController
public class JdController {
    private final JdService jdService;

    public JdController(JdService jdService) {
        this.jdService = jdService;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam("name") String name) {
        System.out.println(name);
        return jdService.getProductName(name);
    }
}
