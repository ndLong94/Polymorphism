package polymorphism;

/**
 * Created by LongND14 on 7/17/2017.
 */
public class People {
    private String name;

    /**
     * Getter for property 'name'.
     *
     * @return Value for property 'name'.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for property 'name'.
     *
     * @param name Value to set for property 'name'.
     */
    public void setName( String name ) {
        this.name = name;
    }

    public void introduce(){
        System.out.println("Hi, my name is " + getName());
    }

    public static void staticOverride(){
        System.out.println("People's static message");
    }
}
