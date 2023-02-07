package com.alobcan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.alobcan.beans", "com.alobcan.services"})
public class ProjectConfig {
}
