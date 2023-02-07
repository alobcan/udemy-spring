package com.alobcan.config;

import com.alobcan.beans.Person;
import com.alobcan.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.alobcan.beans")
public class ProjectConfig {
}
