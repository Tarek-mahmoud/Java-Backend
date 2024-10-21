
import java.io.Serializable;

public class JavaBeans implements Serializable {
    /*
    Java Beans are a special type of POJOs. But there are some restrictions on Java beans to become POJO. These restrictions are as follows:

    1. All JavaBeans can be POJOs but all POJO classes can not be Java Beans.

    2. Java Beans should implement the Serializable interface.

    3. All the fields of the Java Beans should be private to provide complete control over the fields.

    4. All the fields should have either getter or setter methods or both of them.

    5. There must be a no-arg constructor in a bean.

    6. We can access the fields only by constructor or getters setters.
     */


    private int id;
    private String name;

    public JavaBeans() {}

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
