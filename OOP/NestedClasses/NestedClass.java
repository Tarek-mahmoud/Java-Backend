
public class NestedClass {

    private int id = 10;
    static int x = 3;
    private static int y = 4;

    public class InnerClass {
        public void print() {
            id = 3;
            System.out.println(id);
            System.out.println(x);
            y= 6;
            System.out.println(y);
        }
    }

    public static class StaticNestedClass {
        public void print() {
            //System.out.println(id); error
            System.out.println(x);
            y= 7;
            System.out.println(y);
        }
    }

    // A nested class is a member of its enclosing class. Non-static nested classes (inner classes) have access to other members of the enclosing class,
    // even if they are declared private. Static nested classes do not have access to other members of the enclosing class.

}
