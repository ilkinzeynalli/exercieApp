package com.ilkinzeynalli.exerciseApp.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ WebSecurityConfig.class })
public class Config {
}
