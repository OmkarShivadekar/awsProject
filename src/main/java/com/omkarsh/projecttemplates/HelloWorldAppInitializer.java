package com.omkarsh.projecttemplates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.omkarsh.configuration.DemoSecurityConfig;

@SpringBootApplication(scanBasePackages={"com"},exclude = {JpaRepositoriesAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class HelloWorldAppInitializer extends SpringBootServletInitializer {

	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(HelloWorldAppInitializer.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldAppInitializer.class, args);
	}
	
	
	
/*    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {
                MvcConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {
                "/"
        };
    }*/

}
