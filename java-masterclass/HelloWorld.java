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

/// The byte data type
jshell> System.out.print("Byte Value Range (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
    Byte Value Range (-128 to 127)

The minimum value of a byte is -128, the maximum value of a byte is 127.
Given its small range you won't be using the byte data type much.
The byte wrapper class is the Byte with the capital B.

/// The short data type
jshell> System.out.print("Short Value Range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
Short Value Range (-32768 to 32767)

The minimum value of a short is -32768, the maximum value of a short is 32767.
The short upper class is the Short with the capital S.



// Both the byte and the short have the same overflow and underflow issue as the int data type has but obviously with their own range of numbers.


/// Size of Primitive Types and Width
// Size or Width is the amount of space that determines (or limits) the range of values we've been discussing:
(Data Type) - (Width (in bits)) - (Min Value) - (Max Value)
byte - 8 - -128 - 127
short - 16 - -32768 - 32767
int - 32 - -2147483648 - 2147483647

A byte can store 256 numbers and occupies eight bits, and has a width of 8.
A short can store a large range of numbers and occupies 16 bits and has a width of 16.
An int has a much larger range as we know and occupies 32 bits and has a width of 32.

/// Using a numeric literal character suffix
The number 100 by default is an int.
Java allows certain numeric literals to have a suffix appended to the value to force it to be a different data type from the default type.
The long is one of these types and its suffix is an `L`.
This is one of the few instances Java is not case sensitive, a lowercase `I` or an uppercase `L` at the end of a whole number mean the same thing - the number is a long.

jshell> long myLongValue = 100L;
    myLongValue ==> 100
jshell> System.out.print("A long has a width of " + Long.SIZE);
    A long has a width of 64
jshell> System.out.print("Long Value Range (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");
    Long Value Range (-9223372036854775808 to 9223372036854775807)

The long data type has a pretty bigger range than other data types

jshell> long bigLongLiteralValue = 2_147_483_647;
    bigLongLiteralValue ==> 2147483647

jshell> long bigLongLiteralValue = 2_147_483_647_234;
|  Error:
|  integer number too large
|  long bigLongLiteralValue = 2_147_483_647_234;

jshell> long bigLongLiteralValue = 2_147_483_647_234L; <= this will not cause an error.
    bigLongLiteralValue ==> 2147483647234

A numeric literal that exceeds Integer.MAX_VALUE must use the `L` suffix.
We cannot create a numeric literal in Java that exceeds Integer.MAX_VALUE without using the `L` suffix, we'll always get the error `integer number too large`

jshell> short bigShortLiteralValue = 32768;
|  Error:
|  incompatible types: possible lossy conversion from int to short
|  short bigShortLiteralValue = 32768;
|                               ^---^

jshell> short bigShortLiteralValue = 32767;
bigShortLiteralValue ==> 32767

*/
//// 지금까지 내용 정리
/*

/// JShell란?
// Java 코드를 한 줄씩 바로 테스트할 수 있는 도구. 자바 연습장 느낌임 (JS의 브라우저 콘솔과 비슷한 역할)
터미널에서 jshell 입력 -> 바로 Java 코드 테스트 가능
/list -> 지금까지 입력한 코드 목록
/vars -> 선언된 변수 목록
/exit -> 종료 (/ex)
코드를 다 안치면 ...>가 뜨며 입력 대기

/// Javascript와의 차이점
// JavaScript
출력 : console.log("Hello")
변수선언 : let x = 5
타입 : 자동(동적)
따옴표 : '' "" 둘다 가능

// Java
출력 : System.out.print("Hello")
변수선언 : int x = 5
타입 : 수동(정적) 즉 직접 써야 함
따옴표 : ""만 가능 (''는 문자 하나만 가능 string용)


/// 변수선언 규칙
int myFirstNumber = 5;  // 선언 (타입 + 이름 + 값)
myFirstNumber = 10;     // 재할당 (타입 없이)
int myFirstNumber = 10; // ❌ 재선언 불가! (JS와 다른 점)

Java는 int, long, boolean 등 타입 이름을 씀. (JS의 const let)

/// 정수 데이터 타입 4종류
byte - 8 bit - -128 ~ 127 - 가장 작은 정수
short - 16 bit - -32,768 ~ 32,767 - 작은 범위의 정수
int - 32 bit - 약 -21억 ~ 21억 - 자바 정수 계산의 기본 타입
long - 64 bit - 약 -920경 ~ 920경 - 매우 큰 정수용(숫자 뒤 L 필수)

/// 자바 정수 다룰 때의 핵심 규칙
// long 타입은 숫자 뒤에 L 필수 : 자바는 입력된 모든 정수를 기본적으로 int로 간주함. 따라서 int범위를 넘어선 큰 숫자를 쓸 때는 접미사 L을 붙여야 에러(integer number too large)가 나지 않음.
// 가독성을 위한 언더바(_) 지원 : 자바에서는 숫자 안에 콤마(,)를 쓸 수 없는 대신, 2_147_483_647처럼 언더바(_)를 써서 천 단위 자릿수를 편하게 읽을 수 있음.
// 오버프로우(Overflow)와 언더플로우(Underflow) : 정수 타입이 표현할 수 있는 최댓값을 넘어가면 에러 없이 최솟값으로 되돌아가고(Overflow), 반대로 최솟값보다 작아지면 최댓값으로 되돌아가는 현상(Wraparound)이 발생함.
// 대소문자 엄격 구분 : 변수명(myLastOne vs MyLastOne)과 자바 키워드 (int VS Int) 모두 대소문자가 다르면 완전히 다른 것으로 인식함.

/// 래퍼 클래스(Wrapper Class)와 JShell 활용
// 래퍼 클래스 : int -> Integer, long -> Long 처럼 기본 데이터 타입을 감싸서 객체로 다룰 수 있게 해줌. Integer.MAX_VALUE나 Integer.MIN_VALUE처럼 해당 타입의 최대/최솟값을 확인받을 때 유용함.
// JShell 유용한 명령어 : /vars를 입력하면 현재 세션에 선언된 모든 변수와 그 안에 들어있는 값을 한 눈에 확인할 수 있음.

*/


//// Understanding and Using Casting with Numeric Primitive Types in Java ------------------
/*
/// Rules for declaring multiple variables in one statement

jshell> short myMinShortValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE;
myMinShortValue ==> -32768
myMinIntValue ==> -2147483648

jshell> byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
myMinByteValue ==> -128
myMaxByteValue ==> 127

// You cannot declare variables with different data types in a single statement.
// If you declare multiple variables of the same data ttype in a single statement, you must specify the data type only once before any variable names.

ex)
jshell> short firstshort = 1; int firstInteger = 2;
firstshort ==> 1
firstInteger ==> 2

jshell> byte firstByte = 1, secondByte = 2;
firstByte ==> 1
secondByte ==> 2

/// Assigning expressions to varaibles with data types that don't match


// The Java compiler does not attempt to evaluate the value in a variable when it's used in a calculation, so it doesn't know if the value fits and throws an error.
ex) byte myNewByteValue = (myMinByteValue / 2);
jshell> byte myNewByteValue = (myMinByteValue / 2);
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte myNewByteValue = (myMinByteValue / 2);
|                         ^----------------^

// if your calculation uses literal values, Java can figure out the end result at compile time and whether it fits into the variable and won't throw an error if it does.
ex) byte myNewByteValue = (-128 / 2);

// In both examples an int result is being returned from the calculation but in the second example Java knows the returned value can fit into a byte.


/// Casting in Java
// Casting means to treat or convert a number from one type to another. We put the type we weant the number to be in parentheses like this;
ex) (byte) (myMinByteValue /2);
jshell> byte myNewByteValue = (byte) (myMinByteValue / 2);
myNewByteValue ==> -64

ex2)
jshell> short myNewShortValue = (myMinShortValue / 2);
|  Error:
|  incompatible types: possible lossy conversion from int to short
|  short myNewShortValue = (myMinShortValue / 2);
|                           ^-----------------^

jshell> short myNewShortValue = (short) (myMinShortValue / 2);
myNewShortValue ==> -16384


/// What does it mean when Java defualts the data type to an int?
// This statement works because the result is an int, and assigning it to an int variable is fine;
ex) int myTotal = (myMinIntValue / 2);

// This statement doesn't work because the expression (myMinShortValue / 2) is an int and an int can't be assigned to a short because the compiler won't guess the resuit.
ex) short myNewShortValue = (myMinShortValue / 2);

// This statement works because the result of (-128/2) is an int, but when calculations use only literal values the compiler can determine the result immediately and knows the value fits into a short.
ex) short myNewShortValue = (short) (myMinShortValue / 2);


/// 개인용 ---------------------
/// 한줄에 여러 변수 선언하는 규칙
// 같은 타입인 경우 : 데이터 타입을 맨 앞에 한 번만 적고 쉼표(,)로 이어 붙일 수 있음.
ex) byte firstByte = 1, secondByte = 2;

// 다른 타입인 경우 : 데이터 타입을 한번만 적고 쉼표로 잇는 것은 불가능하며, 타입을 따로 적고 세미콜론(;)으로 구분해야 함.
ex) short firstshort = 1; int firstInteger = 2;

/// byte / 2를 했는데 에러가 나는 이유 (Java의 int 기본 법칙)
자바는 정수끼리 연산(나누기, 더하기 등)을 할 때 결과값을 무조건 int 타입으로 변환해서 처리함.
// 변수가 포함된 연산 (myMinByteValue / 2);
- 컴파일러는 실행 전까지 변수에 들어있는 값을 계산해 보지 않음. 자바는 단순 연산 결과(int)
를 더 작은 상자인 byte에 넣으려고 하니 데이터 손실 가능성 에러(possible lossy conversation)를 리턴함.
// 숫자 그대로 적은 연산 (-128 / 2);
- 변수 없이 숫자만 적힌 리터럴 연산은 컴파일러가 미리 계산해 봄. 결과인 -64가 byte 범위 (-128, 127)에 잘 들어가므로 에러를 내지 않음.

/// 해결책 : 강제 형변환 (Casting)
연산 결과로 튀어나온 int 값을 byte나 short 변수에 억지로 집어넣으려면 개발자가 직접 괄호 안에 원하는 타입 (byte)을 명시해서 "내가 확인했으니 강제로 타입을 줄여라"라고 지시해야 됨.
ex) 에러코드
byte myNewByteValue = (myMinByteValue / 2); // Error! (int를 byte에 못 넣음)

ex) 형변환(Casting) 적용 코드
byte myNewByteValue = (byte) (myMinByteValue / 2); // 정상 작동 (-64)
short myNewShortValue = (short) (myMinShortValue / 2); // 정상 작동 (-16384)

/// 결론
// Java에서 byte나 short를 연산하면 결과는 무조건 int가 됨.
// int로 변한 결과를 다시 byte나 short에 담고 싶으면 앞에 (byte), (short)를 붙여서 강제 형변환(Casting)을 해줘야 함.

*/

//// Primitive Types Challenge : Applying Your Knowledge of Integer Variables ------------------
/*
/// Primitive Types Challenge
// Your Challenge is to create four new variables;
- A byte variable : set it to any vaild byte number
- A short variable : set it to any vaild short number
- An int variable : set it to any vaild integer number
- Lastly create a variable of type long. Make it equal to 50,000 plus 10 times the sum of the values of the first 3 variables (your byte, your short and your int values). 
In other words use the variable names in your expression to calculate the sum.

/// My Answer ----------------------
jshell> byte byteTest = 10
byteTest ==> 10
jshell> short shortTest = 10_000
shortTest ==> 10000
jshell> int intTest = 100_000_000
intTest ==> 100000000
jshell> /list

   1 : byte byteTest = 10;
   2 : short shortTest = 10_000;
   3 : int intTest = 100_000_000;

jshell> long longTest = 50000 + 10 * (byteTest + shortTest + intTest)
longTest ==> 1000150100
jshell> /list

   1 : byte byteTest = 10;
   2 : short shortTest = 10_000;
   3 : int intTest = 100_000_000;
   4 : long longTest = 50000 + 10 * (byteTest + shortTest + intTest);

/// Tim's answer ------------------
jshell> byte byteValue = 10;
byteValue ==> 10

jshell> short shortValue = 20;
shortValue ==> 20

jshell> int intValue = 50;
intValue ==> 50

jshell> long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
longTotal ==> 50800

jshell> int sumOfThree = byteValue + shortValue + intValue;
sumOfThree ==> 80

jshell> longTotal = 50000L + (10* sumOfThree);
longTotal ==> 50800

/// Using Parentheses
// Parentheses are another way to make your code more readable.
ex) longTotal = 50000L + (10 * sumOfThree);
// They also make it clear which calculation should be done first.

/// What if we want to do the same thing but with short
/// 
jshell> short shortTotal = (1000 + 10 * (byteValue + shortValue + intValue));
|  Error:
|  incompatible types: possible lossy conversion from int to short
|  short shortTotal = (1000 + 10 * (byteValue + shortValue + intValue));
|                      ^---------------------------------------------^

jshell> short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
shortTotal ==> 1800

*/

//// Working with Float and Double : Precision in Floating Point Numbers ------------------
/*
/// Floating-point Numbers
// unlike whole numbers, floating-point numbers have fractional partst hat we express with a decimal point.



*/