package com.pubilaweb.mavenWeb.configuracion;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//public class MyWebApplicationInitializer implements WebApplicationInitializer {
//
//    @Override
//    public void onStartup(ServletContext container) {
//    	
//    	System.out.println("Servlet Configuracion  MyWebApplicationInitializer  ,  onStartup. Sustituyes WEB.xml  ");
//   
//    /** 
//     * 	Configuracion  por lectura del springmvc-servlet.xml
//    
//    	XmlWebApplicationContext appContext = new XmlWebApplicationContext();
//    	appContext.setConfigLocation("/WEB-INF/springmvc-servlet.xml");
//    	* 	
//        */ 
//    	
//    	/**
//    	 *  Me funciona el pom.xml sin esta dependencia ....
//    	 * 
//    	 * 				<dependency>
//    					<groupId>javax</groupId>
//    					<artifactId>javaee-web-api</artifactId>
//    					<version>7.0</version>
//					</dependency>
//    	 * 
//    	 */
//        AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
//        appContext.setConfigLocation("com.pubilaweb.mavenWeb.configuracion.AppConfiguracionSpring");
//
//        ServletRegistration.Dynamic registration
//                = container.addServlet("springmvc", new DispatcherServlet(appContext));
//        registration.setLoadOnStartup(1);
//        registration.addMapping("/");
//    }
//}
//
//
//
//
