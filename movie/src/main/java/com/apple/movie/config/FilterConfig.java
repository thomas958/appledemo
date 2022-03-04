package com.apple.movie.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.apple.movie.filter.UrlFilter;

@Configuration
public class FilterConfig {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
    public FilterRegistrationBean registFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new UrlFilter());
        registration.addUrlPatterns("/**");
        registration.setName("UrlFilter");
        registration.setOrder(1);
        return registration;
    }

}
