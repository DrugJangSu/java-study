// Java Masterclass 2025 : 130+ Hours of Expert Lessons
// test
/*
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java 17!");
    }
}
*/
///// Section 3 : First Steps in Java Programming --------------
//// Your First Java Program : Displaying "Hello World" and Basic Error Handling
/* // on the terminal
% jshell
|  Welcome to JShell -- Version 17.0.20
|  For an introduction type: /help intro
jshell> System.out.print("Hello World");
*/

// Challenge - Print out "Hello, Tim"
/*
jshell> System.out.print("Hello, Tim");
Hello, Tim

// ...> is when jshell notices that you haven't fully typed the code, and is waiting for you to finish the code.

jshell> System.out.print("Hello, Tim); // in this case it shows an error.
|  Error:
|  unclosed string literal
|  System.out.print("Hello, Tim);
|                   ^

jshell> System.out.print('Hello Tim'); // This also shows an error.
|  Error:
|  unclosed character literal // Single quotes are used for characters, and unlike python and javascript using it as a string is not allowed
|  System.out.print('Hello Tim');
|                   ^
*/

// The whole point of Jshell is to provide you with a safe place to test code segments

// The key combination.'control d' on a mac (control c on windows) would cancel what you're in the middle of, and get you back to the JShell prompt.
// Also typing forward slash and the word `exit`, or forword slash with the shortcut text ex, will end your JShell session if you get stuck.
// And example would be /exit or /ex


//// Introduction to Variables, Keywords and the Integer (int) Data Type
