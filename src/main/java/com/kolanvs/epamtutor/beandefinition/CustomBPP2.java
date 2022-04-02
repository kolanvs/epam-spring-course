package com.kolanvs.epamtutor.beandefinition;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class CustomBPP2 implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Start2 " + beanName + " BPP2");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("End2 " + beanName + " BPP2");
        return bean;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
