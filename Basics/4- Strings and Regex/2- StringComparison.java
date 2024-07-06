package Section6;

// 6.2 String comparison

public class StringComparison {
    public static void main(String[] args) {
        String s1 = " hello ";
        String s2 = "hello";
        System.out.println("s1 == s2: " + (s1 == s2)); // false

        String s3 = "hello";
        String s4 = "hello";
        System.out.println("s3 == s4: " + (s3 == s4)); // true
        System.out.println("s3.equals(s4): " + s3.equals(s4)); // true
        // s3 and s4 are pointing to the same object in the string pool

        String s5 = new String("hello");
        System.out.println("s3 == s5: " + (s3 == s5)); // false   Why? Because s5 is a new object created in the heap memory
        // What is string pool? The string pool is a storage area in the Java Virtual Machine (JVM) that stores strings. When a string is created in Java, it is stored in the string pool. If another string with the same value is created, the JVM will first check the string pool. If the string already exists in the pool, a reference to the existing string will be returned. If the string does not exist in the pool, a new string will be created and added to the pool.
        System.out.println("s3.equals(s5): " + s3.equals(s5)); // true
        System.out.println("s3 == s5.intern(): " + (s3 == s5.intern())); // true
        // intern() method() put the string s5 in the string pool and return the reference to the string in the pool. if the string is already in the pool, it returns the reference to the string in the pool.

        String name1 = "Amina";
        String name2 = "amina";
        System.out.println("name1.equals(name2): " + name1.equals(name2)); // false
        System.out.println("name1.equalsIgnoreCase(name2): " + name1.equalsIgnoreCase(name2));   // true



    }
}