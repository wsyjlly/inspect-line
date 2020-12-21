package com.tyjw.inspectline.web.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by TYJW on 2018/1/19.
 */
@Configuration
public class MyWebMvcConfigurerAdapter implements WebMvcConfigurer {

    @Bean
    public MyInterceptor myInterceptor(){
        return new MyInterceptor();
    }
    /**
     * 配置静态访问资源
     * http://localhost:8080/my/1.png可以访问
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/center.html").addResourceLocations("classpath:/page/center.html");
        registry.addResourceHandler("/index.html").addResourceLocations("classpath:/page/index.html");
        registry.addResourceHandler("/map.html").addResourceLocations("classpath:/page/map.html");
        registry.addResourceHandler("/build/**").addResourceLocations("classpath:/page/build/");
        registry.addResourceHandler("/src/**").addResourceLocations("classpath:/page/src/");
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/page/static/");
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    /**
     * 页面跳转
     * <p>
     * 以前写SpringMVC的时候，如果需要访问一个页面，必须要写Controller类，然后再写一个方法跳转到页面,在这里直接配置就可以。
     * 访问http://localhost:8080/toLogin就跳转到login
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    }

    /**
     * 拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor())
                .addPathPatterns("/**")//拦截所有请求
                .excludePathPatterns("/index.html","/map.html","/center.html")//排除拦截的请求
                .excludePathPatterns("/build/**","/src/**","/static/**")//排除拦截的请求
                .excludePathPatterns("/api/user/login")//排除拦截的请求
                .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**");//排除拦截的静态资源
    }
}
