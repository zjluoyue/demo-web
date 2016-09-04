package org.zjluoyue.config;


import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



/**
 * Created by zjluoyue on 2016/8/2.
 */
@Order(0)
public class MyWebAppInit extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {
                MyWebConfig.class,      //MVC 配置
                SecurityConfig.class,    //Security 配置
                HibernateConfiguration.class, //
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
