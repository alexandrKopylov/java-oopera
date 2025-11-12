import person.Actor;
import person.Director;
import person.Gender;
import person.Person;
import show.Ballet;
import show.Opera;
import show.Show;

import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {

        Actor actor1 = new Actor("Вася", "Сидоров", Gender.MALE, 170);
        Actor actor2 = new Actor("Даня", "Стельмин", Gender.MALE, 180);
        Actor actor3 = new Actor("Елена", "Зотова", Gender.FEMALE, 160);

        ArrayList<Actor> list1 = new ArrayList<>();
        ArrayList<Actor> list2 = new ArrayList<>();
        ArrayList<Actor> list3 = new ArrayList<>();

        Director director1 = new Director("Никита", "Михалков", Gender.MALE, 10);
        Director director2 = new Director("Степан", "Режисеров", Gender.MALE, 10);
        Person choreographer = new Person("Федя", "Хореограф", Gender.MALE);
        Person musicAuthor = new Person("Алексей", "Композиторов", Gender.MALE);
        String libretto = "либретто текст";


        Show regular = new Show("Сказка", 30, director1, list1);
        Opera opera = new Opera("opera", 45, director1, list2, musicAuthor, libretto, 10);
        Ballet ballet = new Ballet("balet", 60, director2, list3, musicAuthor, libretto, choreographer);

        regular.addActor(actor1);
        regular.addActor(actor2);
        regular.addActor(actor3);
        regular.printActors();
        regular.printDirector();
        System.out.println(regular);


        opera.addActor(actor1);
        opera.addActor(actor2);
        opera.printActors();
        opera.addActor(actor2);
        opera.replaceActor(actor3, "Сидоров" );
        opera.printActors();
        opera.replaceActor(actor3, "Сидоров" );
        opera.printActors();
        opera.printLibretto();

        ballet.addActor(actor3);
        ballet.printActors();
    }
}
