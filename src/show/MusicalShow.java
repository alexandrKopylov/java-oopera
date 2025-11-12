package show;

import person.Actor;
import person.Director;
import person.Person;

import java.util.ArrayList;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> actorList, Person musicAuthor, String librettoText) {
        super(title, duration, director, actorList);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println();
        System.out.println("Либретто :");
        System.out.println(librettoText);
    }
}
