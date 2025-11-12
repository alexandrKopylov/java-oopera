package show;

import person.Actor;
import person.Director;
import person.Person;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    protected Person choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> actorList, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, actorList, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return "Ballet{" +
                "choreographer=" + choreographer +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", actorList=" + actorList +
                '}';
    }
}
