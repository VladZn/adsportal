package ru.geekbrains.vlad.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author Vladislav Zinchenko
 * 18.12.2018
 */

@EnableWebMvc
@Configuration
@ComponentScan("ru.geekbrains.vlad.controller")
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp()
                .viewClass(JstlView.class)
                .prefix("/WEB-INF/views/")
                .suffix(".jsp");
    }

}
