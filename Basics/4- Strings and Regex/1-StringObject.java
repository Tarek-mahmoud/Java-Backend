package Section6;

// 6.1 String object

import java.util.Arrays;

public class StringObject {
    public static void main(String[] args) {
        String s = " hello ";
        System.out.println("s.length() = " + s.length());   // 7
        System.out.println("s.contains(\"he\") = " + s.contains("he"));     // true
        System.out.println("s.isEmpty() = " + s.isEmpty());     // false

        System.out.println("s.toUpperCase() = " + s.toUpperCase()); // HELLO
        System.out.println("s.toLowerCase() = " + s.toLowerCase()); // hello

        System.out.println("s.startsWith(\"h\") = " + s.startsWith("h"));   // false
        System.out.println("s.endsWith(\"o\") = " + s.endsWith("o"));    // false

        System.out.println("s.replace(\"ll\", \"LL\" = " + s.replace("ll", "LL")); // heLLo
        System.out.println("s.replace(\"hl\" = " + s.replace("hl", "HL")); // hello
        // when the first argument is not found, the original string is returned

        System.out.println("s.trim() = " + s.trim()); // hello
        // trim() method removes white spaces from both ends of the string
        System.out.println("s.length() = " + s.length());
        s.trim();
        System.out.println("s.length() = " + s.length());
        // trim() method does not change the original string, it returns a new string
        String s2 = s.trim();
        System.out.println("s2.length() = " + s2.length());

        System.out.println("s.strip() = " + s.strip()); // hello
        // Both trim() and strip() methods remove white spaces from trailing and leading ends of the string but the difference is that trim() method is unicode awareness that means It removes leading and trailing characters that have a codepoint value less than or equal to U+0020 (the space character in Unicode). On the other hand, strip() method is unicode-aware whitespace stripping method that removes all white spaces from the leading and trailing ends of the string.

        System.out.println("s.stripLeading() = " + s.stripLeading()); // hello
        System.out.println("s.stripTrailing() = " + s.stripTrailing()); // hello

        System.out.println("s.substring(2) = " + s.substring(2));   // ello
        System.out.println("s.substring(1, 3) = " + s.substring(1, 3)); // he

        System.out.println("Arrays.toString(s.getBytes())) = " + Arrays.toString(s.getBytes()));    // [32, 104, 101, 108, 108, 111, 32]
        System.out.println("s.getBytes() = " + s.getBytes());   // [B@1b6d3586
        // toString() method of the byte array object, which does not return the content of the array. Instead, it returns the class name followed by the @ symbol and the hashcode of the array object, which is not human-readable.

        System.out.println("Arrays.toString(s.toCharArray()) = " + Arrays.toString(s.toCharArray())); // [ , h, e, l, l, o,  ]
        System.out.println("s.toCharArray() = " + s.toCharArray()); // [C@4554617c
        // toString() method of the char array object, which does not return the content of the array. Instead, it returns the class name followed by the @ symbol and the hashcode of the array object, which is not human-readable.

        System.out.println("s.charAt(1) = " + s.charAt(1)); // h
        System.out.println("s.indexOf(\"l\") = " + s.indexOf("l")); // 3

        System.out.println("Arrays.toString(s.split(\"e\")) = " + Arrays.toString(s.split("e")));   // [ h, llo ]
        // split() method returns an array of strings after splitting the original string based on the given regular expression.



    }
}

