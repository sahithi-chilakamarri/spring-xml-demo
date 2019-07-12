package com.stackroute.domain;

public class Movie {
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
}
