package com.niit.project.MovieApp;

import com.niit.project.MovieApp.filter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class MovieAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieAppApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean jwtfilter() {
		// add url intercepting here, by using created filter
		FilterRegistrationBean frb = new FilterRegistrationBean();
		frb.setFilter(new JwtFilter()); // defined filter works here on added urls
		frb.addUrlPatterns("");
		return frb;
	}

}
