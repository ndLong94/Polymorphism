package polymorphism;

/**
 * Created by LongND14 on 7/17/2017.
 */
public class Developer extends People {

    @Override public void introduce() {
        System.out.println("Hi, i'm an developer!");
    }

    public void introduce(String message){
        System.out.println(message);
    };
    public static void staticOverride(){
        System.out.println("Dev's static message");
    };

}
