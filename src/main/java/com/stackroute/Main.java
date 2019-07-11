package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        //Dependency injection using Application Context
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config file loaded");
        Movie movie1= context.getBean("geethagovindham", Movie.class);
        System.out.println("Created dependencies using application context");
        movie1.display();
        System.out.println(".........");
        
        //Dependency Injection using Bean Factory
        Resource resource = new ClassPathResource("beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Movie movie2 = context.getBean("kuchkuchhotahain", Movie.class);
        System.out.println("Created dependencies using XmlBeanFactory");
        movie2.display();
        System.out.println(".........");

        //Dependency Injection using BeanDefinitionRegistry and BeanDefinitionReader.
        BeanDefinitionRegistry beanDefinitionRegistry = new GenericApplicationContext((DefaultListableBeanFactory) beanFactory);
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions("beans.xml");
        Movie movie3 = beanFactory.getBean("HaseeTohPhasee", Movie.class);
        System.out.println("Created dependencies using BeanDefinitionRegistry and BeanDefinitionReader");
        movie3.display();
        System.out.println("..........");
    }
}
