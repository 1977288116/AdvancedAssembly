package com.chenjl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/com/chenjl/properties/app.properties")
public class ExpressiveConfig {

    @Autowired
    Environment env;

    @Bean
    public BlankDisc disc() {
        Class<BlankDisc> propertyAsClass = env.getPropertyAsClass("disc.class", BlankDisc.class);
        return new BlankDisc(env.getRequiredProperty("disk.title"), env.getRequiredProperty("disk.artist"));
    }
}
