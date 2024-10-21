
/*
    The Object class provides multiple methods which are as follows:
      - toString() method
      - equals() method()
      - hashCode() method
      - getClass() method
      - finalize() method
      - clone() method
      - wait(), notify(), notifyAll() methods
 */


public class ObjectClass {
    public static void main(String[] args) {

        // 1. toString() method
        //  Whenever we try to print any Object reference, then internally toString() method is called.

        Test1 t1 = new Test1();
        System.out.println(t1);
        System.out.println(t1.toString());
        System.out.println();

        Test2 t2 = new Test2();
        System.out.println(t2);
        System.out.println(t2.toString());
        System.out.println();



        // 2. hashCode() method

        /*
            For every object, JVM generates a unique number which is a hashcode. It returns distinct integers for distinct objects.
            A common misconception about this method is that the hashCode() method returns the address of the object, which is not correct.
            It converts the internal address of the object to an integer by using an algorithm. The hashCode() method is native because in Java
            it is impossible to find the address of an object, so it uses native languages like C/C++ to find the address of the object.
         */

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println();

        // 3. equals(Object obj) method
        System.out.println(t1.equals(t2));
        // after editing hashcode value to 1
        System.out.println(t1.equals(t2));
        Test2 t3 = new Test2();
        System.out.println(t3.equals(t2));
        t3 = t2;
        System.out.println(t3.equals(t2));
        System.out.println();


        // 4. getClass() method
        System.out.println(t3.getClass());
        
    }
}

class Test1 {
    @Override
    public int hashCode() {
        return 1;
    }
}

class Test2 {
    @Override
    public String toString() {
        return "Test2";
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
