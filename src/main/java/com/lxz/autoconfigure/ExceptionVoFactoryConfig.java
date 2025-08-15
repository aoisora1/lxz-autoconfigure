package com.lxz.autoconfigure;

import com.lxz.common.exception.ExceptionVoFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExceptionVoFactoryConfig {

    @Bean
    public ExceptionVoFactory exceptionVoFactory(MessageSource messageSource) {
        return new ExceptionVoFactory(messageSource);
    }
}
