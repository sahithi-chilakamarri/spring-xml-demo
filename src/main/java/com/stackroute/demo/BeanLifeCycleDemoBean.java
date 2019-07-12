package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("This is the destroy method");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This is used to set the properties");

    }
    public void customInit()
    {
        System.out.println("This is used to iniialization");
    }
    public void customDestroy()
    {
        System.out.println("This is used to destroy");
    }
}
