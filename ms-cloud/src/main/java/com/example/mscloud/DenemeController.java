package com.example.mscloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DenemeController {

    @Value("ilkin.deneme")
    private String deneme;

    @GetMapping("/")
    public void deneme(){
        System.out.println(deneme);
    }
}
