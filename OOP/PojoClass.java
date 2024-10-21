
public class PojoClass {
    /*
        A POJO must not do the following:
        1. A POJO class must not extend the predefined classes such as HttpServlet, Arrays, Calendar, etc.
        For example, if we write, public class MyClass extends javax.servlet.http.HttpServlet, then the class MyClass can’t be considered as POJO class.
        2. A POJO class should not contain pre-specified annotations. For example, @Retention(RetentionPolicy.RUNTIME) public class MyClass{..} is not a POJO class.
        3. A POJO class can’t implement predefined interfaces. For example public class Test implements javax.ejb.EntityBean { … } can’t be considered as a POJO class.
     */

    //POJO class to represent entity Intern

    // default field
    String name;

    // public field
    public String role;

    // private field
    private double salary;

    // arg-constructor to init fields
    public PojoClass(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }
}
