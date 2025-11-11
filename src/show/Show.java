package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;

public class Show {

    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> actorList;

    public Show(String title, int duration, Director director, ArrayList<Actor> actorList) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.actorList = actorList;
    }

    public void printDirector() {
        System.out.println();
        System.out.println("Режисёр : " + director.getName() + " " + director.getSurname());
    }

    public void printActors() {
        System.out.println();
        System.out.println("Список актеров :");
        int count = 0;
        for (Actor actor : actorList) {
            System.out.print(++count + ") " + actor.getName() + " " + actor.getSurname()
                    + "(" + actor.getHeight() + ")");
        }
    }


}
