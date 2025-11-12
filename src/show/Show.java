package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;

public class Show {

    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> actorList;

    public Show(String title, int duration, Director director, ArrayList<Actor> actorList) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.actorList = actorList;
    }

    public void printDirector() {
        System.out.println();
        System.out.println(director);
    }

    public void printActors() {
        System.out.println();
        System.out.println("Список актеров :");
        int count = 0;
        for (Actor actor : actorList) {
            System.out.println(++count + ") " + actor);
        }
    }

    public void addActor(Actor actor) {
        if (actorList.contains(actor)) {
            System.out.println("Такой актер уже добавлен в спектакль.");
            return;
        }
        actorList.add(actor);
    }

    public void replaceActor(Actor newActor, String surname) {
        boolean isReplace = false;
        for (Actor actor : actorList) {
            if (actor.getSurname().equals(surname)) {
                actorList.remove(actor);
                actorList.add(newActor);
                isReplace = true;
                break;
            }
        }
        if (!isReplace) {
            System.out.println("Такого актера нет в спектакле.");
        }
    }

    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", actorList=" + actorList +
                '}';
    }
}
