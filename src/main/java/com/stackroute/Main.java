package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //Injecting movie2 object
        Movie movie2=context.getBean("movie2",Movie.class);
        movie2.display();
        //Injecting movie3 object
        Movie movie3=context.getBean("movie3",Movie.class);
        movie3.display();
        //Checking singleton scope
        System.out.println(movie2==movie3);
        //Injecting movie4 object
        Movie movie4=context.getBean("movie4",Movie.class);
        movie4.display();
        //Injecting movie5 object
        Movie movie5=context.getBean("movie5",Movie.class);
        movie5.display();
        //Checking prototype scope
        System.out.println(movie4==movie5);
    }
}