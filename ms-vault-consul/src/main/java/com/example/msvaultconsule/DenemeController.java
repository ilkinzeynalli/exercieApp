package com.example.msvaultconsule;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DenemeController {

    @Value("${deneme}")
    private String deneme;

    @Value("${ilkin.deneme}")
    private String deneme2;

    @GetMapping("/deneme")
    public void deneme(){

        System.out.println(deneme2);
    }
}
