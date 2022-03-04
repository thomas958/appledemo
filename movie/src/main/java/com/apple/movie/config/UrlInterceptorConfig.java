package com.apple.movie.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.apple.movie.interceptor.UrlInterceptor;

@Configuration
public class UrlInterceptorConfig implements WebMvcConfigurer {
	
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(new UrlInterceptor());
        registration.addPathPatterns("/**");                      //所有路径都被拦截
        registration.excludePathPatterns(                         //添加不拦截路径              
                                         "/**/*.html",            //html静态资源
                                         "/**/*.js",              //js静态资源
                                         "/**/*.css",             //css静态资源
                                         "/swagger-ui.html",
                                         "/swagger**/**",
                                         "/swagger-resources/**",
                                         "/webjars/**",
                                         "/v2/**",
                                         "/swagger-resources/**",
                                         "/swagger-ui.html/**"
                                         ); 
    }

}
