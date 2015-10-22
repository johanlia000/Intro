import java.util.*;

/**
 * Example class to get people in the spirit of GitHub.
 *
 * Try it out yourself! You'll need the Java JDK, or development tools, set up
 * on your computer. Open up a terminal or command prompt in the folder where
 * you saved this file, and run "javac Intro.java" followed by "java Intro" if
 * "javac" didn't produce any errors.
 */
public class Intro {

    /**
     * The "main()" method is where Java knows to start our program.
     */
    public static void main(String[] args) {

        // Makes a list of people!
        // In Java, lists need to know what they hold. This particular list has
        // "String"s. Strings are just collections of text placed between double
        // quotes, "like so."
        List<String> people = new ArrayList<String>() {{
            add("Coach");
            add("Noah");
            add("Michaela");
            add("Clio");
            add("Toucan");
        }};

        // What this does is take each person and print to your terminal the
        // string "Hi person!"
        people.forEach(person -> System.out.println("Hi " + person + "!"));
    }
}
