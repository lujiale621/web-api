package org.it.web.config;

import org.it.web.component.LocaleResolverm;
import org.it.web.component.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login.html").setViewName("login");
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns(
//                List.of("/","/index.html","/login.html","/login","/index","/login_in","/druid/*","/test"
//                ,"/**/*.css", "/**/*.js", "/**/*.png", "/**/*.jpg",
//                "/**/*.jpeg", "/**/*.gif", "/**/fonts/*", "/**/*.svg"));
//    }

    @Bean
    public LocaleResolver localeResolver(){
        return new LocaleResolverm();
    }
}
