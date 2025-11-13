package person;

import java.util.Objects;

public class Actor extends Person {
    protected  int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }



        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height
                && super.getName().equals(actor.getName())
                && super.getSurname().equals(actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, super.getName(), super.getSurname());
    }

    @Override
    public String toString() {
        return "Актер : " + name + " " + surname + "(" + height + ")";
    }
}
