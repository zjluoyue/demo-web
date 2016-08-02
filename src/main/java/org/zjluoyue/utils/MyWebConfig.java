package org.zjluoyue.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by zjluoyue on 2016/8/2.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.zjluoyue.controller"})
public class MyWebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setSuffix(".jsp");
        vr.setPrefix("/WEB-INF/views/");
        vr.setViewClass(JstlView.class);

        return vr;
    }
}
