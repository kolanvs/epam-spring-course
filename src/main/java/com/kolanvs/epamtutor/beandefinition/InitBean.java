package com.kolanvs.epamtutor.beandefinition;

import org.springframework.beans.factory.InitializingBean;

public class InitBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init bean: after properties set");
    }
}
