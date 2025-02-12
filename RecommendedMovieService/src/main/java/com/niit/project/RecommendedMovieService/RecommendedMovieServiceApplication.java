package com.niit.project.RecommendedMovieService;

import com.niit.project.RecommendedMovieService.filter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RecommendedMovieServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecommendedMovieServiceApplication.class, args);
	}


	public FilterRegistrationBean jwtfilter() {
		// add url intercepting here, by using created filter
		FilterRegistrationBean frb = new FilterRegistrationBean();
		frb.setFilter(new JwtFilter()); // defined filter works here on added urls
		frb.addUrlPatterns("/recommended/recommended-movies/*");
		return frb;
	}



}
