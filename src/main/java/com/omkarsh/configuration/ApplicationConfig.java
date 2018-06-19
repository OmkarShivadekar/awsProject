package com.omkarsh.configuration;

import org.springframework.context.annotation.Configuration;

/**
 * Spring configuration for sample application.
 */
@Configuration
public class ApplicationConfig {

    /**
     * Retrieved from properties file.
     */
    /*@Value("${HelloWorld.SiteName}")
    private String siteName;

    @Bean
    public HelloWorldController helloWorld() {
        return new HelloWorldController(this.siteName);
    }

    *//**
     * Required to inject properties using the 'Value' annotation.
     *//*
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }*/

}
