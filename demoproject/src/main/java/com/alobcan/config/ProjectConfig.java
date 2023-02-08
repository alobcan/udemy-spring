package com.alobcan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.alobcan.beans", "com.alobcan.services", "com.alobcan.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
