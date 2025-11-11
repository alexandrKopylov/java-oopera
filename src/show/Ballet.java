package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private String choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> actorList, String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, actorList, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
