
public class Demo {
    public static void main(String[] args) {
        User user1 = new User();
        System.out.println("id = " + user1.getId());
        System.out.println("counter = " + user1.getCounter());
        System.out.println("====================\n");

        User user2 = new User();
        System.out.println("id = " + user2.getId());
        System.out.println("counter = " + user2.getCounter());
        System.out.println("====================\n");

        System.out.println("user1.getCounter() = " + user1.getCounter());
        System.out.println("====================\n");

        User employee = new Employee();
        employee.doAnyStaticAction();

        User.doAnyStaticAction();
        Employee.doAnyStaticAction();
        System.out.println("===================\n");

    }
}
