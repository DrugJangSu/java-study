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

// If you use /var on JShell, it will show what variables are available for use

// if you sum up
int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
myTotal ==> 53

// changing the variable
myThirdNumber = myFirstNumber * 2;
myThirdNumber ==> 70
int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
myTotal ==> 117



/// Challenge 
// First create a new variable and call it myLastOne:
- Its data type should be int.
- It should be set to the value of 1000, minus (or less than) the value in the myTotal variable, which we've just taked about in our previous code segment.
// Next, print out the value of the myLastOne variable on the line after you declare it.
- Hint : We need to use another operator that we haven't used in code before, but if you think about this, it should be easy to figure out which operator you need to use.

// My answer
int myLastOne = 1000 - myTotal;
myLastOne ==> 883

*/

/// Java code is case sensitive
// Java code is case sensitive. This includes not only keywords and language syntax, but variable names and data types as well.
// myLastOne is not the same variable as MyLastOne with a capital M.
// int in lowercase, is not the same as Int with the first letter capitalized, or INT all in uppercase etc.

// Keywords need to be in lowercase.
// Variables will always be exactly as you declare them, including capitalization.
// Remember that case matters in Java code.
// The /vars command in JShell can help identify any misspellings if there are any.


//// Exploring Java Primitive Types : Integer Ranges and Wrapper Classes ------------------
/*
/// Java's Primitive Types
// Primitive types are the most basic data types.
// The eight primitive data types in Java are the following;
Whole number : byte, short, int, long
Real number (floating point or decimal) : float, double
Single character : char
Boolean value : boolean

// Integer : a whole number, meaning it doesn't contain a fractional element or a decimal.
There's a specific range of values allowed for the int, which is true for most data types.
What this means is that the allowable range of values is NOT infinite.
There's a defined minimum and maximum value for each numeric data type, meaning you can't assign a number bigger or smaller (outside of that range)

jshell> int myValue = 10000;
myValue ==> 10000

jshell> int myMinIntValue = Integer.MIN_VALUE;
myMinIntValue ==> -2147483648
// This is the minimum value you can assign for an integer.

jshell> int myMaxIntValue = Integer.MAX_VALUE;
myMaxIntValue ==> 2147483647
// This is the maximum value you can assign for an integer.

// Using the + sign in System.out.print
The plus sign +, when used in System.out.print will print different data types together as a single text.

In the example;
System.out.print("Integer Minimum Value = " + myMinIntValue);
We want to print a label before a numeric integer value.
whatever follows the plus sign in System.out.print here is converted to a String by Java, and concatenated to the String before it.

jshell> System.out.print("Integer Minimum Value = " + myMinIntValue);
Integer Minimum Value = -2147483648
System.out.print("Integer Minimum Value = " + Integer.MIN_VALUE);
Integer Minimum Value = -2147483648
jshell> System.out.print("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")" );
Integer Value Range (-2147483648 to 2147483647)

jshell> System.out.print(
   ...> "Integer Value Range ("
   ...> + Integer.MIN_VALUE
   ...> +
   ...> " to "
   ...> +
   ...> Integer.MAX_VALUE 
   ...> +
   ...> ")"
   ...> );
Integer Value Range (-2147483648 to 2147483647)

/// Classes
// A class is a building block for object-oriented programming and allows us to build custom data types.
// Wrapper Classes : The primitive types and their respective wrapper classes are the following
(Primitive - Wrapper Class)
byte - Byte
short - Short
char - Character
int - Integer
long - Long
float - Float
double - Double
boolean - Boolean


/// The Integer Wrapper Class
// In the code we just reviewed, we were able to use MIN_VALUE and MAX_VALUE, on the wrapper class Integer.


/// Overflow and Underflow in Java
jshell> System.out.print("Busted Max value = " + (myMaxIntValue + 1));
Busted Max value = -2147483648
-> This is an overflow.
jshell> System.out.print("Busted Min value = " + (myMinIntValue - 1));
Busted Min value = 2147483647
-> This is an underflow

// If you try and put a value larger than the maximum value into an int, you'll create something called an Overflow situation.
// And similarly if you try to put a value smaller than the minimum value into an int, you cause an Underflow to occur.

These situations are also known as integer wraparounds.
The maximum value when it overflows, wraps around to the minimum value and just continues processing without an error.
The minimum value when it underflows, wraps around to the maximum value and continues processing.

This is not usually the behavior you really want as a developer, and you need to be aware that tghis can happen. So choose the appropriate data type.


An Integer wraparound event either an overflow or underflow, can occur in Java when you are using expressions that are not a simple literal value.
The Java compiler doesn't attempt to evaluate the expression to determine its value so it DOES NOT give you an error.

Here are two more examples that will compile, and result in an overflow.
For the second example, even though we are using numeric literals in the expression, the compiler still won't try to evaluate this expression, and the code will compile resulting in an overflow condition.

int willThisCompile = (Integer.MAX_VALUE + 1);
int willThisCompile = (2147483647 + 1);
    willThisCompile ==> -2147483648


If you assign a numeric literal value to a data type that is outside of the range, the compiler DOEs give you an error. We looked at a similar example previously.

jshell> int myMaxIntTest = 2147483648;
|  Error:
|  integer number too large
|  int myMaxIntTest = 2147483648;
|                     ^

In Java, you cannot put commas in a numeric literal.
For example the following is not vaild syntax.
int myMaxIntTest = 2,147,483,647;
So Java provided an alternative way to improve readability, the underscore.
int myMaxIntTest = 2_147_483_647;
    myMaxIntTest ==> 2147483647

*/

//// Understanding Byte, Short, eand Long Data Types and Ther Width in Java ------------------
/*
/// byte, short, int, long
(Whole number Data Type - Wrapper Class - noteworthy)
byte - Byte - Has the smallest range
short - Short
int - Integer - Java's default data type for whole numbers
long - Long - Has the largest range









*/