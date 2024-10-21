
public class User {

    public static final String DEFAULT_USER_GROUP = "customers";

    private static int counter = 0;

    private int id;
    private String name;

    {
        ++counter;
    }

    public static void doAnyStaticAction() {
        System.out.println("Static method in user class is called");
    }

    public int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void setCounter(int counter) {
        User.counter = counter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
