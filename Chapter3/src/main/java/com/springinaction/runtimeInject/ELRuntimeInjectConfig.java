package com.springinaction.runtimeInject;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@PropertySource("/runtimeInject.properties")
public class ELRuntimeInjectConfig {

}
