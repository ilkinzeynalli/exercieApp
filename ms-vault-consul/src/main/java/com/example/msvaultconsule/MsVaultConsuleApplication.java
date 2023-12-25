package com.example.msvaultconsule;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class MsVaultConsuleApplication implements CommandLineRunner {

    @Value("${ilkin.deneme}")
    private String deneme2;

    public static void main(String[] args) {
        SpringApplication.run(MsVaultConsuleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(deneme2);

    }
}