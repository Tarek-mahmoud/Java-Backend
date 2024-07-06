package Section6;

// 6.6 Regular expression

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpression {
    public static void main(String[] args) {

        // Regular expression is a sequence of characters that define a search pattern.

        Pattern pattern = Pattern.compile(".s");
        Matcher m = pattern.matcher("as");
        boolean b1 =  m.matches();
        System.out.println(b1);

        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        System.out.println(b2);

        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b3);
        System.out.println();


        // Regular Expression . Example
        System.out.println(Pattern.matches(".s", "as"));    // true => second char is s
        System.out.println(Pattern.matches(".s", "mk"));    // false => second char is not s
        System.out.println(Pattern.matches(".s", "mst"));   // false => has more than 2 char
        System.out.println(Pattern.matches(".s", "amms"));  // false => has more than 2 char
        System.out.println(Pattern.matches("..s", "mas"));  // true => third character is s
        System.out.println();

        // Regular Expression Character classes Example
        System.out.println(Pattern.matches("[amn]", "abcd"));   // [amn] => means the input should be either a or m or n
        System.out.println(Pattern.matches("[amn]", "a"));    // true => a is in [amn]
        System.out.println(Pattern.matches("[amn]", "amn"));    // false => has more than one character
        System.out.println(Pattern.matches("[amn]+", "amn"));   // true => has more than one character but all are in [amn]
        System.out.println(Pattern.matches("[amn]+", "amnx"));  // false => x is not in [amn]
        System.out.println(Pattern.matches("[amn]", "ammmna"));   // false => has more than one character
        System.out.println(Pattern.matches("[amn]+", "ammmna"));  // true => has more than one character
        System.out.println();


        // Regex Quantifiers
        /*
            X?  -   X occurs once or not at all
                Examples:
                    note: dot(.) means any char except new line including space
                    Pattern.matches(".?s", "as") => true => first char is any char, second char is s
                    Pattern.matches("d?s", "as") => true => first char is d or any char, second char is s
                    Pattern.matches(".?s", "mns") => false => has more than 2 char
                    Pattern.matches(".?s", "mms") => false => x should occur once or not at all
                    Pattern.matches(".?s", "s") => true => first char is any char or not at all, second char is s
                    Pattern.matches("t?s)", "s") => true => first char is t or not at all, second char is s

            X+  -   X occurs (at least once) or more times
                examples:
                    Pattern.matches(".+s", "as") => true => second char is 's'
                    Pattern.matches(".+s", "mms") => true => second char is 's'
                    Pattern.matches(".+s", "mns") => true => second char is s
                    Pattern.matches(".+s", "mnagrfdsfs") => true => second char after any char is s
                    note: dot(.)+ means one or more of any character. So, it will match any string that has at least one character before s

                    Pattern.matches(".+s", "mst") => false => has more than 2 char
                    Pattern.matches(".s+", "mas") => // false => has more than 1 char before 's'
                    Pattern.matches(".s+", "mass")  => // false => there is more than one char before 's'
                    Pattern.matches(".s+", "mss")   => // true => first char is any char, second char is s
                    Pattern.matches(".s+", "mssn")  => // false => there is a char after 's'

                    Pattern.matches(".s"+, "mas") => // error => invalid escape sequence
                    Pattern.matches("[.s]+", "dss") => // true => first char is any char, second char is s
                    Pattern.matches("[.s]+", "gfdsjnds) => // true => any char or 's'

            X*  -   X occurs zero or more times
                Examples:
                    Pattern.matches("d*s", "as") => true => d occurs zero times, s occurs once
                    Pattern.matches("d*s", "ds") => true => d occurs once, s occurs once
                    Pattern.matches("d*s", "s") => true => d occurs zero times, s occurs once

                    Pattern.matches(".*s", "as") => true => any char occurs zero or more times, s occurs once
                    Pattern.matches(".*s", "s") => true => any char occurs zero or more times, s occurs once

                   Pattern.matches(".*+s", "as") => // error => Dangling meta character '*' or '+'

                   pattern.matches("[.s]*", "ads") => // true => any char or s occurs zero or more times
                   Pattern.matches("[.s]*", "adsbfgh") => // true => any char or s occurs zero or more times


            X{n}    -   X occurs n times only
                Examples:
                    Pattern.matches("d{0}s", "as") => false => d occurs zero times, s occurs once
                    Pattern.matches("d{0}s", "s") => true => d occurs zero times, s occurs once
                    Pattern.matches("d{1}s", "ds") => true => d occurs once, s occurs once
                    Pattern.matches("d{1}s", "dds") => false => d occurs more than once

                    Pattern.matches("ds{1}", "ds") => false => s occurs once, d occurs once
                    Pattern.matches("ds{1}", "dss") => false => s occurs more than once

                    Pattern.matches(".{1}s", "ds") => true => first char is any char, second char is s
                    Pattern.matches(".{1}s", "dds") => false => .{1} means only one char, but there are two chars

                    Pattern.matches(".s{1}", "dds") => false => .s{1} means any char, s occurs once, but . occurs more than once
                    Pattern.matches(".s{1}", "ds") => true => .s{1} means any char, s occurs once, but . occurs once

                    Pattern.matches("[.s]{1}", "ds") => false
                    // square brackets [.s] define a character class that matches exactly one character which can either be a literal dot . or an 's'
                    Pattern.matches("[.s]{1}", "d") => false => has only one char but not in [.s]
                    Pattern.matches("[.s]{1}", "s") => true => has only one char and it is in [.s]
                    Pattern.matches("[.s]{1}", ".") => true => has only one char and it is in [.s]
                    Pattern.matches("[.s]{1}", ".s") => false => has more than one char


            X{n,}   -   X occurs n or more times
                Examples:
                    Pattern.matches("[.s]{1,}", ".s") => true => has at least one char and it is in [.s]

            X{n,m}  -   X occurs at least n times but less than m times
                Examples:
                    Pattern.matches("[.s]{1,2}", ".s") => true => has at least one char and it is in [.s]
                    Pattern.matches("[.sd]{1,2}", ".sd") => false => has more than 2 char
        */



        // Regular Expression Metacharacters
        /*
            .   -   Any character (may or may not match terminator)
                Examples:
                    Pattern.matches(".s", "as") => true => first char is any char, second char is s
                    Pattern.matches(".s", "mk") => false => second char is not s
                    Pattern.matches(".s", "mst") => false => has more than 2 char
                    Pattern.matches(".s", "amms") => false => has more than 2 char
                    Pattern.matches("..s", "mas") => true => third character is s

            \d  -   Any digit, short for [0-9]
                Examples:
                    Pattern.matches("\\d", "1") => true => 1 is a digit
                    Pattern.matches("\\d", "a") => false => a is not a digit
                    Pattern.matches("\\d", "12") => false => has more than one char
                    Pattern.matches("\\d", "1a") => false => a is not a digit
                    Pattern.matches("\\d+", "12") => true => has more than one char but all are digits
                    Pattern.matches("[\\d]+", "12") => true => has more than one char but all are digits, wrapping it in square brackets doesn't change its meaning

            \D  -   A non-digit, short for [^0-9]
                Examples:
                    Pattern.matches("\\D", "a") => true => a is a non-digit
                    Pattern.matches("\\D", "1") => false => 1 is a digit
                    Pattern.matches("\\D", "1a") => false => has more than one char
                    Pattern.matches("\\D", "12") => false => has more than one char

            \s  -   A whitespace character, short for [ \t\n\x0b\r\f]
                Examples:
                    Pattern.matches("\\s", " ") => true => space is a whitespace character
                    Pattern.matches("\\s", "\t") => true => tab is a whitespace character
                    Pattern.matches("\\s", "\n") => true => new line is a whitespace character
                    Pattern.matches("\\s", "\x0b") => true => \x0b is a whitespace character
                    Pattern.matches("\\s", "\r") => true => \r is a whitespace character
                    Pattern.matches("\\s", "\f") => true => \f is a whitespace character
                    Pattern.matches("\\s", "a") => false => a is not a whitespace character
                    System.out.println(Pattern.matches("[\\d\\s]+", "1 2 3 12 55")); // true => has digits and whitespaces

            \S  -   A non-whitespace character, short for [^\s]
                Examples:
                    Pattern.matches("\\S", "a") => true => a is a non-whitespace character
                    Pattern.matches("\\d\\S", "1a")
                    Pattern.matches("\\d\\S", "1 ")

            \w  -   A word character, short for [a-zA-Z_0-9]
                Examples:
                    Pattern.matches("\\w", "a") => true => a is a word character
                    Pattern.matches("\\w", "A") => true => A is a word character
                    Pattern.matches("\\w", "1") => true => 1 is a word character
                    Pattern.matches("\\w", "12") => false => has more than one char
                    Pattern.matches("\\w", "_") => true => _ is a word character
         */

        // Regular Expression Boundary Matchers
            /*
                ^   -   The beginning of a line
                    Examples:
                        Pattern.matches("^This", "This is a line") => true => This is at the beginning of the line
                        Pattern.matches("^This", "This is a line. This is another line") => true => This is at the beginning of the line
                        Pattern.matches("^This", "This is a line. This is another line. This is the last line") => true => This is at the beginning of the line
                        Pattern.matches("^This", "This is a line. This is another line. This is the last line. This is not the last line") => true => This is at the beginning of the line
                        Pattern.matches("^This", "This is a line. This is another line. This is the last line. This is not the last line. This is the last line") => true => This is at the beginning of the line
                        Pattern.matches("^This", " This is a line") => false => This is not at the beginning of the line

                $   -   The end of a line
                    Examples:
                        Pattern.matches("line$", "This is a line") => true => line is at the end of the line
                        Pattern.matches("line$", "This is a line. This is another line") => true => line is at the end of the line
                        Pattern.matches("line$", "This is a line. This is another line. This is the last line") => true => line is at the end of the line
                        Pattern.matches("line$", "This is a line. This is another line. This is the last line. This is not the last line") => true => line is at the end of the line
                        Pattern.matches("line$", "This is a line. This is another line. This is the last line. This is not the last line. This is the last line") => true => line is at the end of the line
                        Pattern.matches("line$", "This is a line ") => false => line is not at the end of the line

                \b  -   A word boundary
                    Examples:
                        Pattern.matches("\\bThis", "This is a line") => true => This is at the beginning of the line
                        Pattern.matches("\\bThis", "This is a line. This is another line") => true => This is at the beginning of the
             */


        // Example
        String gmailPattern = "[a-zA-Z-\\d]+@gmail.com";
        Pattern pattern1 = Pattern.compile(gmailPattern);
        String sampleText = "Some random text that contains an email address " + "like this one some-email@gmail.com. And some other text like amina@gmail.com.";
        Matcher matches = pattern1.matcher(sampleText);  // Matcher class is used to search for the pattern in the text and return the result.

        matches.find(); // find() method is used to find the pattern in the text. It returns true if the pattern is found, otherwise false.
        String gmailAddress = matches.group();    // group() method is used to get the matched pattern.
        System.out.println(gmailAddress);

        String sampleText2 = "There are three sentences in this string. are you sure? Yes!";
        String[] sentences = sampleText2.split("[\\.!?]");
        System.out.println(Arrays.toString(sentences));


        // another example
        String textPattern = "amina";
        Pattern pattern2 = Pattern.compile("amina", Pattern.CASE_INSENSITIVE | pattern.UNICODE_CASE);
        //UNICODE_CASE flag: Use it together with the CASE_INSENSITIVE flag to also ignore the case of letters outside the English alphabet
        //Pattern pattern2 = Pattern.compile("amina");
        String sampleText3 = "Amina is my love. She is the best. Amina is the best.";
        Matcher match = pattern2.matcher(sampleText3);
        boolean found = match.find();

        if (found) {
            System.out.println(match.group());
        } else {
            System.out.println("Pattern not found");
        }

    }
}