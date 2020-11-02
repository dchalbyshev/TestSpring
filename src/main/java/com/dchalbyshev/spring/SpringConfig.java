package com.dchalbyshev.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan("com.dchalbyshev")
//@PropertySources("musicPlayer.properties")
@PropertySources(value = {@PropertySource("classpath:/musicPlayer.properties")})

public class SpringConfig {
}
