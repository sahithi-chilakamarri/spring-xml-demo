package com.stackroute.domain;

public class Movie {
private Actors actor;

    public Movie(Actors actor) {
        this.actor = actor;
    }


    public void display()
    {
        actor.display();
    }
}
