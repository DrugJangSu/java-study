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


//// Introduction to Variables, Keywords and the Integer (int) Data Type --------------------

/// Keywords
// A Keyword is any one of a number of reserved words, that have a predefined meaning in the Java language.
// In Java syntax, all code is case-sensitive, and this includes keywords. As we'll soon see, an int- all in lowercase, is not the same as Int-with a capital I. Here an int (lowercase) is a keyword in Java.
// boolean, byte, char, double, float, int, long, short => are known as primitive data types.

/// Variables
// Variables are a way to store information in the computer.
// Variables that we define in a program, can be accessed by a name we give them, and the computer does the hard work of figuring out where they get stored in the computer's random access memory- or RAM.

/// Data type
// There are lots of different types of data that we can define for our variables- collectively these are known as data types.
// Some data types are keywords in Java. In later chapters about Object Oriented features in Java - there is a lot of flexibility for creating our own data types. However for now we'll go through primitive data types which are built into the Java language.

/// Declaration Statement
// A declaration statement is used to define a variable by indiciating the data type, and the name, then optionally to set the variable to a specific value.

/// Expressions
// An expression is a coding construct that evaluates to a single value.

/*
jshell> int myFirstNumber = 5; <- this is the declaration statement.
myFirstNumber ==> 5
*/

/// Variable Challenge 1
// Look at creating a new System.out.print below the declaration for myFirstNumber, and to fgure out how to print the value of myFirstNumber variable.
// My answer
/* 
jshell> int myFirstNumber = 5; System.out.print(myFirstNumber);

// result
myFirstNumber ==> 5
5
*/
// basically if you use double quotes - it's a string literal- like the example below.
// System.out.print("myFirstNumber") <- this will only print myFirstNumber, not the actual result that we wanted to have.
// System.out.print(myFirstNumber) <- this will do.
/*
jshell> int myFirstNumber = 5;
myFirstNumber ==> 5

jshell> myFirstNumber = 10; <- this is changing the value in which will have different results when we use the same output
myFirstNumber ==> 10

jshell> System.out.print(myFirstNumber);
10

/// Variable Challenge 2
// Change the value of the existing variable from ten to one thousand, and print the new value out using the System.out.print method as we've done previously.
// My answer;
jshell> myFirstNumber = 1000;
myFirstNumber ==> 1000
jshell> System.out.print(myFirstNumber);
// result
1000
*/

// The Jshell list command (/list)
/*
jshell> /list

   1 : int myFirstNumber = 5;
   2 : myFirstNumber = 10;
   3 : System.out.print(myFirstNumber);
   4 : myFirstNumber = 1000;
   5 : System.out.print(myFirstNumber);

jshell> 

*/
// This J shell command lists all the Java statements you've executed in Jshell.

/// Variable Declarations in Jshell
// By declaring a variable again, we are effectively re-declaring a variable, and in normal Java programming that would not be allowed and would throw an error.
// For now just follow along, knowing that re-declaring a variable for a second, or subsequent time is not allowed, and later in the course we'll see what happens.
// Note that we can assign a value to a variable multiple times in Java, but it's the declaration (which includes the data type) that cannot normally be done a second time for the same variable.

/// Operators
// Java operators, or just operators, perform an operation (hence the term) on a variable or value.
// Addition, Subtraction, Division, and Multiplication are four common ones that I feel sure you're familiar with, but there are lots more operators you will work with as we go through the course.

//// Using Variables in Java Expressions : A Comprehensive Introduction ----------------------
/*
/// Starting out with Expressions
// The expression is the code segmnent that is on the right side of the equals sign in an assignment or declaration statement.

int myFirstNumber = (10 + 5) + (2 * 10);

/// Challenge : Your challenge is to create two additional variables in JShell.
 - One variable called mySecondNumber, which is an int, with a value of 12.
 - And another variable called myThirdNumber, also an int, with a value of 6.
// My answer
jshell> int mySecondNumber = 12; int myThirdNumber = 6;
// result
mySecondNumber ==> 12
myThirdNumber ==> 6




*/