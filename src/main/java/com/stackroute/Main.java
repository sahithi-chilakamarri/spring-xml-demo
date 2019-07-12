package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //Object injected using  byName
        Movie movie=context.getBean("movie",Movie.class);
        movie.display();
        //Object injected using constructor-injection
        Movie movie1=context.getBean("movie1",Movie.class);
        movie1.display();
    }
}