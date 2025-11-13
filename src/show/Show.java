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
        for (int i = 0; i < actorList.size(); i++) {
            System.out.println((i+1) + ") " + actorList.get(i));
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
        int countActor = countActorWithSurname(surname);
        if (countActor == 0) {
            System.out.println("Такого актера нет в спектакле.");
            return;
        }
        if (countActor > 1) {
            System.out.println("В этом спектакле " + countActor + " актера с такой фамилией.");
            System.out.println("Не будем никого менять");
            return;
        }
        for (Actor actor : actorList) {
            if (actor.getSurname().equals(surname)) {
                actorList.remove(actor);
                actorList.add(newActor);
                break;
            }
        }
    }

    private int countActorWithSurname(String surname) {
        int count = 0;
        for (Actor actor : actorList) {
            if (actor.getSurname().equals(surname)) {
                count++;
            }
        }
        return count;
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
