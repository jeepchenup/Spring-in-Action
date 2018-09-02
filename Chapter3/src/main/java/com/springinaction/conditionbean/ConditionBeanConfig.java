package com.springinaction.conditionbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("/conditionbean.properties")
public class ConditionBeanConfig {

    @Bean
    @Conditional(MagicExistCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }
}
