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

// ex)
Whole Number Examples : 3, 100000, -2147483649L
Floating Point Examples : 3.14159, 10.0, -0.66666666666666667

// Floating-point numbers are also known as real numbers.

/// Floating-point number Data Types
// Use a floating-point number when we need more precision in calculations
// There are two primitive types in Java for expressing floating-point numbers, the float and the double.
- The double is Java's default type for any decimal or real number.


/// Single and Double Precision
// Precision refers to the format and amount of space occuiped by the relevant type.
// The following shows the width of each of the floating point types and their ranges.
// The ranges are shown in Java's scientific notation, which we show below in blue color.

(Data Type) - (Width in bits) - (Min Value) - (Max Value)
float - 32 - 1.4E-45 - 3.4028235E38
double - 64 - 4.9E-324 - 1.7976931348623157E308

- You can see the e-notation followed by either a positive or negative number.

/// Java's Scientifc Notation
// Scientific notation can be translated into more familiar terms by replacing the 'E' in the number with the phrase 'times 10 to the power of'.

 // 1.4E-45 is the same as 1.4 x 10⁻⁴⁵ and 3.4E38 is the same as 3.4 x 10³⁸

(Data Type) - (Min Value) - (Max Value)
float - 1.4E-45 - 3.4028235E38

- So we can say the minimum value of a float is 1.4 x 10⁻⁴⁵ and its maximum value is approximately 3.4 x 10³⁸.

// Regarding the above, using the double's minimum value shown below, remembering that 10-1 - 0.1 and 10-5 = 0.00001 for example.
// Imagine writing out the double data type's minimum value in decimal format. That would be a lot of zeros after the decimal.

(Data Type) - (Min Value) - (Max Value)
double - 4.9E-324 - 1.7976931348623157E308

// A double when compared to a float can represent both a much smaller decimal value and a much larger decimal value. This is why it's called more precise.
Because it's more precise the double is the default type for floating point numbers.

jshell> System.out.print("Float Value Range(" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
Float Value Range(1.4E-45 to 3.4028235E38)
jshell> System.out.print("Double Value Range(" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");
Double Value Range(4.9E-324 to 1.7976931348623157E308)

jshell> int myIntValue = 5; float myFloatValue = 5; double myDoubleValue = 5;
myIntValue ==> 5
myFloatValue ==> 5.0
myDoubleValue ==> 5.0

/// float and double and numeric literal suffixes
// Important : The double data type is Java's default type for real numbers.
- For example any number with a decimal is a double.
- So 10.5 is a double by default in Java.
- The double data type can be specified as a numeric literal with a suffix of either lowercase 'd', or uppercase 'D', but because doubles are the default in Java the suffix is optional to use.
- The float data type can be specified as a numeric literal with a suffix of lowercase 'f', or uppercase 'F'. This suffix is required if your are assigning a real number to a variable that was declared with a float type.

jshell> myFloatValue = 5f;
myFloatValue ==> 5.0

jshell> myDoubleValue = 5d;
myDoubleValue ==> 5.0

jshell> float myOtherFloatValue = 5.25;
|  Error:
|  incompatible types: possible lossy conversion from double to float
|  float myOtherFloatValue = 5.25;
|                            ^--^
// The reason for the error above is because the double is the default floating point number in Java. Java doesn't like trying to put a double into a float variable type.
In this case the literal value that we typed in (5.25) is being interpreted as a double.

/// Quick Challenge
// Thinking back to casting, how would you do the same for the float to remove the error above?

// My Answer
jshell> float myOtherFloatValue = (float) 5.25;
myOtherFloatValue ==> 5.25

// The above is a way of saying "Yes this is a literal double that's been typed here but we want you to treat it as a float"
// However it's generally not recommended to do so with floats these days. Double is the preferred floating point data type to use. And also it's a lot clearer to do so as the following below;
jshell> float myOtherFloatValue = 5.25f;
myOtherFloatValue ==> 5.25

// The F suffix is to indicate the type rather than explicitly cast it.

/// Certification Exam Pointer
// Not everyone realizes that Java's default data type for a decimal literal is a double, which is larger and more precise than a float.
// Oracle likes to put a similar line of code in its code segments on exam questions, omitting the 'F' suffix. Without a computer to check this statement can look fairly innocuous.
ex) float myOtherfloatValue = 5.25;
The number 5.25 is a double so assigning it to a float will raise an error.
This is a gift question to an exam taker if you can easily spot this compiler error.

/// 정리 ------------
/// 이번 챕터는 "자바에서 소수점이 있는 실수(Real Number)를 다루는 2가지 데이터 타입(float, double)과 실수 연산의 기본 규칙"에 관한 내용임.

/// Float (단정밀도)
크기/ 표현 범위 : 32 bit (소수점 약 6~7자리)
자바의 기본 여부 : 선택
접미사 : f 또는 F (필수)

/// Double (배정밀도)
크기/ 표현 범위 : 64 bit (소수점 약 15~17자리)
자바의 기본 여부 : 실수(Decimal)와 기본(Default) 타입
접미사 : d 또는 D (생략 가능)


/// 핵심
// 소수점 숫자는 기본적으로 double 취급
- 정수영 기본이 int인 것처럼 자바에서 소수점이 붙은 숫자 리터럴(예시 5.25)은 무조건 double 타입으로 인식됨.
// float 변수에 대입할 때 접미사 f가 필수인 이유
- float myValue = 5.25; 라고 적으면 자바는 큰 상자(double)의 데이터를 더 작은 상자(float)에 담으려고 시도하기 때문에 데이터 손실 에러(incompatible types : possible lossy conversation)를 발생시킴.
- 이를 해결하려면 숫자 뒤에 접미사 f를 붙여 5.25f로 적거나, (float) 5.25로 강제 형변환(casting)를 해주어야 함. (실무에서는 주로 접미사 f를 주로 사용)
// 지수 표기법 (E-notation)
- 1.4E-45에서 E-45는 10⁻⁴⁵를 의미함. double는 float보다 훨씬 작은 소수점 아래 숫자부터 거대한 숫자까지 더 정밀하게 표현할 수 있어 실무 및 현대 프로그래밍에서 기본 실수 타입으로 선호됨.
// 자바 시험(OCP) 및 면접 단골 함정
시험에서는 float myFloat = 5.25;처럼 f 접미사를 슬쩍 빼놓은 코드가 자주 등장함. 자바 컴파일러 기준으로는 에러가 발생하는 코드임을 한눈에 파악할 수 있어야 함.

*/
//// Understanding Floating-Point Precision : A practical Challenge in Java ------------------
/*
jshell> int myIntValue = 5; float myFloatValue = 5f; double myDoubleValue = 5d;
myIntValue ==> 5
myFloatValue ==> 5.0
myDoubleValue ==> 5.0

/// Default output for numeric data types

// Whole Number Examples
(Literal Value) -> (Default Output)
5 -> 5
500_000_000_000L -> 500000000000

// Floating Point Examples
(Literal Value) -> (Default Output)
5 -> 5.0
5.000000 -> 5
5f -> 5.0
5d -> 5.0
5e1 -> 50.0
5_000_000.0 -> 5000000.0
50_000_000.0 -> 5.0E7


jshell> myIntValue = 5 / 2;
myIntValue ==> 2  (Because both 5 and 2 are integers the result is an integer value without decimals.)

jshell> myFloatValue = 5f / 2f;
myFloatValue ==> 2.5 (The suffix made these numeric literals into floats -> so Java returns a float.)

jshell> myDoubleValue = 5d / 2d;
myDoubleValue ==> 2.5 (Same as above but as a double)

ex)
jshell> myIntValue = 5 / 3;
myIntValue ==> 1
jshell> myFloatValue = 5f / 3f;
myFloatValue ==> 1.6666666 (Infinite)
jshell> myDoubleValue = 5d / 3d;
myDoubleValue ==> 1.6666666666666667 (16 decimals -> and it shows that a double accurately represents than a float)
jshell> myDoubleValue = 5.00 /3.00;
myDoubleValue ==> 1.6666666666666667 (This has the same result as above because Java will look at the decimal number and assume it's a double.)

jshell> myDoubleValue = 5.00 / 3; (As long as one of the operands is a double, the result will be a double.)
myDoubleValue ==> 1.6666666666666667

jshell> myFloatValue = 5.00 /3f; <= this will not work since you cannot assign a double to a float variable.
|  Error:
|  incompatible types: possible lossy conversion from double to float
|  myFloatValue = 5.00 /3f;
|                 ^------^

/// Why is the double a better choice in most circumstances? 
1) It's actually faster to process on many modern computers
- It's because computers have at the chip level the functionality to actually deal with these double numbers faster than the equivalent float.
2) The Java liberaries that we'll get into later - particularly math functions are often  written to process doubles and not floats and to return the result as a double.
- The creators of Java selected the double because it's more precise and it can handle a larger range of numbers.

/// Quick Challenge
// The objective of this challenge is to convert a given numnber of pounds to kilograms.
Steps
    1) Create a variable with the appropriate type to store the number of pounds that we want to convert into kilograms.
    2) Calculate kilograms using the variable above and store the result in a 2nd appropriately typed variable.
    3) print the result.
Don't forget to use the conversion formula:
    1 pound is equal to 0.45359237 of a kilogram.

// My Answer
jshell> double poundVariable = 5;
poundVariable ==> 5.0
jshell> double kilogramVariable = poundVariable * 0.45359237;
kilogramVariable ==> 2.2679618500000003

// Tim's answer
jshell> double numberOfPounds = 200d;
numberOfPounds ==> 200.0
jshell> double convertedKilograms = numberOfPounds * 0.45359237d;
convertedKilograms ==> 90.718474
jshell> System.out.print("Converted kilograms = " + convertedKilograms);
Converted kilograms = 90.718474


// extra examples
jshell> double pi = 3.1415927d;
pi ==> 3.1415927
jshell> double anotherNumber = 3_000_000.4_567_890d;
anotherNumber ==> 3000000.456789


/// Floating Point Number Precision Tips
In general float and double are great for general floating point operations.
But neither should be used when precise calculations are required - this is due to a limitation with how floating point numbers are stored, and not a Java problem as such.
-> Java has a class called BigDecimal that overcomes this.
(But for general calculations a float or a double will do just fine.)

/// 이번 챕터 요약 -----------------------------------
// 1. 정수 나눗셈 vs 실수 나눗셈
- 정수 연산(5 / 2) : 정수끼리 나누면 소수점 이하를 버리고 정수 결과 2만 남김.
- 실수 연산 (5f / 2f) 또는 (5d / 2d) : 소수점을 포함한 2.5가 정상적으로 산출됨.
- 타입 승격 연산 (5.00 / 3) : 연산 대상 중 하나라도 double (5.00) 이면 전체 결과도 double이 됨.
    -> 5.00 / 3f 의 결과는 double가 되므로 이를 float 변수에 대입하려고 하면 컴파일 에러가 터짐.

// 2. float와 double 정밀도 비교 (5 / 3)
float (5f / 3f)  => 1.666666 ~ : 소수점 아래 약 6~7자리까지 표현 (실질적으로는 무한대로 정밀한 계산 요할 시 불정확할 수 있음)
double (5d / 3d) => 1.66666667 : 소수점 아래 약 15~17자리까지 정밀하게 표현

// 3. 실무에서 double을 주로 사용하는 이유
- 하드웨어 최적화 : 최신 CPU 하드웨어 칩셋은 64비트(double) 부동소수점 연산을 매우 빠르게 처리하도록 설계되어 있음
- 자바 표준 라이브러리 연동 : 자바의 Math 클래스를 비롯한 주요 수학 함수들이 기본적으로 double을 매개변수와 반환값으로 사용함.
- 넓은 범위와 높은 정밀도 : 표현할 수 있는 수의 범위가 훨씬 넓어 계산 오류 위험이 적음.

// 4. 부동소수점 오차와 BigDecimal (중요)
파운드 킬로그램 환산 예제에서 2.2679618500000003처럼 끝자리에 미세한 잔여 숫자가 붙는 현상처럼 컴퓨터가 2진수로 실수를 저장할 때 발생하는 부동소수점 표현 방식의 근본적 한계가 있음.
- 정밀 연산 : 금융(돈 계산), 정밀 측정 등 단 0.0001의 오차도 허용해서는 안되는 분야에서는 float나 double 대신 자바의 BigDecimal 클래스를 반드시 사용해야 함.
- 그 외 일반 연산 및 일반적인 앱 및 소프트웨어 개발은 float나 double를 사용함.
*/

//// Exploring Character (char) and Boolean Primitive Data Types in Java ------------------
/*
/// String Literal Example
jshell> System.out.print("Hello World");

/// Comparing the char to the String
// This table is a quick summary of the differences between the char and the String.
Char
- Holds one and only one character
- Literal enclosed in Single Quotes

String
- Can hold multiple characters
- Literal enclosed in Double Quotes

jshell> char myChar = 'D';
myChar ==> 'D'

jshell> char myChar = 'DD'; <= char only allows us to save only one character for a single variable.
|  Error:
|  unclosed character literal
|  char myChar = 'DD';
|                ^

/// Is there a good use for the char data type in today's computing world?
- One example might be to store the last key pressed by a user in game.
- Another might be to loop programmatically through the letters in an alphabet.

/// char Data Type
// A char occupies two bytes of memory or 16 bits and thus has a width of 16.
- The reason is not because it's a single byte, it is that a char is stored as a 2 byte number similar to the short.
// This number gets mapped to a single character in Java.
- So when you print a char you will see the mapped character, and not the representative number.
- And you can use single quotes and a character literal to assign a value to a char which is much simpler than looking up the representative number.

/// Unicode
// Unicode is an international encoding standard for use with different languages and scripts by each letter, digit or symbol is assigned a unique numeric value that applies across different platforms and programs.
// In the English alphabet we've got the letters A through Z meaning only 26 characters are needed in total to represent the entire English alphabet.
// But other languages need more characters and often a lot more.

// symbl.cc <- unicode site

// If we're to print out D from the unicode;
// On the side it says 	U+0044
jshell> char myUnicode = '\u0044';
myUnicode ==> 'D'

// Also it says HTML : &#68;
jshell> char myDecimalCode = 68;
myDecimalCode ==> 'D'

/// Assigning values to a char variable
// There are three ways to assign a value to a char: Each of these methods represent storing the letter, capital D in memory.
(Assignment type) - (Example Code)
a literal character - char myChar = 'D';
a Unicode value - char myChar = '\u0044'
an integer vcalue char myChar = 68;

/// The char Challenge
// Create three char variables to store the character for the question-mark symbol.
- mySimpleChar should be assigned the literal question-mark character ?.
- myUnicodeChar should be assigned the unicode value for the question-mark ?.
- myDecimalChar should be assigned the decimal value for the question-mark ?.

// My Answer --------
jshell> char mySimpleChar = '?';
mySimpleChar ==> '?'
jshell> char myUnicodeChar = '\u003f'
myUnicodeChar ==> '?'
jshell> char myDecimalChar = 63;
myDecimalChar ==> '?'

// Tim's answer
jshell> char mySimpleChar = '?';
mySimpleChar ==> '?'

jshell> char myUnicodeChar = '\u003f'
myUnicodeChar ==> '?'

jshell> char myDecimalChar = 63;
myDecimalChar ==> '?'

System.out.print("My values are "+ mySimpleChar + myUnicodeChar + myDecimalChar);
My values are ???


/// Boolean Primitive Type
// A boolean value allows for two opposite choices - true or false, yes or no, one or zero.
// In Java terms we've got a boolean primitive type, and it can be set to two values only, either true or false.
// The wrapper for boolean is Boolean with a capital B.

jshell> boolean myTrueBooleanValue = true;
myTrueBooleanValue ==> true

jshell> boolean myFaloseBooleanValue = false;
myFaloseBooleanValue ==> false

jshell> boolean isCustomerOverTwentyOne = true;
isCustomerOverTwentyOne ==> true

/// why would you start your boolean variable name withe the prefix 'is'
Developers will often use the word is - as a prefix for a boolean variable name.
This creates a name that seems to ask a question, which makes reading the code more intuitive.
But other prefixese can be just as vaild.

ex) Here are some example boolean names, such as isMarried and hasChildren, that clearly define what condition is being tested;
- isCustomerOverTwentyOne
- isEligibleForDiscount
- hasValidLicense
- isMarried
- hasChildren

/// 이번챕터 정리 ----------------
/// 이번 챕터는 자바의 기본 데이터 타입 중 단일 문자를 다루는 char와 참/거짓을 다루는 boolean에 관한 내용.
// char (문자형) 핵심 개념
char는 단 하나의 문자만 저장할 수 있는 타입으로 메모리에서 2바이트(16비트)를 차지함. 내부적으로는 유니코드 숫자값으로 변환되어 저장됨.
(구분) - char(문자형) - String(문자열)
저장 용량 - 오직 문자 1개 - 0개 이상의 문자 여러 개
표기법 - 작은따옴표 ('A', '?') - 큰따옴표 ('Hello')
메모리 크기 - 2 bytes(16 bit) - 가변적

// char에 값을 넣는 3가지 방법
유니코드(Unicode) 체계를 지원하므로 동일한 문자를 3가지 표현 방식으로 할당할 수 있음.
- 문자 직접 입력(Literal) : char c1 = '?';
- 유니코드 16진수 (Unicode) : char c2 = '\u003f'; (16진수 코드 앞에 기호 사용)
- 10진수 숫자 (Decimal) : char c3 = 63; (유니코드/ASCII의 10진수 번호 직접 대입)

// boolean (논리형) 핵심 개념
조건이나 상태를 표현할 때 쓰이며 오직 두가지 값만 가질 수 있음.
- 허용되는 값 : true 또는 false (대소문자 엄격 구분, 소문자만 가능)
- 래퍼 클래스 : Boolean

// 실무 네이밍 컨벤션 (변수 이름 짓기 팁)
boolean 변수는 "질문하는 듯한 이름"으로 지어주는 것이 실무에서의 표준 규칙임. 코드 가독성이 획기적으로 올라감.
- is 접두사 : isCustomerOverTwentyOne, isMarried
- has 접두사 : HasVaildLicense, hasChildren
- can 접두사 : canAccessAdminPage

*/
//// Recap of Primitive Types and Introduction to the String Class in Java ---------------------------------------------------------------
/*
/// Recap
/// Java's 8 Primitive Data Types
- Whole number : byte, short, int, long
- Real Number : float, double
- Single character : char
- Boolean value : boolean
// The int and a double are Java's default data types for numeric literals.


 /// Handling Data in Java
 // You'll use the data as the following;
    Java's Primitives (boolean, byte, char, double, float, int, long, short)
    Java's Built-in Classes (Wrappers(Boolean, Byte, Character, etc.), BigDecimal, String)
    Your Classes
    Somebody Else's Classes

=> You'll use Java's primitive data types, Java's built-in classes, and probably some combination of your own custom classes and classes created by other people.

/// What is a String?
// A String is a class that contains a sequence of characters.
ex)
jshell> String myString = "This is a string"; <= also you need to do the capital S for string
myString ==> "This is a string

jshell> System.out.print("myString is equal to " + myString); <= You can also output a string literal and a string variable by using the plus operator. 
myString is equal to This is a string


// When the plus operator follows a string it's technically called the concatenation operator because the text that follows it is concatenated to the previous text and returned as a result of that operation and we can see from the output that the string is now equal to the full text.
ex)
jshell> myString = myString + ", and this is more."
myString ==> "This is a string, and this is more."
jshell> System.out.print("myString is equal to " + myString);
myString is equal to This is a string, and this is more.

// You can also use the string with unicode.
ex)
jshell> myString = "I wish I had \u00241,000,000.00";
myString ==> "I wish I had $1,000,000.00"

/// Executing multiple lines of code in Jshell
// To execute multiple lines of code as a set, in Jshell first start with an opening curly brace and press enter.
jshell> {     /// start with a curly opening brace
   ...>     first_statement;
   ...>     second_statement;
   ...>     third_statement;
   ...> } // end with a curly closing brace
// Jshell will display an alternate prompt as you can see, three dots and a greater than sign. (...>)
// You can add a statement and press enter, until you've added as many statements as you want to run.
// Finally add the closing curly brace, noting that a semicolon is not required after the brace.
// Once you press enter after the closing brace, all of your statements will run in the order you put them.

/// Executing Multiple Statements in Jshell
// There are two ways to execute multiple statements in Jshell.
- Put your statements on a single line.
- Or enclose your statements in a set of curly braces {}.


jshell> {
   ...>     String numberString = "250.55";
   ...>     numberString = numberString + "49.45";
   ...>     System.out.print(numberString);
   ...> }

jshell> String numberString = "250.55"; numberString = numberString + "49.45"; System.out.print(numberString);
numberString ==> "250.55"
numberString ==> "250.5549.45"
250.5549.45 <= also have the same result.
// The result for this is because both are strings(text data type), not a numeric type.


jshell> int myInt = "10"; <= This is because we try to put a string into an int variable.
|  Error:
|  incompatible types: java.lang.String cannot be converted to int
|  int myInt = "10";
|              ^--^


/// String concatenation
// In Java the + symbol is an operator which can mean addition if used for numbers.
But it also means concatenation when applied to a String.
A String + anything else gives us a String as a result, concatenating anything after the String as text to the intial String.

jshell> String lastString = "10"; int myInt = 50;
lastString ==> "10"
myInt ==> 50
jshell> lastString = lastString + myInt; <= Despite using an integer data type it ended up concatenating the integer to the string value.
lastString ==> "1050" <= This is treated as a string because it's a String + anything else

jshell> double doubleNumber = 120.47; lastString = lastString + doubleNumber;
doubleNumber ==> 120.47
lastString ==> "1050120.47" <= the behavior is exactly the same despite it's a double


/// Strings are Immutable
// Immutable means you can't change a String after it's created.
// So in the case of the code we've written the value 120.47 is technically not appended to the current contents of lastString.
    lastString = lastString + doubleNumber;
Instead a new String is created automatically by Java. The new String consists of the previous value of lastString, plus a textual representation of the double value 120.47.
The net result is that our variable, lastString, has the concatenated value. However Java created a new String in the process and the old one will get discarded from meomory automatically.

/// String vs StringBuilder
- The String class is immutable, but can be used much like a primitive data type.
- The StringBuilder class is mutable, meaning it can be changed but does not share the String's special features, such as being able to assign it a String literal or use the plus operator on it.
// Both are classes, but the STring class is in a special category in the Java language.

/// The String
- The String is so intrinsic to the Java language it can be used like a 9th primitive type.
- But it's not a primitive type at all, it's a class.

/// 이번챕터 정리 ----------------
/// 자바의 기본 타입 8가지 재정리, String 클래스의 특징 및 동작 원리
/// 
// 자바의 기본 데이터 타입 8가지 요약
- 정수형 : byte, short, int (정수 리터럴 기본), long
- 실수형 : float, double (실수 리터럴 기본)
- 문자형 : char
- 논리형 : boolean

// String 클래스의 핵심 특징
- 클래스(Class) 타입 : String은 기본 타입(Primitive)이 아닌 객체(Class)임. 그러나 자바에서 워낙 많이 쓰여 기본 타입마냥 편리하게 사용 가능함. (Class이므로 대문자로 시작함)
- 큰따옴표 사용("") : 단일 문자인 char는 작은따옴표(''), 문자열인 String은 큰따옴표("") 사용.

// 문자열 연결(+)과 불변성(Immutability)
- + 연산자의 변신 (Concatenation) : String과 다른 모든 데이터 타입에 + 을 사용하면 덧셈이 아닌 문자열 이어붙이기로 작동하여 결과가 무조건 String으로 출력됨.
    ex)
    "250.55" + "49.45" = "250.5549.45"
    "10"(String) + 50(int) = "1050" (String)
- String은 불변(Immutable) 객체 : 한번 생성된 String 객체의 내부 값은 절대 수정할 수 없음.
    ex)
    lastString = lastString + 120.47; 을 수행할 때 기존 메모리의 값이 바뀌는 것이 아닌 합쳐진 새로운 String 객체를 메모리에 새로 만들고 기존 객체를 버림.

// String vs StringBuilder
String : 불변(Immutable), + 연산 및 큰따옴표 리터럴 사용 가능
StringBuilder : 가변(Mutable), 객체의 내용을 변경하는 메서드를 제공 (문자열을 반복적으로 수정해야 할 때 사용하는 mutable 클래스)

// Jshell 팁 : 여러 문장 한번에 실행하기
- 중괄호 사용 {} : {를 입력하고 Enter를 치면 ...> 모양의 추가 입력창이 뜸. 여러 줄 작성 뒤 }로 닫고 Enter를 누르면 한번에 실행됨.
- 한줄에 작성 : 문자 끝마다 세미콜론(;)을 붙여 한 줄에 이어 써도 동일하게 작동함.

*/

//// Mastering Operators, Operands, and Expressions in Java Programming ---------------------------------------------------------------
/*
/// Operators, Operands and Expressions
/// 
/// What are Operators?
// Operators in Java are special symbols that perform specific operations on one, two, or three operands, and then return a result.

// In the example below we used the addition operator, as well as the multiplication operator.
ex) 
long longTotal = 50000L + 19L * (byteValue + shortValue + intValue);
But there are many other operators in Java.

/// What are Operands?
// 
An operand is a term used to describe any object that is manipulated by an operator.

ex) int myVar 15 + 12;
In the example the plus here is the operator, and 15 and 12 are operands. Variables used instead of literals can also be operands.

ex2)
long longTotal = 50000L + 19L * (byteValue + shortValue + intValue);
In the line above byteValue, shortValue and intValue are operands as are the numeric literals.


/// What are Expressions?
// An expression is formed by combining variables, literals, method return values and operators.
They are a way of forming combining those values to produce a result.

In the line below 15 plus 12 is the expression which returns the value of 27.
ex) int myVar = 15 + 12;

In the statement below byteValue + shortValue + intValue is the expression.
ex) int sumOfThree = byteValue + shortValue + intValue;


/// How many operators are in this code?
ex)
jshell> int result = 1 + 2; // 1 + 2 = 3
result ==> 3
// There's two - the equal operator and the plus operator.

/// What is a Comment?
// Comments are ignored by the computer and are added to a program to help describe something. Comments are there for humans to read.
// We use two forward slashes in front of any code or on a blank line. Anything after the two forward slashes right through to the end of the line is ignored by the computer.
// So aside from describing something about a program, comments can also be used to temporarily disable code.

/// What is the effect of this code on the value in previousResult?

jshell> int previousResult = result;
previousResult ==> 3
jshell> result = result - 1; // 3 - 1 = 2
result ==> 2

// We assigned the result to previousResult, and then we changed the value of result. 
jshell> System.out.print("previousResult = " + previousResult);
previousResult = 3
=> but it didn't affect the previousResult.

/// The + Operator on character data types
// char
- Holds one, and only one character
- Literal enclosed in Single Quotes

// String
- Can hold multiple characters
- Literal enclosed in Double Quotes


/// The + Operator on char
jshell> char firstChar = 'A'; char secondChar = 'B';
firstChar ==> 'A'
secondChar ==> 'B'
jshell> System.out.print(firstChar + secondChar);
131 <= Why??

// Chars are stored as 2 byte numbers in memory.
// When you use the addition operator with chars it is these numbers in memory that get added together.
// The character values don't get concatenated.

// Solution
jshell> System.out.print("" + firstChar + secondChar);
AB <= changed into a string because of concatenation

jshell> result = 2;
result ==> 2

jshell> result = result * 10; // 2 * 10 = 20
result ==> 20

jshell> result = result / 4; // 20 / 4 = 5
result ==> 5

/// The Remainder Operator
// The remainder operator is represented ibn Java by the % sign.
// The remainder operator goes by several other names : modulus, modulo or just plain mod for short.
// The remainder operator returns the remaining value from a division operation.
// If there is no remaining value the result is 0.

// The following is some examples.
(Result) => (Remainder Result) => (Explanation)
10 / 5 = 2 => 10 % 5 = 0 => Ten can be divided evenly by 5, so there is no remainder.
10 / 2 = 5 => 20 % 2 = 0 => Ten can be divided evenly by 2, so there is no remainder.
10 / 3 = 3 => 10 % 3 = 1 => Ten cannot be devided evenly by 3, but we get a 3 from the division which gives us 9 with 1 remaining.
10 / 1 = 10 => 10 % 1 = 0 => Using 1 on the right side of the remainder operate will always give a result of 0.
ex)
jshell> result = 5;
result ==> 5
jshell> result = result % 3; // the remainder of (5 % 3) = 2
result ==> 2


/// Summary of Operators
// All five operators
(Operator) => (Numeric types) => (char) => (boolean) => (String)
+ => Addition => Addition => n/a => Concatenation
- => Subtraction => Subtraction => n/a => n/a
* => Multiplication => Multiplication => n/a => n/a
/ => Division => Division => n/a => n/a
% => Remainder(Modulus) => Remainder(Modulus) => n/a => n/a

// Because the char is stored as a whole number literal, all the operations are applicable to a char.

/// 이번챕터 정리 ----------------
/// 자바의 연산 매커니즘인 연산자, 피연산자, 표현식의 개념과 char 타입의 특이한 연산 방식, 그리고 나머지 연산자(%)의 활용법
// 핵심 용어 정립
- 연산자(Operator) : 특정 연산을 수행하는 기호 (+, -, *, /, %, = 등)
- 피연산자(Operand) : 연산자에 의해 조작되는 값이나 변수 (예: 15 + 12에서 15와 12)
- 표현식(Expression) : 변수, 리터럴, 연산자가 조합되어 하나의 결과값을 만들어내는 코드 식(byteValue + shortValue)
- 주석(Comment): // 뒷부분은 컴파일러가 완전히 무시되며 설명 작성이나 코드 임시 비활성화용으로 사용

// char 타입 연산 시 주의점
char는 내부적으로 2바이트 정수 (유니코드 값)으로 저장됨. 따라서 char끼리 더하면 문자가 붙지 않고 숫자 덧셈이 일어남.
ex) 'A' + 'B' = 131 (유니코드 65 + 66)
- 문자열로 이어 붙이는 해결책 : 연산식 맨 앞에 빈 문자열 ("")을 더해주면 자바가 전체를 String으로 인식하여 문자열 연결로 처리함
    ex) "" + 'A' + 'B' = "AB"

// 나머지 연산자 (%, Modulo)
나눗셈 후 남는 나머지 값을 반환하며 짝수/홀수 판별이나 배수 검사 시 자주 사용됨.
- 10 % 5 = 0 (나누어떨어짐)
- 10 % 3 = 1 (10 = 3 x 3 + 1)

// char 타입은 수치형 데이터로 다루어지기 때문에 정수와 동일하게 5가지 사칙연산이 모두 가능하지만 boolean은 연산이 불가능하고 String은 + 연산자만 연결 목적으로 사용할 수 있음

*/
//// Simplifying Java Code : Using Abbreviated Operators for Concise Operations ---------------------------------------------------------------
/*





*/ 