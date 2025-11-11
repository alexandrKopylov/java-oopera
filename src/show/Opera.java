package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> actorList, String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, actorList, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
