package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private Actors actor;
    //default constructor
    public Movie() {
    }
    //parameterized constructor
    public Movie(Actors actor) {
        this.actor = actor;
    }

    public void setActor(Actors actor) {

        this.actor = actor;
    }
    public void display()
    {
        actor.display();
    }

    public Actors getActor() {
        return actor;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Created using BeanFactoryAware" );
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Created using BeanNameAware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("created using ApplicationContextAware");
    }
}
