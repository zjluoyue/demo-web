package org.zjluoyue.utils;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by zjluoyue on 2016/8/2.
 */
public class MyWebAppInit implements WebApplicationInitializer{
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        /**
         *  采用xml配置servlet容器
         */


        AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
        appContext.register(MyWebConfig.class);
        appContext.setServletContext(servletContext);
        appContext.refresh();

        ServletRegistration.Dynamic registration = servletContext
                .addServlet("dispatcher", new DispatcherServlet(appContext));
        registration.setLoadOnStartup(1);
        registration.addMapping("/demo-web/*");
    }
}
