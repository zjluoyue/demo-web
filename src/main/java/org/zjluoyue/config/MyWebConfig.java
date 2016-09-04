package org.zjluoyue.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.Properties;


/**
 * Created by zjluoyue on 2016/8/2.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.zjluoyue.controller, org.zjluoyue.service"})
@PropertySource(value = {"classpath:freemarker.properties"})
public class MyWebConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private Environment environment;

    /**
     * Configure ViewResolvers to deliver preferred views.
     * @param registry
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {

        // 数据以 json 格式传输
        registry.enableContentNegotiation(new MappingJackson2JsonView());
        // freeMarker 视图解析器
        FreeMarkerViewResolver freeMarkerViewResolver = new FreeMarkerViewResolver();
        freeMarkerViewResolver.setViewClass(FreeMarkerView.class);
        freeMarkerViewResolver.setContentType("text/html; charset=UTF-8");
        freeMarkerViewResolver.setCache(true);
        freeMarkerViewResolver.setSuffix(".ftl");
        freeMarkerViewResolver.setOrder(0);
        registry.viewResolver(freeMarkerViewResolver);
        // jsp 的视图解析器
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setOrder(1);
        registry.viewResolver(viewResolver);
    }

    /**
     * ui freeMarker
     *
     * @return
     */
    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer() {
        FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
        configurer.setTemplateLoaderPath("/WEB-INF/ftl/");
//        configurer.setDefaultEncoding("UTF-8");
        configurer.setFreemarkerSettings(freeMarkerSetting());
        return configurer;
    }

    /**
     * freeMarker 模板setting 的参数设置
     * @return
     */
    private Properties freeMarkerSetting() {
        Properties settings = new Properties();
        settings.put("template_update_delay", environment.getRequiredProperty("template_update_delay"));
        settings.put("template_exception_handler", environment.getRequiredProperty
                ("template_exception_handler"));
        settings.put("default_encoding", environment.getRequiredProperty("default_encoding"));
        settings.put("output_encoding", environment.getRequiredProperty("output_encoding"));
        settings.put("locale", environment.getRequiredProperty("locale"));
        settings.put("date_format", environment.getRequiredProperty("date_format"));
        settings.put("time_format", environment.getRequiredProperty("datetime_format"));
        settings.put("datetime_format", environment.getRequiredProperty("datetime_format"));
        settings.put("tag_syntax", environment.getRequiredProperty("tag_syntax"));
        return settings;
    }

    /**
     * Configure ResourceHandlers to serve static resources like CSS/ Javascript etc...
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
        registry.addResourceHandler("/html/**").addResourceLocations("/html/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/");
    }
}
