package com.middleware.middleware_tec;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.middleware.middleware_tec.resource")
@Configuration
public class Config {


}
