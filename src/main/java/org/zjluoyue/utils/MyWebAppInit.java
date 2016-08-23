package org.zjluoyue.utils;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



/**
 * Created by zjluoyue on 2016/8/2.
 */
public class MyWebAppInit extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { MyWebConfig.class };
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
