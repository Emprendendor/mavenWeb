package com.pubilaweb.mavenWeb.configuracion;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/**
 *  
 * 
 * @author usuario
 *
 *   Extendenmos la clase anotacion Dispacher
 *   version 4 de configuracion del spring por clases
 */
public class MyWebApplicationInitializerInterfase   extends AbstractAnnotationConfigDispatcherServletInitializer {

	    @Override
	    protected Class<?>[] getRootConfigClasses() {
	    	/**   Sobreescrimimos  a null
	    	 * 
	    	 */
	        return null;
	    }

	    @Override
	    protected Class<?>[] getServletConfigClasses() {
	        return new Class[]{ AppConfiguracionSpring.class };
	    }

	    @Override
	    protected String[] getServletMappings() {
	        return new String[]{ "/" };
	    }
	
}
