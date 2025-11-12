package show;

import person.Actor;
import person.Director;
import person.Person;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    protected int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> actorList, Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, actorList, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return "Opera{" +
                "choirSize=" + choirSize +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", actorList=" + actorList +
                '}';
    }
}
