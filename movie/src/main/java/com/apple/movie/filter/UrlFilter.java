package com.apple.movie.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.springframework.stereotype.Component;

@Component
public class UrlFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponseWrapper httpResponse = new HttpServletResponseWrapper((HttpServletResponse) response);
		String path = httpRequest.getRequestURI();
		
		if (path.indexOf("/movie/") > -1 
				|| path.indexOf("/link/") > -1 
				|| path.indexOf("/rating/") > -1 
				||path.indexOf("/tag/") > -1
				||path.indexOf("/swagger-ui.html") > -1 
				||path.indexOf("/swagger") > -1
				||path.indexOf("/webjars/") > -1 
				||path.indexOf("/v2/") > -1 
				|| path.indexOf("/h2-console") > -1) {
			chain.doFilter(request, response);
		} else {
			httpResponse.sendRedirect("/swagger-ui.html");
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
