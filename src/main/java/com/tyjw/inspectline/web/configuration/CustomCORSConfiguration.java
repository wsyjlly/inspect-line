package com.tyjw.inspectline.web.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CustomCORSConfiguration {
  private CorsConfiguration buildConfig() {
    CorsConfiguration corsConfiguration = new CorsConfiguration();
//    corsConfiguration.addAllowedOrigin("http://localhost:19030");
    corsConfiguration.addAllowedOrigin("http://14.204.73.150:19030");
    corsConfiguration.addAllowedHeader("Content-Type");
    corsConfiguration.addAllowedHeader("u-uid");
    corsConfiguration.addAllowedHeader("u-projectId");
    corsConfiguration.addAllowedHeader("u-version");
    corsConfiguration.addAllowedHeader("u-platform");
    corsConfiguration.addAllowedMethod("*");
      corsConfiguration.setAllowCredentials(true);
     return corsConfiguration;
  }

  @Bean
  public CorsFilter corsFilter() {
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", buildConfig());
    return new CorsFilter(source);
  }
}