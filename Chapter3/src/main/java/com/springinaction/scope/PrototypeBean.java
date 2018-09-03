package com.springinaction.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {
    @Override
    public boolean equals(Object obj) {
        System.out.println(this);
        System.out.println(obj);
        return this == obj;
    }
}
