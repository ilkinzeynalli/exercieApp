package com.ilkinzeynalli.exerciseApp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ SwaggerConfig.class ,WebSecurityConfig.class})
public class Config {
}
