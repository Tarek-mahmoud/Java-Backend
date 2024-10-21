
public class Demo {
    public static void main(String[] args) {

        NestedClass.InnerClass innerClass = new NestedClass().new InnerClass();
        innerClass.print();
        System.out.println();

        NestedClass.StaticNestedClass nestedClass = new NestedClass.StaticNestedClass();
        nestedClass.print();
    }
}
