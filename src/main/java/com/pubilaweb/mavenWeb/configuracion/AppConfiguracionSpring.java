package com.pubilaweb.mavenWeb.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 
 * @author andres
 *version  2 ( antes la uno )
 *
 *Utilizaremos esta clase para configurar el Spring .
 *s
 *Sutituye   a  SPRing ( springmvc-servlet.xml )
 *
 *
 */

@Configuration
@ComponentScan(basePackages = {"com.pubilaweb.mavenWeb"})
public class AppConfiguracionSpring {
/**
 * 
 * Implementacion del ViewResolver  .  Hay distintas tecnologias
 * 
 * 
 */
	   @Bean
	    public InternalResourceViewResolver getInternalResourceViewResolver() {
	        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	        resolver.setPrefix("/WEB-INF/views/");
	        resolver.setSuffix(".jsp");
	        return resolver;
	    }
	
	
}
