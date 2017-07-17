import polymorphism.Developer;
import polymorphism.People;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------People---------------");
        People people = new People();
        people.setName( "Long" );
        people.introduce();

        System.out.println("--------Dynamic Polymorphism--------");
        People people1 = new Developer();
        people1.introduce();

        System.out.println("-----------------Dev-----------------");
        Developer developer = new Developer();
        developer.introduce();
        System.out.println( "--------Static Polymorphism--------" );
        developer.introduce( "Hello, i'm a developer!" );
        System.out.println("Note that static method cannot be override! It can only be re-declare "
                + "in the "
                + "subclasses with the same \nsignature in drived class. Hence, there is no Dynamic"
                + " Polymorphism with static methods!!!");
        people.staticOverride();
        people1.staticOverride();

    }
}
