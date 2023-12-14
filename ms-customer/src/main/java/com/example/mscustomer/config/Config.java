package com.example.mscustomer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({  ModelMapperConfig.class})
public class Config {
}
