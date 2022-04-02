package com.kolanvs.epamtutor.beandefinition;

import org.springframework.beans.factory.DisposableBean;

public class DestroyBean implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy bean DOOOOOOOOO!");
    }
}
