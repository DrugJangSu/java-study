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
/// Abbreviating Operators

/// Why do we want to use multiple statements in curly braces {}?
// It's a way to group statements together before executing them
// It allows to put statements on multiple lines which is more natural and readable
// We can execute the group of statements as a whole, which more closely resembles running code in Java.

jshell> {
   ...>     int result = 1;
   ...>     result = result + 1;
   ...>     System.out.print("result = " + result);
   ...> }
result = 2

/// Incrementing by One
// Incrementing by one is a very common requirement in programming
Obviously we can do the following; result = result + 1;
// But we also have two other shorthand ways to do the same thing.
(Shorthand (or Abbreviating) Operator) => (Code Sample)
Post-fix Increment Operator => result++;
Compound Assignment Operator with + sign => result += 1;

jshell> {
   ...>     int result = 1;
   ...>     result ++; // <== Post-fix Increment operator
   ...>     System.out.print("result = " + result);
   ...> }
result = 2


/// Decrementing by One
// Decrementing by one is also very common
// We can decrement simply by using the equation;
ex) result = result - 1;
But other two other shorthand ways to do the same thing;
(Shorthand (or Abbreviating) Operator) => (Code Sample)
Post-fix Decrement Operator => result--;
Compound Assignment Operator with - sign => result -= 1;

jshell> {
   ...>     int result = 1;
   ...>     result --; // <== Post-fix Decrement Operator
   ...>     System.out.print("result = " + result);
   ...> }
result = 0

jshell> {
   ...>     int result = 1;
   ...>     result -= 1; // <= Compound Assignment Operator 
   ...>     System.out.print("result = " + result);
   ...> }
result = 0

jshell> {
   ...>     int result = 1;
   ...>     result += 1; 
   ...>     System.out.print("result = " + result);
   ...> }
result = 2

jshell> {
   ...>     int result = 1;
   ...>     result += 5; <= we can decremate or incremate any number
   ...>     System.out.print("result = " + result);
   ...> }
result = 6

/// Quick Challenge
// Initialise an int variable named result to the value of 10 rather than 1.
// Next use the compound assignment operator with the minus sign to subtract a number from result using a value of your choice.
// Print the result out using the System.out.print statement.

// My answer
jshell> {
   ...>     int result = 10;
   ...>     result -= 4;
   ...>     System.out.print("result = " + result);
   ...> }
result = 6

// Tim's answer
jshell> {
   ...>     int result = 10;
   ...>     result -= 7;
   ...>     System.out.print("result = " + result);
   ...> }
result = 3

/// Compound Operator Assignment
// When result is an int the compound operator give a different result from the actual expected output.

jshell> {
   ...>     int result = 10;
   ...>     result -= 5.5;
   ...>     System.out.print("result = " + result);
   ...> }
result = 4

jshell> {
   ...>     int result = 10;
   ...>     result = result - 5.5;
   ...>     System.out.print("result = " + result);
   ...> }
|  Error:
|  incompatible types: possible lossy conversion from double to int
|      result = result - 5.5;
|               ^----------^
jshell> {
   ...>     int result = 10;
   ...>     result = (int) (result - 5.5);
   ...>     System.out.print("result = " + result);
   ...> }
result = 4

// The compound assignment operator x -= y, is often said to be x = x - y, but that's not entirely true if y is not the same data type as x.
// x -= y is really x = (data type of x) (x - y)
-> An implicit cast is done when using this operator so no error occurs, but unexpected results may happen.

// to sum up
result -= 5.5;
was actually
result = (int) (result - 5.5);

jshell> {
   ...>     double result = 10;
   ...>     result -= 5.5;
   ...>     System.out.print("result = " + result);
   ...> }
result = 4.5

jshell> {
   ...>     double result = 10;
   ...>     result *= 1.5; // (also for times)
   ...>     System.out.print("result = " + result);
   ...> }
result = 15.0

jshell> {
   ...>     double result = 10;
   ...>     result /= 1.5; // (also for division)
   ...>     System.out.print("result = " + result);
   ...> }
result = 6.666666666666667

/// Summing up the abbreviating Operators
(Shorthand Operator) => (Code Sample)
Post-fix Increment Operator => result++;
Post-fix Decrement Operator => result--;
Addition Compound Assignment => result += 5;
Subtraction Compound Assignment => result -= 5;
Multiplication Compound Assignment => result *= 5;
Division Compound Assignment => result /= 5;

/// 이번 챕터 요약 -----------------------------
/// 증감 연산자 (++, --)와 복합 대입 연산자(+=, -=, *=, /=), 그리고 그 속에 숨겨진 자동 형변환(Implicit Casting)
/// 단축 연산자 종류 요약
// 증가(Increment)
    ++
    result++;
    result = result + 1;
// 감소(Decrement)
    --
    result--;
    result = result - 1;

// 복합 덧셈
    +=
    result += 5;
    result = result + 5;

// 복합 뺄셈
    -=
    result -= 5;
    result = result - 5;

// 복함 곱셈
    *=
    result *= 5;
    result = result * 5;

// 복합 나눗셈
    /=
    result /= 5;
    result = result / 5;



/// 복합 대입 연산자의 비밀(Compound Assignment)
result += 5;   // result = result + 5;
result -= 3;   // result = result - 3;
result *= 2;   // result = result * 2;
result /= 4;   // result = result / 4;
// 복합 대입 언산자는 코드를 줄여 주어 편리하지만 변수 타입과 다른 소수점 연산을 할 때 자바가 알아서 형변환을 하여 소수점 데이터를 잘라버리는 상황이 생김


/// 암묵적 형변환(Implicit Casting)
복합 대입 연산자에는 자동 형변환이 숨어 있음
int result = 10;
result -= 5.5;          // 에러 없이 실행됨
실제로 자바가 이렇게 처리:
result = (int) (result - 5.5);   // 소수점을 강제로 버림
반면 일반 대입을 쓰면 에러 발생
result = result - 5.5;   // double을 int에 넣을 수 없음

result -= 5.5; → 자동으로 (int) 형변환이 일어남
그래서 에러는 안 나지만 소수점이  Truncate(잘림)
정확한 계산이 필요하면 double 타입을 사용하는 것이 좋음

*/ 
///// Section 4 : Transitioning from Jshell to IntelliJ IDEA : A Comprehensive IDE Guide --------------

/*
//// Embracing the Power of an Integrated Development Environment ---------------------------------------------------------------
/// Why do we need an Integrated Development Environment (IDE)?
// An IDE is the easiest least error-prone way to develop, manage and deploy Java classes. It provides many benefits to developers including:
    - Increased productivity
    - code completion
    - refactoring of code
    - debugging tools
    - version control
    - and team development and etc.

/// What is Intellij?
IntelliJ IDEA is one of several IDEs available for Java.
It's also written in Java developed by JetBrains and simply known as IntelliJ.
JetBrains offer a free and open source community edition.

//// What is an IDE?
/// IDE?
// IDE stands for Integrated Development Environment
And IDE is a program that provides comprehensive facilities to programmers for software development. Think of it as a "Swiss Army Knife" for coding.

/// Key features of an IDE
// Key Features of an IDE
- Code Editor : Write an edit your code with syntax highlighting and auto-completion.
- Debugger : Find and fix errors in your code step-by-step
- Compiler/Interpreter : Run your code directly from the IDE
- Code Navigation : Quickly jump to functions, classes and files.
- Intelligent Code Assistance - Get suggestions, warnings, and automatic fixes.

// Why use an IDE??
- Productivity : Write code faster with smart suggestions.
- Error Detection : Catch mistakes before running your code
- Easy Debugging : Step through code to understand what's happening.
- All-in-one : Everything you need in one place.

/// Some popular IDEs
// Java IDEs
- IntelliJ IDEA : Full-featured programmer's IDE by JetBrains. Supports development in : Java, Python, Kotlin, Ruby, TypeScript, GO, HTML, and more.
- Eclipse : An open-source Java IDE, released as an alternative to NetBeans. Very mature and full-featured.
- Visual Studio code (VS CODE) : VS Code can be used for Java development after installing an extension pack for Java.
- BlueJ : A Java IDE designed for beginners, used in education but also very capable for real projects.


/// IntelliJ IDEA is recommended for this course.

//// Creating Your First IntelliJ Project - "Hello World" Java Code Implementation ---------------------------------------------------------------

/// Naming Items in Java
// Camel case is the practice of capitalising the first letters of words in a name for readability, removing spaces or characters such as underscores between the words. Lower camel case only capitalises the letter of the second and subsequent words. Upper camel case also known as Pascal case, capitalises the first letter of the first word as well.
(Identifier) => (Usage) => (Recommended) => (Example)
Project Name => IntelliJ Field => Upper Camel Case => FirstJavaProject
Class Name => Java element => Upper Camel Case => NewClass
Method Name => Java element => Lower Camel Case => getData
Variable Name => Java element => Lower Camel Case => firstVariable

// It's best to avoid spaces in the project name and best use upperCamelcase.


public class FirstClass {
    public static void main(String[] args) {
        System.out.print("Hello World");
    }
}

//// Understanding IntelliJ Code Structure : Classes, Methods, and Basic Java Syntax ---------------------------------------------------------------


/// Access Modifiers
The public Java keyword is what's called an access modifier.
An access modifier allows us to define which parts of our code, or even someone else's code can access a particular elenemt.

ex) public access modifier
public class FirstClass {
    public static void main(String[] args) {
        System.out.print("Hello World");
    }
}
/// Class Keyword
The class keyword is used to define a class. The class name will be the text following the keyword, so FirstClass in this case.
Notice the left and curly braces, they are used to define the class code block, or class body.
ex) class FirstClass {
}

/// What is a Method
A method is a collection of statements, one or more, that perform an operation.
We'll be using a special method called the main method, that Java looks for when running a program.
It's the entry point for any Java code, and Java looks for this main method to start and run the program.
You can also create your own methods.

/// First IntelliJ Challenge
Instead of printing "Hello World", print "Hello Tim" or Hello whatever you first name is.
// My Answer
public class FirstClass {
    public static void main(String[] args) {
        System.out.print("Hello, Tim");
    }
}

public class FirstClass {
    public static void main(String[] args) {
        System.out.print("Hello, Jong Hyun");
    }
}
package javamasterclass.section4.HelloWorld.src;

public class SecondClass {
    public static void main(String[] args) {
        System.out.print("Hello, Jong Hyun");
    }
}

public class Hello {

    public static void main(String[] args) {
        System.out.print("Hello, Tim");
        System.out.print("Hello World");
    }
}

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Tim"); <== the println will add a blank line after printing the text.
        System.out.print("Hello World");
    }
}


//// Mastering Java's if-then Statement : Conditional Logic for Program Flow Control ---------------------------------------------------------------

/// if-then Statement
The if-then statement is the most basic of all the control flow statements. It tells your program to execute a certain section of code, only if a particular test evaluates to true.
This is known as conditional logic.

/// Conditional Logic
Conditional logic uses specific statements in Java to allow us to check a condition, and execute certain code based on whether that condition (the expression) is true or false.

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Tim");
        boolean isAlien = false; // <==== assignment operator(=)
        if (isAlien == false)
            System.out.println("It is not an alien!");
    }
}

/// Assignment Operator (=)
The assignment operator assigns the value of an expresion, to the variable to the left of the operator.
ex) boolean isAlien = false;

So isAlien is the variable in this case, and it's been set to false which is the value of the expression.

/// Equality Operator (==)
The equality operator tests to see if two operands are considered equal, and returns a boolean value.
ex) if (isAlien == false) {}
So here is Alien is being tested against the value false.

// extra
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if (isAlien == true); // <= if you put a semicolon here, despite the if statement being false the next line will be executed. removing the semicolon will let the code function
            System.out.println("It is not an alien!");

    }
}
// One of the disadvantages of using the if-then statement without a code block is that it's not immediately clear what the code is doing.
ex)
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = true; // assignment operator(=)
        if (isAlien == false)
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
    }
}
// The second print statement gets printed out. The reason for that is without the code block, only the line immediately following the if-then statement is executed.
// All subsequent lines are not considered to be part of the if-then statement.
// The way we deal with this issue is we add a code block which is a better approach.

/// Best Practice Rule - Always use a Code Block for If-Then statements.
ex)
boolean isAlien = true;
if (isAlien == false)
    System.out.println("It is not an alien!");
    System.out.println("And I am scared of aliens");
=> Instead of using the if statement as we can see here, we should instead use a code block.

/// The Code Block
// A code block allows more than one statement to be executed- in other words a block of code.
The format is:
if (expression) {
    // put one or more statements here
}
=> If the expression is true, the code block will be executed. If the expression is false, all code inside the block will be ignored.

ex)
boolean isAlien = false;
if (isAlien == false) {
    System.out.println("It is not an alien!");
    System.out.println("And I am scared of aliens");
}

/// 지금까지의 섹션 요약 -----------------------------------------------------------------------
/// 자바 식별자 명명 규칙 (Naming Conventions)
단어의 첫 글자를 대문자로 처리하는 카멜 케이스(Camel Case) 방식을 사용하며, 프로젝트 이름에 공백은 피하는 것이 좋음
    Project Name => Upper Camel Case(Pascal) => 첫 글자 대문자 => FirstJavaProject
    Class Name => Upper Camel Case (Pascal) => 첫 글자 대문자 => FirstClass, SecondClass
    Method Name => Lower Camel Case => 첫 글자 소문자 이후 대문자 => getData() main()
    Variable Name => Lower Camel Case => 첫 글자 소문자 이후 대문자 => isAlien, myFirstVariable

/// 자바 기본 코드 구조 및 출력 방식
    public (접근 제어자) : 해당 클래스나 메서드에 접근할 수 있는 범위를 지정함
    class 키워드 : 자바 프로그램의 기본 단위인 클래스를 정의하며, 실제 코드는 중괄호 {} 코드 블록 안에 작성함
    main 메서드 : 자바 프로그램이 실행될 때 컴파일러가 가장 먼저 찾는 프로그램의 시작점 (Entry Point) => main 메서드는 자바 프로그램이 실행될 때 JVM이 가장 먼저 찾아서 실행하는 특별한 메서드임. (이 메서드가 없으면 프로그램이 시작되지 않음)
    System.out.print() vs System.out.println():
        print() : 입력한 내용을 출력하고 줄바꿈을 하지 않음
        Println() : 입력한 내용을 출력한 뒤 자동으로 줄바꿈(Enter)을 추가함.

/// 조건문 (if-then)과 연산자 구분
    대입 연산자 (=) : 우변의 값을 좌변의 변수에 젖앙함 (boolean isAlien = false;)
    동등 비교 연산자 (==) : 두 피연산자의 값이 같은지 비교하여 true 또는 false를 반환함 (if (isAlien == false))

/// if-then 작성 시 주의해야 할 2가지 함정과 해결책
    함정 1 : if 문 뒤의 세미콜론 (;) 실수
        if (isAlien == true); 처럼 if 조건절 바로 뒤에 세미콜론을 붙이면 조건문의 실행이 그곳에서 끝남. 이 경우 조건문의 참 거짓 여부와 상관없이 다음 줄의 코드가 무조건 실행됨.

    함정 2 : 중괄호 {} 생략 시 한 줄만 제어
        중괄호 없이 if 문을 작성하면 바로 다음 첫번째 문장만 조건문 내부 코드로 인식함. 그 아래에 있는 두번째 문장부터는 조건문과 상관없이 항상 실행됨.

  =>모범 답안 (Best Practice) : 항상 코드 블록 {}을 사용하기
    문장이 한 줄이어도 if 문에는 항상 중괄호 {}를 사용하는 것이 가독성을 높이고 의도치 않은 버그를 방지하는 자바의 표준 규칙

    ex)
    boolean isAlien = false;
    if (isAlien == false) {
        System.out.println("It is not an alien!");
        System.out.println("And I am scared of aliens");
    }

// 참고로 if문에서 ==false 대신 ! 사용 가능
실제로는 다음과 같이 사용 가능:
    ex)
    if (!isAlien) {     // <= (isAlien == false) 와 동일함
    System.out.println("It is not an alien!");
    }



//// Advanced conditional Logic : Implementing the Logical AND Operator in Java Code ---------------------------------------------------------------

int topScore = 100;
if (topScore == 100) { // <= True
    System.out.println("You got the high score!");
}

int topScore = 100;
if (topScore != 100) { // <= False
    System.out.println("You got the high score!");
}

int topScore = 100;
if (topScore > 100) { // <= False
    System.out.println("You got the high score!");
}

int topScore = 100;
if (topScore >= 100) { // <= True
    System.out.println("You got the high score!");
}

int topScore = 100;
if (topScore < 100) { // <= False
    System.out.println("You got the high score!");
}

int topScore = 100;
if (topScore <= 100) { // <= True
    System.out.println("You got the high score!");
}

int secondTopScore = 60;
if (topScore > secondTopScore && topScore < 100) { // <= True
    System.out.println("Greater than second top score and less than 100.");
}

ex)
int topScore = 80;
if (topScore < 100) { // <= True
    System.out.println("You got the high score!");
}
int secondTopScore = 81;
if (topScore > secondTopScore && topScore < 100) { // <= False
    System.out.println("Greater than second top score and less than 100.");
}

//// Java's Logical OR Operator : Enhancing Conditional Statements for Flexible Code ---------------------------------------------------------------

int secondTopScore = 81;
if ((topScore > secondTopScore) && (topScore < 100)) { <== Adding parentheses makes it easier to understand the code at a glance, plus not affecting the result.
    System.out.println("Greater than second top score and less than 100.");
}

/// The Logical AND operator and the Logical OR operator
// The "and" operator comes in two flavours in Java, as does the "or" operator.
    && is the Logical and which operates on boolean operands - checking if a given condition is true or false.
    The & is a bitwise operator working at the bit level.
    Likewise || is the Logical "or" and again it operates on boolean operands - checking if a given condition is true or false.
    The | is a bitwise operator also working at the bit level.
    However we'll be using the logical operators(&&, ||) the most instead of bitwise operators.

int topScore = 80;
if (topScore < 100) {
    System.out.println("You got the high score!");
}
int secondTopScore = 81;
if ((topScore > secondTopScore) && (topScore < 100)) { // <= False
    System.out.println("Greater than second top score and less than 100.");
}

if ((topScore > 90) || (secondTopScore <= 90)) { // <= True
    System.out.println("Either or both of the conditions are true.");


//// Assignment vs Equality : Avoiding Common Java Operator Errors in IntelliJ ---------------------------------------------------------------
/// Difference Between the Assignment and Equal to Operator
/// Challenge : Find out why the following code will create an error.
int newValue = 50;
if (newValue = 50) {
    System.out.println("This is an error.");
}
// error => java : incompatible types : int cannot be converted to boolean

// My answer
My thoughts of correcting the code is the following;
int newValue = 50;
if (newValue == 50) {
    System.out.println("This is an error.");
}
// The reason for it that newValue is an int in which you cannot change it into a boolean. So we should put the == to check if it's equal or not(boolean)

// Tim's answer
int newValue = 50;
if (newValue == 50) {
    System.out.println("This is true.");
}

/// Another Challenge
// Will the following code work?
boolean isCar = false;
if (isCar = true) {
    System.out.println("This is not supposed to happen.");
}
// My answer : no...?
// Tim's answer
It's assigning the value true to "isCar" and then returning the boolean value to true.
//so... the fixed code will be like below
boolean isCar = false;
if (isCar == true) {
    System.out.println("This is not supposed to happen.");
}

boolean isCar = false;
if (isCar == false) {
    System.out.println("This is not supposed to happen.");
}

boolean isCar = false;
if (!isCar) { // <== This also works.
    System.out.println("This is not supposed to happen.");
}

/// The NOT Operator
// The exclamation mark (!) or NOT operator, is also known as the Logical Complement Operator.
It can be used with a boolean variable to test for the opposite value.
ex)
    boolean isCar = false;
    if (isCar) {}
// In the code above, we are testing if the value in isCar is true - while assigned it to be false.

ex)
    boolean isCar = false;
    if (!isCar) {}
// If we use the NOT operator, we are testing for the opposite value of the car variable. We assigned isCar on the previous line to be false, so !isCar will return true.

// Recommend using the abbreviated form if your variables are booleans for the following reasons;
    - It's much harder to identify the error if you accidentally use an assignment operator.
        -> IntelliJ won't flag this as an error when you're testing a boolean variable so the only way you'll know you made this common mistake is by discovering your program or output isn't what you expected.
    - The code is more concise, and more concise code can often be more readable and understandable.

/// 잠시 요약 정리 ----------------------------------------
/// 고급 조건문 & 논리 연산자 정리

// 비교 연산자
== 같다
!= 다르다
>, >= 크다, 크거나 같다
<, <= 작다, 작거나 같다

// 논리 연산자 (AND, OR)
&& (Logical AND) : "그리고"
    둘다 true여야 전체가 true
    ex)
        if (topScore > secondTopScore && topScore < 100) {
            // 두 조건이 모두 참일 때만 실행됨
        }
|| (Logical OR) : "또는"
    하나라도 true면 전체가 true
    ex)
        if ((topScore > 90) || (secondTopScore <= 90)) {
            // 둘 중 하나라도 참이면 실행
        }
    // 팁 : 조건을 괄호로 감싸주면 가독성이 높아짐

// NOT 연산자(!) : "아니다"
    boolean 값을 반대로 뒤집음
    ex)
        boolean isCar = false;
        if (!isCar) { // isCar가 false일 때 실행 -> 즉 결과값은 True
        System.out.println("This is not supposed to happen.")
        }

// = vs == : 흔한 실수
    = 은 대입 연산자(값을 넣음)
    ==은 동등 비교 연산자(값이 같은지 비교함)

    잘못된 예시(int)
    int newValue = 50;
    if (newValue = 50) {} // 에러 발생
    => int를 boolean으로 변경 불가로 컴파일 에러

    잘못된 예시(boolean)
    boolean isCar = false;
    if (isCar = true) {} // 에러는 나지 않음... 근데
        -> isCar에 true를 대입해버리고 그 결과(true)를 if가 받아서 무조건 실행됨
        -> IntelliJ도 에러를 안 잡아줘서 버그 발견이 어려움

    위 코드를 올바르게 수정하면;
    if (isCar == true) {}
    또는...
    if (isCar) {} // true 확인
    if (!isCar) {} // false 확인

    ==> 그냥 쉽게 말해서, if 조건문 안에서는 항상 == 또는 ! 사용할 것. (int 비교 제외 =, !=, <, > 등)

(추가 설명)
// &&와 ||에도 단축 평가(Short-circuit evaluation)가 존재함
// &&
    if (false && something) {
        // 앞이 false면 뒤쪽은 확인하지 않음
    }

// ||
    if (true || something) {
        // 앞이 true면 뒤쪽은 확인하지 않음
    }

//// Streamlining Code : Implementing Java's Ternary Operator for Concise Conditionals  ---------------------------------------------------------------
/// Ternary Operator
// The ternary operator has three operands. It's the only operator currently in java that does have three.
// Officially Java calls it the conditional operator.
    The structure of this operator is:
    ex)
    operand1 ? operand2 : operand

String makeOfCar = "Volkswagen";
boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
if (isDomestic) {
    System.out.println("This car is domestic to our country.");
}
=> this would not print anything.

// The ternary operator(? :) is a shortcut to assigning one or two values to a variable, depending on a given condition.
    So think of it as a shortcut of the if-then-else statement.

    ex)
    int ageOfClient = 20;
    String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid";
    System.out.println("Our client is" +  ageText);

    => Operand one - ageOfClient >= 18 in this case is the condition we're checkibng. It needs to return true or false.
    => Operand two - "Over Eighteen" is the value to assign to the variable ageText, if the condition above is true.
    => Operand three - "Still a kid" is the value to assign to the variable ageText if the condition above is false.

    ex)
    String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";

    boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        => although you can write a simplier code for this example.
            boolean isDomestic = (makeOfCar != "Volkswagen");

ex)
String makeOfCar = "Volkswagen";
boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
if (isDomestic) {
    System.out.println("This car is domestic to our country.");
}
String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
System.out.println(s);

/// 이번챕터 요약 정리 --------------------------------------------------------
// 삼향 연산자 (Ternary Operator)
자바에서 유일하게 피연산자가 3개인 연산자.
공식 명칭은 Conditional Operator (조건 연산자).

-> 기본 구조
    (조건) ? (참일 때 값) : (거짓일 때 값)
    - 첫번째 : 조건 (true or false가 나와야 함)
    - 두번째 : 조건이 참일 때 나오는 값
    - 세번째 : 조건이 거짓일 때 나오는 값

// if-else와의 비교
    / 기존 방식
    ex)
    int ageOfClient = 20;
    String ageText;
    if (ageOfClient >= 18) {
        ageText = "Over Eighteen";
    } else {
        ageText = "Still a kid";
    }

    / 삼향 연산자 방식 (훨씬 간결함)
    String ageText (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";

// 다른예시
String makeOfCar = "Volkswagen";
boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

    더 간단한 방식 (굳이 삼향연산자를 안써도 되는 상황)
    boolean isDomestic = (makeOfCar != "Volkswagen");


//// Java Operator Precedence : Mastering Expression Evaulation and Challenge ---------------------------------------------------------------
/// Challenge

// Step 1 : create a double variable with a value of 20.00

// Step 2 : create a second variable of type double with a value 80.00

// Step 3 : add both numbers together then multiply by 100.00

// Step 4 : use the remainder operator to figure out what the remainder from the result of the operation in step 3, and 40.00 will be.

// Step 5 : create a boolean variable that assigns the value true, if the remainder in step 4 is 0.00 or faluse if it's not zero.

// Step 6 : output the boolean variable just to see what the result is.

// Step 7 : write an if-then statement that displays a message, 'got some remainder' if the boolean in step 5 is not true.

// Tim's answer ---------------------------
double myFirstValue = 20.00d;
double mySecondValue = 80.00d;
double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
System.out.println("MyValuesTotal = " + myValuesTotal);
double theRemainder = myValuesTotal % 40.00d;
System.out.println("theRemainder = " + theRemainder);
boolean isNoRemainder = (theRemainder == 0) ? true : false;
System.out.println("isNoRemainder = " + isNoRemainder);
if (!isNoRemainder) {
    System.out.println("Got some remainder");
    }

*/
///// Section 5 : Mastering Java Expressions, Statements, Code Blocks, And Method Overloading -----------------------
//// Exploring Java Keywords And Understanding Expressions ---------------------------
/*
// Java has 51 reserved words that are used for keywords in the application.
(Check Oracle -> Chapter 3 . Lexical Structure -> 3.9 Keywords)
ex)
ReservedKeyword:
    abstract
    assert
    boolean
    break
    byte
    case
    catch
    char
    class
    const
    continue
    default
    do
    double
    else
    enum
    extends
    final
    finally
    float
    for
    if
    goto
    implements
    import
    instanceof
    int
    interface
    long
    native
    new
    package
    private
    protected
    public
    return
    short
    static
    strictfp
    super
    switch
    synchronized
    this
    throw
    throws
    thransient
    try
    void
    volatile
    while
ConTextualKeyword:
    exports
    module
    non-sealed
    open
    opens
    permits
    provides
    record
    requires
    sealed
    to
    transitive
    uses
    var
    with
    yield

// true and false are not keywords, but rather boolean literals
// null is not a keyword, but rather the null literal

/// Java's Code Units
Writing code is similar to writing a document. It consists of special hierarchical units, which together form a whole.
These are:
    The Expression - An expression computes to a single value.
    The Statement - Statements are stand alone units of work.
    Code Blocks - A code block is a set of zero, one, or more statments, usually grouped together in some way to achieve a single goal.

ex)
public class Main {

    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);

        int highScore = 50;

        if(highScore > 25) {
            highScore = 1000 + highScore; // add bonus points
        }
        int health = 100;

        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }
    }
}


/// The Expression Challenge
Looking at the code below, what parts are expressions?
    int health = 100;
    if ((health < 25) && (highScore > 1000)) {
        highScore = highScore - 1000;
    }

// Tim's answer
there are 6 expressions
    health = 100
    health < 25
    highScore > 1000
    (health < 25) && (highScore > 1000)
    highScore - 1000
    highScore = highScore - 1000

/// 정리 ---------------
/// 자바 프로그램을 구성하는 기본 요소인 키워드(Keywords)와 코드를 이루는 3대 단위(표현식, 문장, 코드 블록)를 다루는 챕터
// 자바 키워드(Keywords)와 리터럴 구분
    예약어(Reserved Keywords) : public, class, int, if 등 자바 언어 자체어서 미리 용도를 정해둔 51개의 단어로, 변수나 메서드 이름으로 사용불가.
    맥락 키워드(Contextual Keywords) : var, record, yield 처럼 특정 위치나 문맥에서만 키워드로 동작하는 단어.
    키워드가 아닌 리터럴 : true, false, null은 키워드가 아닌 값 자체(literal)로 분류됨.

// 자바 코드를 구성하는 3대 단위 (Code Units)
    - 표현식(Expression) : 계산 결과가 하나의 값(Single Value)으로 떨어지는 코드 조각
        ex) 100 * 1.609, health < 25
    - 문장(Statement) : 독립적으로 실행 가능한 완결된 행동 단위 (보통 끝에 ;)
        ex) double kilometers = (100 * 1.609344);
    - 코드 블록(Code Block) : 중괄호 {}로 여러 문장을 묶어 하나의 목적을 수행하는 범위
        ex) if (...) ( ... )

// 챌린지 해설
Looking at the code below, what parts are expressions?
    int health = 100;
    if ((health < 25) && (highScore > 1000)) {
        highScore = highScore - 1000;
    }
// (풀이)
    health = 100 : 변수에 값을 대입한 결과값 100을 만들어내는 대입 표현식
    health < 25 : true 또는 false를 반환하는 비교 표현식
    highScore > 1000 : true 또는 false를 반환하는 비교 표현식
    (health < 25) && (highScore > 1000) : 두 조건의 논리 연산 결과 (true/false)를 만드는 논리 표현식
    highScore - 1000 : 뺄셈 연산 결과값을 만들어내는 산술 표현식
    highScore = highScore - 1000 : 계산된 최종 값을 다시 대입하는 대입 표현식

    => 데이터 타입(int)이나 키워드(if), 세미콜론(;)을 제외하고 "결과적으로 어떤 값이 계산되어 나오는가"를 기준으로 나누면 표현식을 쉽게 찾을 수 있음.


*/
//// Mastering Java Statements, Whitespace, and Code Organization ---------------------------
/*
public class Main {

    public static void main(String[] args) {
        int myVariable = 50;

        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" + " another" + " still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVaraible = " + myVariable);

        if (myVariable == 0) {
            System.out.println("It's now zero");
        }
    }
}


/// Whitespace
    Whitespace is any extra spacing, horizontally or vertically placed around Java source code.
    It's usually added for human readability purposes.
    In Java, all these extra spaces are ignored.

    So Java treats code like this
        int anotherVariable = 50;myVariable--; System.out.println("myVariable = " + myVariable);
    The same as this
        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable);


// intellij에서 Reformat code을 사용하면 자동적으로 whitespace를 고려하여 코드를 보기 좋게 예쁘게 정리해줌.(indenting까지 포함)
    상단 메뉴바 -> 코드 -> 코드 서식 다시 지정 (code -> reformat code)

*/

//// Harnessing Code Blocks And The If-Then-Else Statement in Java ---------------------------
/*
/// If Then Structure
    if (condition) {
        // Code in block will execute only if
        // condition is true

        // block can contain 1 or more statements
        }

/// If with an Else block
    if (condition) {
        // Code in block will execute only if
        // condition is true
    } else {
        // Code in block will execute only if
        // condition is true
    }

/// If with an Else if and Else block
        if (firstCondition) {
        // Code in block will execute only if
        // firstCondition is true
    } else if (secondCondition) {
        // Code in block will execute if firstCondition is false
        // and secondCondition is true
    <THERE IS NO LIMIT TO THE NUMBER OF CONDITIONS THAT CAN BE TESTED>

    } else {
        // Code in block will execute if
        // all conditions above are false

    <THE ELSE BLOCK MUST BE LAST BUT IS OPTIONAL>
    }

ex)
    boolean gameOver = true;
            int score = 800;
            int levelCompleted = 5;
            int bonus = 100;

            if (score < 5000 && score > 1000) {
                System.out.println("Your score was less than 5000 but greater than 1000");
            } else if (score < 1000) {
                System.out.println("Your score was less than 1000");
            } else {
                System.out.println("Got here");

*/
//// Practical If-Then-Else Challenge For Java Flow Control ---------------------------
/*
    public class MainChallenge {

        public static void main(String[] args) {

            boolean gameOver = true;
            int score = 800;
            int levelCompleted = 5;
            int bonus = 100;

            int finalScore = score;
            if (gameOver) { // gameOver == true
                finalScore += (levelCompleted * bonus); // finalScore = finalScore + (levelCompleted * bonus)
                System.out.println("Your final score was " + finalScore);
            }
        }
    }


/// If then else Challenge
    Insert a code segment on the code above:
        - Set the existing score variable to 10,000
        - Set the existing levelCompleted variable to 8.
        - Set the existing bonus variable to 200.
        - Use the same if condition. Meaning if gameOver is true, then you want to perform the same calculation and print out the value of the finalScore variable.

/// My solution
public class MainChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;
        if (gameOver) { // gameOver == true
            finalScore += (levelCompleted * bonus); // finalScore = finalScore + (levelCompleted * bonus)
            System.out.println("Your final score was " + finalScore);
        }
    }
}


/// Tim's solution
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        int newFinalScore = newScore;
        if (newGameOver == true) {
            newFinalScore += (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + newFinalScore);
        }

*/
//// Deep Overview of Methods in Java For Reusable Code -----------------------------------
/*
/// The Method
    Java's description of the method is:
        A method declares executable code that can be invoked, passing a fixed number of values as arguments.

/// The Benefits of the Method
    A method is a way of reducing code duplication.
    A method can be executed many times with potentially different results, by passing data to the method in the form of arguments.

/// Structure of the Method
    The following is one of the simplest ways to declare a method:
    This method has a name but takes no data in, and returns no data from the method(which is what the special word void means in the declaration)
    ex)
        public static void methodName() {
            // Method statements form the method body
        }

/// Executing a Method as a Statement
    To execute a method, we can write a statement in code which we say is calling, or invoking the method
    For a simple method like calculateScore, we just use the name of the method where we want it to be executed followed by parentheses, and a semi-colon to complete the statement.

        calculateScore();

/// Structure of the Method
    ex)

    public static void methodName(p1type p1, p2type p2, {more}) {

        // Method statements from the method body

    }

/// Parameters or Arguments?
    Parameters and arguments are terms that are often used interchangeably by developers.
    But technically a parameter is the definition as shown in the method declaration, and the argument will be the value that's passed to the method when we call it.

/// Executing a Method with parameters
    To execute a method that's defined with parameters you have to pass variables, values, or expressions that match the type, order and number of the parameters declared.
    In the calculateScore example, I declared the method with four parameters, the first; a boolean, anmd the other three of int data types.
    So we have to pass first a boolean, and then 3 int values as shown in the statement:
        calculateScore(true, 800, 5, 100);
    You can't pass the boolean type in any place other than as the first argument without an error.
    The statement below would cause an error.
        calculateScore(800, 5, 100, true);
    You can't pass only a partial set of parameters as shown here.
    This statement too would cause an error.
        calculateScore(true, 800);


ex)
    public class MainChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        calculateScore(true, 800, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;


        if (gameOver) { // gameOver == true
            finalScore += (levelCompleted * bonus); // finalScore = finalScore + (levelCompleted * bonus)
            System.out.println("Your final score was " + finalScore);
        }
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) { // gameOver == true
            finalScore += (levelCompleted * bonus); // finalScore = finalScore + (levelCompleted * bonus)
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}

*/
//// Enhancing Skills With Additional Java Method Techniques ---------------------------
/*
public class MainChallenge {
    public static void main(String[] args) {


        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore +=- (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
    }

/// Method Structure with Parameters and Return Type
// Method return type is a declared Data type for the data that will be returned from the method
    public static dataType methodName(p1type p1, p2type p2, {more}) {
    // Method statements
    return value;
    }
    - So, similar to declaring a variable with a type, we can declare a method to have a type.
    - This declared type is placed just before the method name
    - In addition, a return statement is required in the code block as as shown, which returns the result from the method.


// An example of a method declaration with a return type:
- in this case, the return type is an int.
    public static int calculateMyAge(int dateOfBirth) {
        return (2023 - dateOfBirth);
    }
- This method will return an integer when it finishes executing successfully.

/// The return statement
// Java states that a return statement returns control to the invoker of a method.
// The most common usage of the return statement is to return a value back from a method.
// In a method that doesn't return anything, in other words a method declared with void as the return type, a return statement is not required.
// It is assumed and execution is returned after the last line of code in the method is executed.
// But in methods that do return data, a return statement with a value is required.



public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next highScore is " + calculateScore(gameOver, score, levelCompleted, bonus));

    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore +=- (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }

}

*/
//// Comprehensive Recap Of Java Methods ---------------------------
/*
/// The Method
Java's documentation states that : A method declares executable code that can be invoked, passing a fixed number of values as arguments.

/// Is the method a statement or an expression?
Like some of the abbreviated operators, a method can be a statement or an expression in some instances.
Any method can be executed as a statement.
A method that returns a value can be used as an expression, or as part of any expression.

/// What are functions and procedures?
Some programming languages will call a method that returns a value, a function, and a method that doesn't return a value, a procedure.
The term procedure is somewhat less common when applied to Java methods, but you may still hear a method with a void return type called procedure.


/// Declaring the Method
So there are quite a few declarations that need to occur when creating a method.
This consists of;
    - Declaring Modifiers
        These are keywords in Java with special meanings, like public and static as examples.
    - Declaring the return type.
        void is a Java keyword meaning no data is returned from a method.
        Alternatively, the return type can be any primitive data type or class.
        If a return type is defined, the code block must use at least one return statement, returning a value of the declared type or comparable type.
    - Declaring the method name. Lower camel case is recommended for method names.
    - Declaring the method parameters in parentheses. A method is not required to have parameters, so a set of empty parentheses would be declared in that case.
    - Declaring the method block with opening and closing curly braces. This is also called the method body.

/// Declaring the Parameters
Parameters are declared as a list of comma-separated specifiers, each of which has a parameter type and a parameter name (or identifier).
Parameter order is important when calling the method.
The calling code must pass arguments to the method with the same or comparable type, and in the same order as the declaration.
The calling code must pass the same number of arguments as the number of parameters declared.

/// Declaring the Return Type
When declaring a return type:
void is a vaild return type and means no data is returned.
Any other return type requires a return statement in the method code block.

/// The Return Statement for methods that have a return type
If a method declares a return type meaning it's not a void, then a return type is required at any exit point from the method block.
Consider the method block shown here;
    public static boolean isTooYoung(int age) {
        if (age < 21) {
            return true;
        }
    }

So in the case of using a return statement in nested code blocks in a method, all possible code segments must result in a value being returned.
The following code demonstrates one way to do this;
    public static boolean isTooYoung(int age) {
        if (age < 21) {
            return true;
        }
        return false;
    }

One common practice is to declare a default return value at the start of a method, and only have a single return statement from a method, returning that variable shown in the example method:
    public static boolean isTooYoung(int age) {
        boolean result = false;
        if (age < 21) {
            result = true;
        }
    }

/// The Return Statement for methods that have void as the return type
The return statement can return with no value from a method, which is declared with a void return type.
In this case, the return statement is optional, but it may be used to terminate execution of the method at some earlier point than the end of the method block as shown:
    public static void methodDoesSomething(int age) {
        if (age > 21) {
            return;
        }
        // Do more stuff here
    }

/// The Method Signature
A method is uniquely defined in a class by its name, and the number and type of parameters that are declared for it.
This is called the method signature.
You have multiple methods with the same method name, as long as the method signature (meaning the parameters declared) are different.

/// Default values for parameters
In many languages methods can be defined with default values and you can omit passing values for these when calling the method.
But Java doesn't support default values for parameters.
There are work-arounds for this limitation, and this will be used for later.
But it's important to state that in Java, the number of arguments you pass and their type must match the parameters in the method declaration exactly.


/// Revisiting the main method
Now at this state when we revisit the main method and examine it;
The main method is special in Java because Java's virtual machine(JVM) looks for the method with thhe following signature and uses it as the entry point for execution of code.
    public static void main(String[] args) {
    // code in here
    }
//// 이번챕터 잠깐 정리 ---------------------
/// Java 메서드(Method) 정리
1. 메서드가 뭔가?
    실행할 코드를 묶어 이름을 붙여둔 것이고 필요할 때 호출해서 씀. Python의 def 함수, JS의 function와 비슷함
    - 값을 반환하는 메서드는 표현식으로 쓸 수 있음 (예- int x = add(1,2);)
    - 어떤 메서드든 문장으로 그냥 실행할 수 있음 (add(1, 2);)

2. 메서드 선언의 구성 요소
    public static boolean isTooYoung(int age) {...}
    - 접근/기타 제어자 (public static 등) : 특별한 의미를 가진 키워드
    - 반환 타입 (boolean 등) : 돌려줄 값의 타입. 없으면 void
    - 메서드 이름 (isTooYoung) : lowerCamelCase 권장
    - 파라미터 (int age) : 타입 + 이름, 쉼표로 구분, 없으면 ()
    - 메서드 본문 {...} : 실제 실행 코드

3. 파라미터 규칙
    호출할 때 개수, 타입, 순서가 선언과 맞아야 함.

4. return 규칙
    - void : return은 선택, 쓴다면 return;으로 중간에 빠져나갈 때 사용
    - 그 외(int, boolean 등) : 모든 실행 경로에서 값을 return해야 함

5. 메서드 시그니처와 오버로딩
    이름 + 파라미터(개수/타입)가 메서드의 고유 식별자. 이름이 같아도 파라미터가 다르면 별개의 메서드로 공존할 수 있고, 이를 오버로딩이라고 함.
        static int add(int a, int b) {return a + b;}
        static double add(double a, double b) {return a + b;}
6. 파라미터 기본값이 없음
7. main 메서드
    public static void main(String[] args) {
        // 여기부터 실행
    }
    JVM이 프로그램을 시작할 때 정확히 이 시그니처의 메서드를 진입점으로 씀.

 */
//// Hands-On Java Method Challenge For Deeper Practice
/*
<My Solution>
public class MethodChallenge {
    public static void main(String[] args) {

    String name;
    int position;
    int score;


    displayHighScorePosition("Tim", 2);
    calculateHighScorePosition(1500);
    calculateHighScorePosition(1000);
    calculateHighScorePosition(500);
    calculateHighScorePosition(100);
    calculateHighScorePosition(25);



    }
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }


    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            System.out.println("1");
        } else if (score >= 500) {
            System.out.println("2");
        } else if (score >= 100) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}
    <Tim's solution>
public class MethodChallenge {
    public static void main(String[] args) {


    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Tim", highScorePosition);

    highScorePosition = calculateHighScorePosition(1000);
    displayHighScorePosition("Bob", highScorePosition);

    highScorePosition = calculateHighScorePosition(500);
    displayHighScorePosition("Percy", highScorePosition);

    highScorePosition = calculateHighScorePosition(100);
    displayHighScorePosition("Gilbert", highScorePosition);

    highScorePosition = calculateHighScorePosition(25);
    displayHighScorePosition("James", highScorePosition);

    }
    public static void displayHighScorePosition(String name, int highScorePosition) {
        System.out.println(name + " managed to get into position " + highScorePosition + " on the high score list.");
    }


    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
 */
//// Delving Into Method Overloading in Java ------------------------
/*
/// Method Overloading
Method overloading occurs when a class has multiple methods with the same name, but the methods are declared with different parameters.
So you can execute multiple methods with the same name, but call it with different arguments.
Java can resolve which method it needs to execute based on the arguments being passed when the method is invoked.

/// More on Method Signatures
A method signature consists of the name of the method, and the uniqueness of the declaration of its parameters.
In other words, a signature is unique, not just by the method name but in combination with the number of parameters, their types, and the order in which they are declared.
A method's return type is not part of the signature.
A parameter name is also not part of the signature.

/// Valid Overloaded Methods
The type, order, and number of parameters in conjunction with the name, make a method signature unique.
A unique method signature is the key for the Java compiler, to determine if a method is overloaded correctly.
The name of the parameter is not part of the signature, and therefore it doesn't matter from Java's point of view, what we call our parameters.
    ex)
    public static void doSomething(int parameterA) {
        // method body
    }
    public static void doSomething(float parameterA) {
        // method body
    }
    public static void doSomething(int parameterA, float parameterB) {
        // method body
    }
    public static void doSomething(int parameterA, int parawmeterB, float parameterC) {
        // method body
    }

/// Invalid Overloaded Methods
Parameter names are not important when determining if a method is overloaded.
Nor are return types used when determining if a method is unique.
    public static void doSomething(int parameterA) {
        // method body
    }
    public static void doSomething(int parameterB) {
        // method body
    }
    public static int doSomething(int parameterA) {
        return 0;
    }

    ex)
    public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
    }
    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points!");
        return score * 1000;
        }
    }

    ex)
    public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        System.out.println("Unnamed Player scored " + score + " points!");
        return score * 1000;
    }
    public static int calculateScore() {

        System.out.println("No player name, no player score.");
        return 0;
    }
}
    ex)
    public class Main {
    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//
//        calculateScore(75);
//        calculateScore();
        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(10));
    }
    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        return calculateScore("Anonymous", score);
    }
    public static int calculateScore() {

        System.out.println("No player name, no player score.");
        return 0;
    }
}

 */
//// Practical Method Overloading Challenge To Strengthen Java Expertise-----------------------------------
/*
/// Overloaded Method Challenge Instructions
Create two methods with the same name : convertToCentimeters
    - The first method has one parameter of type int which represents the entire height in inches.
        You'll convert inches to centimeters, in this method and pass back the number of centimeters as a double.
    - The second method has two parameters of type int, one to represent height in feet, and one to represent the remaining height in inches.
        So if a person is 5 foot 8 inches, the values 5 for feet and 8 for inches would be passed to this method.
        This method will convert feet and inches to just inches,then call the first method to get the number of centimeters also returning the value as a double.
    - Both methods should return a real number or decimal value for total height in centimeters.
    - Call both methods, and print out the results.
The conversion formula from inches to centimeters is 1 inch = 2.54cm
Also remember : one foot = 12 inches.


<My Solution>
public class Main {

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8));
        System.out.println(convertToCentimeters(68));

    }
    public static double convertToCentimeters(int inch) {
        return inch * 2.54;

    }
    public static double convertToCentimeters(int foot, int inch) {
        return convertToCentimeters((foot * 12 + inch));
    }
}

 */
//// Comprehensive Seconds-And-Minutes Challenge For Time-Based Calculations -----------------------------------
/*
///  Seconds And Minutes Challenge
In this challenge, create a method that takes time represented in seconds, as a parameter.
And then transform the seconds into hours.
Next display the time in hours with the remaining minutes and seconds in a String.
Do the transformation in two steps which allow to use overloaded methods.
We want to create two methods with the same name : getDurationString
    - The first method has one parameter of type int, named seconds
    - The second method has two parameters named minutes ane seconds both ints.
    - Both methods return a String in the format shown;
        'XXh YYm ZZs'
         XX represents the number of hours, YY the number of minutes, and ZZ the number of seconds.
    - The first method should in turn call the second method to return its results.
    <tips>
    - Make both methods public and static
    - One minute is 60 seconds, one hour is 60 minutes or 3600 seconds
    <Add validation to the methods as a bonus>
    - For the first method, the seconds parameter should be >= 0
    - For the second method the minutes parameter should be >= 0, and the seconds parameter should be >= 0, and <= 59
    - If either method is passed an invalid value, print out some type of meaningful message to the user.

<My Solution>
public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(200));
        System.out.println(getDurationString(350, 25));
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value detected. the value should be 0 or above.");
            return "";
        }   else {
            return getDurationString(seconds/60, seconds%60);
        }
    }


    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid value detected. the value should be 0 or above, and seconds shouldn't exceed 59.");
            return "";
        } else {

            return ((minutes/60)+ "h " + (minutes%60 + seconds/60) +"m " + (seconds%60) + "s");
        }
    }
}

<Tim's solution>
public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }
    public static String getDurationString(int seconds) {
        // Two step approach to get hours
        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + " s";

        return "";
    }
}
*/
//// Detailed Bonus Challenge Solution And Key Insights -----------------------------------
/*
    <Add validation to the methods as a bonus>
    - For the first method, the seconds parameter should be >= 0
    - For the second method the minutes parameter should be >= 0, and the seconds parameter should be >= 0, and <= 59
    - If either method is passed an invalid value, print out some type of meaningful message to the user.
    (본인은 이미 이전 강의에서 코드 짰으니 참고용)
public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }
    public static String getDurationString(int seconds) {
        If (seconds <0) {
            return "Invalid data for seconds("+ seconds + "), must be a positive integer value";
        }
        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {

        If (minutes < 0) {
            return "Invalid data for minutes("+ minutes + "), must be a positive integer value";
        }
        if (seconds <0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }
        int hours = minutes / 60;
        return getDurationString(seconds / 60, seconds % 60);

        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + " s";
    }
}

------VS------

<내 코드>
public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(200));
        System.out.println(getDurationString(350, 25));
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value detected. the value should be 0 or above.");
            return "";
        }   else {
            return getDurationString(seconds/60, seconds%60);
        }
    }


    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid value detected. the value should be 0 or above, and seconds shouldn't exceed 59.");
            return "";
        } else {

            return ((minutes/60)+ "h " + (minutes%60 + seconds/60) +"m " + (seconds%60) + "s");
        }
    }
}
 */
///// Section 6 : Mastering Conditional Logic, Loops, And Interactive Java Applications -----------------------------------------
// In this section, we'll be learning about the switch statement, which like the if then else statement allowing to execute different code blocks based on different conditions.
// Three additional statements : the for statement, the while statement, and the do while statement which are used to repeat code segments based on conditions.
//// Exploring The Traditional And Enhanced Switch Statements -------------------------------
/*
/// The switch statement
    switch(value) {
        case x:
            // Code for value == x
            break;
        case y:
            // Code for value == y
            break;
        default:
            // Code for value not equal to x or y
        }

    public class Main {
    public static void main(String[] args) {
//        int value = 2;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }

        // More code here

    }
}

/// Switch Value Types
Valid Switch Value Types
    - byte, short, int, char
    - Byte, Short, Integer, Character
    - String
    - enum
-> Important!! Cannot use long, float, double or boolean or their wrappers.


/// Fall through in switch statement
Once a switch case label matches the switch variable, no more cases are checked.
Any code after the case label where there was a match found will be executed until a break statement, or the end of the switch statement occurs.
Without a break statement, execution will continue to fall through any case labels declared below the matching one, and execute each case's code.

*/
//// Delving Deeper Into Advanced Switch Statement Features -------------------------------
/*
/// Enhanced Switch Expressions
String month = "OCTOBER";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
        }

public static String getQuarter(String month) {
    return switch (month) {
        case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
        case "APRIL", "MAY", "JUNE" -> "2nd";
        case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
        case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
        default -> "bad";
    };

}

}
    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };

/// When to use yield in a switch
    Your switch statement is being used as a switch expression returning a value.
    Your case label uses a code block with opening and closing curly braces.

   ex)
        -> "1st";   -> { yield "1st";}

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {yield "1st";}
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };

    }
/// 이번챕터 정리 ----------------------------------------------
/// Switch 정리
1. Switch가 무엇인가?
    값 하나를 여러 후보와 비교해서, 맞는 곳의 코드만 실행하는 문법. if / else if / else 를 더 읽기 좋게 쓰는 방법.
        if 방식 : if (value == 1) ... else if (value == 2) ...
        switch : switch (value) {case 1 : ... case 2 : ...}
    switch는 범위검사를 못하고 필요 시 if를 써야 됨. switch는 같은가? 만 물어보기 때문

2. 기본 구조(전통 방식)
    int switchValue = 4;
    switch (switchValue) {
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        default:
            System.out.println("Was not 1 or 2");
            break;
    }
    => switchValue를 위에서부터 case와 비교하여, 맞지 않을 경우 하나씩 내려와 마지막 default 실행(if else와 비슷함)
    => break을 만나 switch 종료

3. 여러 case를 하나로 묶기
    case 3: case 4: case 5:
        System.out.println("Value was 3, 4, or a 5");
        System.out.println("Actually it was a " + switchValue);
        break;
    => 3,4,5 중 아무거나 맞으면 같은 코드를 실행하는 형식.

4. break와 fall through
case가 한번 맞으면 그 아래 case는 검사하지 않으나, 대신 break을 만날 때까지 아래 코드를 전부 실행함. 이걸 fall through라고 함.
    맞는 case 실행 후 -> break 있으면 바로 switch 종료 / break 없으면 아래 case까지 계속 실행

5. Switch에 쓸 수 있는 타입
    => byte, short, int, char, Byte, Short, Integer, Character, String, enum
    쓸 수 없는 타입
    => long, float, double, boolean, 방금 타입들의 wrapper(Long, Double, Boolean)

6. Enhanced switch (화살표 방식)
break으로 인해 전통 방식이 불편하여 새로 나온 문법(Java 14 or above)
    public static String getQuarter(String month) {
    return switch (month) {
        case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
        case "APRIL", "MAY", "JUNE" -> "2nd";
        case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
        case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
        default -> "bad";
    };
    }
    => 전통 switch와는 다르게 break가 필요 없으며, fall through도 걱정 없이 조건에 맞는 것만 실행됨.
    => 또한 return switch 처럼 값으로도 돌려주어 사용 가능

7. Yield?
화살표 오른쪽에 한줄짜리 값이 아니라 여러 줄 코드를 쓸 때 {}를 통해 yield로 값을 내보냄.
    조건 : switch를 값을 돌려주는 식으로 씀 (return switch, String x = switch)
          case 뒤에 { } 코드 블록을 씀
    ex)
    default -> {
        String badResponse = month + " is bad";
        yield badResponse;    // 이 값이 switch 전체의 결과가 됨
    }

    => 이 때 yield와 return은 서로 다름.
        yield는 "이 case의 결과값을 switch에게 준다"
        return는 "메서드 자체를 끝낸다"
        그래서 switch 안에서는 yield를 씀.
*/
//// Traditional Switch Statement Challenge And Practical Exercises -------------------------------------------
/*
/// Switch Challenge
In this challenge, we'll be using the NATO alphabet to replace a character or letter, with NATO's standardized word for that letter.
In radio transmissions, the word car - "C", "A", "R" would read "Charlie Able Roger" for clarity.
    NATO PHONETIC ALPHABET
    A = Able, B = Baker, C = Charlie, D = Dog, E = Easy, F= Fox, G = George, H = How, I = Item, J = Jig, K = King,
    L = Love, M = Mike, N = Nan, O = Oboe, P = Peter, Q = Queen, R = Roger, S = Sugar, T = Tare, U = Uncle, V = Victor,
    W = William, X = X-ray, Y = Yoke, Z = Zebra

    To do this:
    1. Create a new char variable.
    2. Use the traditional switch statement (with a colon in case labels) that tests the value in the variable from step 1.
        - Create cases for the characters, A B C D and E.
        - Display a message in each case block with the letter and the nato word then break.
        - Add a default block which displays the letter with a message saying not found.

<my solution>
public class Main {
    public static void main(String[] args) {

        char alphabet = 'G';
        switch (alphabet) {
            case 'A':
                System.out.println("A = Able");
                break;
            case 'B':
                System.out.println("B = Baker");
                break;
            case 'C':
                System.out.println("C = Charlie");
                break;
            case 'D':
                System.out.println("D = Dog");
                break;
            case 'E':
                System.out.println("E = Easy");
                break;
            default:
                System.out.println(alphabet + " not found");
                break;
        }
    }
}

*/
//// Embracing Switch Expressions With A Hands-On Coding Challenge  -------------------------------------------
/*
/// Switch Expression Challenge
// Day of the Week Challenge
1. Create a method called printDayOfWeek that takes an int parameter called day, but doesn't return any values
    - Use the enhanced switch statement to return the name of the day based on the parameter passed to the switch
    statement, so that 0 will return "Sunday", 1 will return "Monday", and so on. Any number not between 0 and 6
    should return "Invalid Day." Note that return here means the value returned from the enhanced switch statement.
    - Use the enhanced switch statement as an expression returning the result to a String named dayOfTheWeek.
    - Print both the day variable and the dayOfTheWeek variable.
2. In the main method, call this method for the values 0 through 7.
3. Bonus: Create a second method called printWeekDay that uses an if then else statement instead of switch to produce
   the same output.

<my solution>
public class Main {
    public static void main(String[] args) {
    printDayOfWeek(0);
    printDayOfWeek(1);
    printDayOfWeek(2);
    printDayOfWeek(3);
    printDayOfWeek(4);
    printDayOfWeek(5);
    printDayOfWeek(6);
    printDayOfWeek(7);
    }

    public static void printDayOfWeek(int day) {
        String dayOfTheWeek = switch (day) {
            case 0 -> "SUNDAY";
            case 1 -> "MONDAY";
            case 2 -> "TUESDAY";
            case 3 -> "WEDNESDAY";
            case 4 -> "THURSDAY";
            case 5 -> "FRIDAY";
            case 6 -> "SATURDAY";
            default -> {
                String badResponse = "Invalid day";
                yield badResponse;
            }
        };
        System.out.println(dayOfTheWeek);
    }
}
<Tim's solution>
public class Main {
    public static void main(String[] args) {
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> { yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
            };
        System.out.println(day + " stands for " + dayOfWeek);

    }

    public static void printWeekDay (int day) {

        String dayOfWeek = "Invalid Day";
        if (day == 0) {
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        } else if (day == 3) {
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        }
        System.out.println(day + " stands for " + dayOfWeek);
    }
}
*/
//// Mastering The for Statement For Repetitive Task Automation -------------------------------------------
/*
/// Looping
Looping lets us execute the code a multiple number of times.
Java supports several statements for looping or executing code repetitively.

/// Java supports three statements for looping
    for : The for loop is more complex to set up but is commonly used when you are iterating over a set of values.
    while : The while loop executes until a specified condition becomes false.
    do while : THe do while loop always executes at least one and continues until a specified condition becomes false.

/// The for statement
The for statement is often referred to as the for loop.
It repeatedly loops something until a condition is satisfied.

    for (init; expression; increment) {
        //block of statements
    }

There are three parts to the basic for statement's declaration.
These are declared in parentheses, after the for keyword, and are separated by semi-colons.
These parts are all optional and consist of the following:
    - The initialization section declares or sets state, usually declaring and initializing a loop variable, before the loop begins processing.
    - The expression section once it becomes false, will end the loop processing.
    - The increment section is executed after the expression is tested, and is generally the place where the loop variable is incremented.

    public class Main {
    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }


        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at  " + rate + "% interest = " + interestAmount);
        }

    }
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
       }
    }
    <Mini Challenge>
    <My Solution>
    public class Main {
    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }


        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at  " + rate + "% interest = " + interestAmount);
        }

        for (double rate = 7.5; rate <= 10; rate = rate + 0.25) {
            double interestAmount2 = calculateInterest(100.0, rate);
            System.out.println("100 at  " + rate + "% interest = " + interestAmount2);
        }


    }
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}


/// The break statement
A break statement transfers control out of an enclosing statement.

    public class Main {
    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }


        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at  " + rate + "% interest = " + interestAmount);
        }

        for (double rate = 7.5; rate <= 10; rate = rate + 0.25) {
            double interestAmount2 = calculateInterest(100.0, rate);
            if (interestAmount2 > 8.5) {
                break;
            }
            System.out.println("100 at  " + rate + "% interest = " + interestAmount2);
        }


    }
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
        }
    }


 */
//// Comprehensive for Loop Challenge To Strengthen Iteration Skills ----------------------------------------
/*
/// The for Statement Challenge Exercise

public class Main {
    public static void main(String[] args) {

        for (int wholeNumber = 0; wholeNumber <= 1000; wholeNumber++) {
            System.out.println(wholeNumber + " is " + (isPrime(wholeNumber) ? "" : "NOT ") + "a prime number.");
        }

//        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
//        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
//        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
//        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
//        System.out.println("4 is " + (isPrime(4) ? "" : "NOT ") + "a prime number");
//        System.out.println("5 is " + (isPrime(5) ? "" : "NOT ") + "a prime number");
//        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
//        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");
//        System.out.println("31 is " + (isPrime(31) ? "" : "NOT ") + "a prime number");
//        System.out.println("32 is " + (isPrime(32) ? "" : "NOT ") + "a prime number");

    }
    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }


}

    <Final Code>
    public class Main {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
                if (count == 3) {
                    System.out.println("Found 3 - Exiting for loop");
                    break;
                }
            }
        }
        }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
        }
    }

    <shorter final code>
    public class Main {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 10; count < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;

            }
        }

        }



    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
        }
    }

*/
//// Sum 3 And 5 Challenge With IntelliJ Debugger Insights  ----------------------------------------
/*
- Create a for loop using a range of numbers from 1 to 1000 inclusive
- Sum all the numbers that can be divided by both 3 and 5.
- Print out the numbers tat have met the above conditions.
- Break out of the loop once you have found 5 numbers that met the conditions above.
- After breaking out of the loop, print the sum of the numbers that met the conditions above.

public class Main {

    public static void main(String[] args) {

    int countOfMatches = 0; // 조건을 만족한 숫자가 몇 개인지 세기 위한 변수
    int sumOfMatches = 0; // 조건을 만족한 숫자들의 합을 저장할 변수

    for (int loopNumber = 1; loopNumber <= 1000; loopNumber++) {  // 1부터 1000까지 숫자를 하나씩 확인, loopNumber가 1000 이하인 동안 반복, // 한 번 반복할 때마다 loopNumber를 1 증가
        if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) { // 현재 숫자가 3과 5가 동시에 나누어 떨어지는지 확인
            countOfMatches++; // 조건을 만족한 숫자의 개수를 1 증가
            sumOfMatches += loopNumber; // 조건을 만족한 숫자를 합계에 더함
            System.out.println("Found a match = " + loopNumber);  // 조건을 만족한 숫자를 출력
        }
        if (countOfMatches == 5) { // 조건을 만족한 숫자를 5개 찾았다면
            break; // for 반복문을 즉시 종료
        }
    }
        System.out.println("Sum = " + sumOfMatches);  // 반복문이 끝난 후 지금까지 찾은 숫자들의 합을 출력
    }
}

*/
//// for Loop Recap And Key Takeaways for Iteration in Java  ----------------------------------------
/*
/// The for Statement Recap
for (init; condition; increment) { // for (초기화; 조건; 증가/변화)
    // statements;                  // 반복할 코드
}

 */
//// The while And do-while Statements For Conditional Looping ----------------------------------------
/*
/// Java has two types of while loops
    while : Continue executing code block until the loop expression becomes false
    do while : Execute the code block once then continue executing until the loop condition becomes false

/// The for statement and the while statement
    // The for statement
    for (init; expression; increment) {
    // block of statements
    }

    // The while statement
    while (expression) {
    // block of statements
    }

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

//        // while loop
//        int j = 1;
//        while (true) {
//            if (j > 5) {
//                break;
//            }
//            System.out.println(j);
//            j++;
//        }

        // do while loop
        int j = 1;
        boolean isReady = false;
        do {                    // do 안의 코드를 먼저 실행
            if (j > 5) {        // j가 5보다 커졌는지 확인
                break;          // j가 5보다 크면 do-while문 종료
            }
            System.out.println(j);
            j++;
        }  while (isReady); // do블록 실행 이후 여기서 isReady 값을 확인함. isReady가 true이면 do로 돌아가 다시 실행. false이면 반복 종료
    }
}


/// continue
the continue statement- in its simpliest form will stop executing the current iteration of a block of code in a loop and start a new iteration.

        // continue
        int number = 0; // 변수를 0부터 시작
        while (number < 50) { // number가 50보다 작은 동안 반봅
            number += 5; // 매번 number에 5 더하기
            if (number % 25 == 0) { // number가 25로 나누어 떨어지는지 확인(25의 배수)
                continue; // 해당되면 해당 반복을 끝내고 다음 반복으로 넘어감 (vs break : 반복문 자체 종료)
            }
            System.out.print(number + "_");
        }


 */

//// Practical while Loop Exercises And Challenges ----------------------------------------

/*
/// My Solution
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(isEvenNumber(3));
//        int number = 5;
//        while (number <= 20) {
//            if (isEvenNumber(number)) {
//                System.out.println(number);
//            }
//            number++;
//        }
//
//    }
//
//    public static boolean isEvenNumber(int number) {
//        if (number % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}
//

/// Tim's Solution
public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}
<최종 코드>
public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers counted : " + evenCount);
        System.out.println("Total odd numbers counted : " + oddCount);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}

 */
//// Digit Sum Challenge And Further Looping Techniques ----------------------------------------
/*
/// Digit Sum Challenge

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 1234 is " + sumDigits(32123));
    }
    public static int sumDigits(int number) {
        if (number < 0) { // 예외처리
            return -1;
        }

        int sum = 0; // 자릿수 합을 누적할 변수

        while (number > 9) {
            sum += (number % 10); // 맨 뒷자리 숫자를 떼어내 sum에 더함
            number = number / 10; //  맨 뒷자리 숫자를 지움
        }
        sum += number; // 마지막 남아있는 한 자릿수 더하기

        return sum;

    }

}

*/
//// Revisiting The while And do-while Loops: A Complete Recap ----------------------------------------
/*
/// The while Statement recap
    while (condition) { // curly braces to define loop code block (body)
        // statements
    }

    do {                 // curly braces to define loop code block (body)
        // statements
    } while (condition); // semicolon is required
*/
//// Exploring Local Variables And Scope In Java Blocks  ----------------------------------------
/*
/// Local Variables and Scope
/// Local Variable
    A Local Variable is called local because it is available for use by the code block in which it was declared.
    It is also available to code blocks that are contained by a declaring block.
        (ex)
        {       // starts on outer block - for example a method block
            int firstVariable = 5;
            int secondVariable = 10;
            if (firstVariable > 0) { // flow statement block starts inner block
            }
                // Inner block code has access to outer block's variables
                System.out.println(secondVariable);
            }
        }

/// Scope
    Scope describes the accessiblity of a variable.
    "In scope" means the variable can be used by an executing block or any nested blocks.
    "Out of scope" means the variable is no longer available and cannot be used.

/// When are Local Variables in Scope?
    Local variables are always in scope in the block they are declared.
    They are also in scope for any nested blocks or blocks contained within the outer block.
    Local varaibles are always out of scope for outer blocks or the containing blocks they are declared in.

    (ex)
    public static void aMethod(boolean aBoolean) {
    if (aBoolean) {
        int myCounter = 10;                 // myCounter is local to this if block
        }
        System.out.println(myCounter);      // myCounter is out of scope here
    }
/// Scope Best Practices
    It is considered best practice:
        To declare and initalize variables in the same place possible.
        And to declare om the narrowest scope possible.

/// Local Variables and the For Statement
    In this "for" statement, as part of the declaration there is an initialization part.
    In this case the variable i isn't accessible outside of the loop.
    It's because any variables declared in the init section are local to the loop meaning they exist and are accessible in memory
    only while the loop is executing and only to the loop code block.
    (ex)
    {   // Starts on outer block - for example a method block
        for (int i = 1; i <= 5; i++) { // i declared in for loop declaration
            System.out.println(i);
        }
      System.out.println(i);   // ERROR! i is out of scope
    }

/// Declaring variables in a switch statement block
    Local variables declared in an if statement block are not accessible outside of that block.
    This also includes other parts of the if statement like the else if block or the else block.
    (ex)
    public static void aMethod (int counter) {
        if (counter > 0) {
            int i = 10;
        }
        else {
            System.out.println(i); // ERROR : i is out of scope
        }

        System.out.println(i); // ERROR : i is out of scope
    }

    However the switch statement is different from the if-then-else statement blocks.
    (ex)
    public static void aMethod (int value) {
        switch (value) {
            case 1:
                int i = 10;
                break;

            default:
                i = value;              // ok
                System.out.println(i);  // ok
                break;
        }
        System.out.println(i); // ERROR : i is out of scope outside of the switch
    }

    (ex2)
    public static void aMethod(int value) {
        switch (value) {
            case 1:
                System.out.println(i); // this is NOT ok, i declared below
                break;
            case 2:
                int i = 10;
                System.out.println(i); // this is ok
            default:
                i = value; // this is ok
                System.out.println(i); // this is ok
                break;
        }
        System.out.println(i); // ERROR : i is out of scope outside the switch
    }
 */
//// Understanding Classes, Objects, And Static Versus Instance Members  ----------------------------------------
/*
/// The class, The object, static & instance fields and methods
/// The Class
    The Class can be described as:
    - a custom data type
    - a special code block that contains methods

/// The class is a template for creating objects

/// An Object
    An object is called an instance of a particular class

/// Declaring and instantiating a new object from a Class
    The most common way to create an object is to use the new keyword.
    The new keyword creates an instance of a class, and you can optionally pass data when creating that instance to set up data on that object.
    Looking at the String it's actually a class. But it holds a special place in the Java language because we can create a String just by using a literal which we've seen.
    ex) String s = "Hello";
    ex) String s = new String("Hello");

/// Static and Instance fields
    Static field
        - Requires 'static' keyword when declared on the class.
        - Value of the field is stored in special memory location and only in one place.
        - Value is accessed by ClassName.fieldname
        - ex) Integer.MAX_VALUE
    Instance Field
        - Omits 'static' keyword when declared in the class.
        - Value of the field is not allocated any memory and has no value until the object is created.
        - Value is accessed by ObjectVariable.fieldname
        - ex) myObject.myFieldName (myObject is our variable name for an object we create and myFieldName is an attribute on the class)
    Static Method
        - Requires 'static' keyword when declared on the class.
        - Method is accessed by ClassName.methodName
        - ex) Integer.parseInt("123);
        - A method called parseInt is called directly from the Class, Integer
    Instance Method
        - Omits 'static' keyword when declared on the class
        - Method is accessed by ObjectVariable.methodName
        - ex) "hello".toUpperCase();
        - A method called toUpperCase is called on the instance of a String with value "hello".

 */
//// Parsing Values And Reading Console Input – system.console() Overview  ----------------------------------------
/*
/// Wrapper methods to parse strings to numeric values
    (Wrapper) - (Wrapper Method)
    Integer - parseInt(String)
    Double - parseDouble(String)

    ex) string -> integer
    public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        String usersDateOfBirth = "1999";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth); // this takes a string and returns an integer.

        System.out.println("Age = " + (currentYear - dateOfBirth));
        }
    }

    ex) string -> double
    public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        String usersDateOfBirth = "1999";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));

        String usersAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("Age = " + ageWithPartialYear);
        }
    }

/// Reading data from the console
    // System.in
        - Reads input from the console or terminal.
    // System.console
        - Easier support for reading a single line and prompting user for information.(Doesn't work with IDEs)
    // Command Line Arguments
        - Calling the Java program and specifying data in the call. Very commonly used but doesn't let creating an interactive application in a loop.
    // Scanner
        - A common way to read input, either using System.in or a file.

    ex)
    public class Main {
    public static void main(String[] args) {
//        int currentYear = 2022;
//        String usersDateOfBirth = "1999";
//
//        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
//
//        System.out.println("Age = " + (currentYear - dateOfBirth));
//
//        String usersAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
//        System.out.println("Age = " + ageWithPartialYear);

        int currentYear = 2022;
        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));

    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, what's your name?");
        System.out.println("Hi " + name + ", thanks for taking the course!");
        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old!";
    }

    public static String getInputFromScanner(int currentYear) {
        return "";
        }

    }

 */
//// Handling Exceptions And Introducing The Scanner Class  ----------------------------------------
/*
/// What's an exception?
    An exception is an error that happens in code.
    Some types of errors can be predicted and named.

/// Catching an exception
    An exception is caught first by creating a code block around the code that gets the error.
    This is done with the try statement code block.
    The try statement actually has two code blocks.
    The first is declared directly after the try keyword and this code block ends and is followed by the declaration of the catch keyword.
    The catch keyword includes the declaration of variables, in parentheses and then has its own code block.
        ex)
        try {
            // statements that might get errors
        } catch (Exception e) {
            // code to 'handle' the exception
        }

/// The Scanner class
    The Scanner class is described as a simple text scanner, which can parse primitive types and strings
    To use the Scanner class, we have to create an instance of Scanner.
    This means we're creating an object of type Scanner.
    The new keyword is used in what Java calls a Class Instance Creation Expression.
    In its simplest form it's the word new, followed by the class name, and empty parentheses.
    ex)
        ClassName variableName = new ClassName();
    We can optionally pass arguments in those parentheses, as we saw in methods.
        ClassName variableName = new ClassName(argument1, argument2);
    We saw that we could do this with the String class, passing the text in the parentheses.

/// Instantiating Scanner
    For reading input from the console or terminal, we instantiate a scanner object using new, followed by the Scanner class name,
    and passing System.in as an argument, in the parentheses.
        ex) Scanner sc = new Scanner(System.in);
    For reading input from a file, we instantiate a scanner object using new, again with the scanner class name
    but pass a file object as an argument in the parentheses.
        ex) Scanner sc = new Scanner(new File("nameOfFileOnFileSystem"));

/// Using the import statement
    Java provides a library of code, which includes the Scanner class in a library called java.util.
    ex) import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2026;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, what's your name?");
        System.out.println("Hi " + name + ", thanks for taking the course!");
        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old!";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hi, what's your name?"); // System.console will cause an error within the IDE
        System.out.println("Hi, what's your name?");
        String name = scanner.nextLine(); // waiting for input, and saving it in the name variable
        System.out.println("Hi " + name + ", thanks for taking the course!");
//        String dateOfBirth = System.console().readLine("What year were you born?");
        System.out.println("What year were you born?");
        String dateOfBirth = scanner.nextLine(); // waiting for input, and saving it in the name variable
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old!";
        }

    }
 */
////  Reading Input With The Scanner For Seamless User Interaction  ----------------------------------------
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int currentYear = 2022;
//        String usersDateOfBirth = "1999";
//
//        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
//
//        System.out.println("Age = " + (currentYear - dateOfBirth));
//
//        String usersAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
//        System.out.println("Age = " + ageWithPartialYear);

        int currentYear = 2026;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, what's your name?");
        System.out.println("Hi " + name + ", thanks for taking the course!");
        String dateOfBirth = System.console().readLine("What year were you born?");

        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old!";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hi, what's your name?"); // System.console will cause an error within the IDE
        System.out.println("Hi, what's your name?");
        String name = scanner.nextLine(); // waiting for input, and saving it in the name variable
        System.out.println("Hi " + name + ", thanks for taking the course!");
//        String dateOfBirth = System.console().readLine("What year were you born?");
        System.out.println("What year were you born?");

        boolean validDOB = false; // 기본값 false (아직 검증 안 됨)
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <=" + (currentYear)); // 유효한 연도 범위 안내 (예: 1901년 ~ 2026년)
            try {
                age = checkData(currentYear, scanner.nextLine()); // scanner.nextLine()으로 입력받은 문자열을 checkData 메서드로 전달하여 검증 및 나이 계산
                validDOB = (age < 0) ? false : true; // 삼항 연산자: checkData의 결과가 -1(잘못된 범위)이면 false, 정상이면 true
//            String dateOfBirth = scanner.nextLine(); // waiting for input, and saving it in the name variable
//            age = currentYear - Integer.parseInt(dateOfBirth);
            } catch (NumberFormatException badUserData) { // 사용자가 숫자가 아닌 문자("abc" 등)를 입력해서 Integer.parseInt()에서 에러가 터졌을 때 실행
                System.out.println("Characters not allowed. try again");
            }
        } while (!validDOB); // validDOB가 false인 동안 계속 반복 (올바른 값이 들어와 true가 되면 반복 종료)
        return "So you are " + age + " years old!";
    }

    public static int checkData(int currentYear, String dateOfBirth) {  // 1. 문자열을 정수로 변환 (숫자가 아닌 글자가 섞여 있으면 여기서 NumberFormatException 발생 -> 호출한 쪽 catch문으로 이동)
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125; // 2. 허용 가능한 최소 출생년도 계산 (현재 연도 - 125세)
        if ((dob < minimumYear) || (dob > currentYear) ) { // 3. 유효 범위 체크: 출생년도가 너무 옛날(125세 초과)이거나, 미래 연도인 경우
            return -1; // -1 is used a lot for showing invalid value(bad data)
        }
        return (currentYear - dob); // 4. 모든 검증을 통과하면 정상 나이를 계산하여 리턴
    }

}
*/
//// Hands-On Reading User Input Challenge For Practical Mastery --------------------------------------------
/*
/// Reading User Input Challenge
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ": ");
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("The sum of the 5 numbers = " + sum);
    }

}

<double version>
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;
        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ": ");
            String nextNumber = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("The sum of the 5 numbers = " + sum);
    }

}

<do while version>


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;
        do {
            System.out.println("Enter number #" + counter + ": ");
            String nextNumber = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                counter++; // try 블록 내부에 있는 이유는 유효한 값(올바른 숫자)이 들어올 때만 counting
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        } while (counter <= 5);
        System.out.println("The sum of the 5 numbers = " + sum);
    }

}

*/
//// Identifying Min And Max Values – A Final Control Flow Challenge  -------------------------------------------
/// Minimum and Maximum Challenge
/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0; // 최댓값, 최솟값, 정상 입력 횟수를 저장할 변수 초기화
        double min = 0;
        int loopCount = 0;

        while (true) { // 무한 루프: 사용자가 문자를 입력할 때까지 계속 숫자를 입력받음
            System.out.println("Enter a number, or any character to exit: ");
            String nextEntry = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry); // 입력받은 문자열을 소수점(double) 숫자로 변환
                if (loopCount == 0 || validNum < min) { // 첫 번째 입력(loopCount == 0)일 때는 입력받은 숫자 자체를 min의 기준점으로 설정
                    min = validNum;                     // 두 번째 입력부터는 기존 min값보다 더 작은 숫자가 들어왔을 때만 min 갱신
                }
                if (loopCount == 0 || validNum > max) { // 첫 번째 입력(loopCount == 0)일 때는 입력받은 숫자 자체를 max의 기준점으로 설정
                    max = validNum;                     // 첫 번째 입력이거나, 기존 max값보다 더 큰 숫자가 들어왔을 때만 max 갱신
                }
                loopCount++; // 유효한 숫자가 들어왔으므로 카운트 1 증가(try 블록 내부에 있는 이유는 유효한 값(올바른 숫자)이 들어올 때만 counting)
            } catch (NumberFormatException nfe) { // 사용자가 숫자가 아닌 문자("q", "exit" 등)를 입력해 Double.parseDouble()에서 에러가 터지면 실행
                break; // 이 상황을 '종료 신호'로 판단하고 while 무한 루프를 탈출
            }
        }
        if (loopCount > 0) { // 숫자가 1개라도 정상 입력되었을 경우 최솟값과 최댓값 출력
            System.out.println("min = " + min + ", max = " + max);
        } else { // 처음부터 숫자가 아닌 문자를 입력해 loopCount가 0인 경우
            System.out.println("No vaild data entered");
        }

    }

}

*/
///// Section 7 : Mastering Java OOP : Classes & Inheritance ----------------------------------------------------
//// Deep Dive into Classes & Objects ---------------------------------------------------
/*
/// Object-Oriented Programming(OOP)
    Object-Oriented Programming is a way to model real-world objects as software objects which contain both data and code.
    OOP is a common acronym for Object-Oriented-Programming.

/// Class-based Programming
    Class based programming starts with classes which become the blueprints for objects.

/// State and Behavior
    Real-world objects have two major components: state and behavior.

    /// State(computer)
        State in terms of a computer object might be;
            - The amount of Ram it has
            - The operating system it's running
            - The hard drive size
            - The size of the monitor
            - etc.
    /// Behavior(computer)
        Behavior or hactions that can be preformed by a computer object might be;
            - Booting up
            - Shutting down
            - Beeping or outputting some form of sound
            - Drawing something on the screen
            - etc.

    Modelling real world objects as software objects is a fundamental part of Object-Oriented Programming.
    A software object stores its state in fields which can also be called variables or attributes.
    Objects expose their behavior with methods.
    Think of a class as a template or a blueprint for creating objects.

/// The class as the blueprint
    The class describes the data (fields) and the behavior(methods) that are relevant to the real-world object we want to describe.
    These are called class members.
    A class member can be a field or a method, or some other type of dependent element.
    If a field is static there is only one copy in a memory, and this value is associated with the class or template itself.
    If a field is not static it's called in instance field, and each object may have a different value stored for this field.
    A static method can't be dependent on any one object's state, so it can't reference any instance members.
    In other words any method that operates on isntance fields needs to be non-static.

// Organizing classes
    Classes can be orgainzed into logical groupings which are called packages.
    You declare a package name in the class using the package statement.
    If you don't declare a package, the class implicitly belongs to the default package.

/// Access modifiers
    A class is said to be a top-level class if it's defined in the source code file and not enclosed in the code block of another class, type, or method.
    A top-level class has only two valid modifier options: public or none.
        public : public means any other class in any package can access this class.
        "    " : When the modifier is omitted, this has a special meaning called package access, meaning the class is accessible only to classes in the same package.

/// Access modifiers for class members
    An access modifier at the member level allows granular control over
    The valid access modifiers are shown in the table from the least restrictive to the most restrictive
    (Access Keyword) - (Description)
    public : public means any other class in any package can access this class
    protected : protected allows classes in the same package, and any subclasses in other packages to have access to the member.
    "     " : When the modifier is omitted this has a special meaning called package access, meaning the member is accessible only to classes in the same package
    private : private means that no other class can access this member

/// Encapsulation
    Encapsulation in Object-Oriented Programming usually has two meanings.
    One is the bundling of behavior and attributes on a single object.
    The other is the practice of hiding fields and some methods from public access.

public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describeCar () {
        System.out.println(doors + "-Door" +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}

*/

//// Getters, Encapsulation, and Object Access ---------------------------------------------------
/*

 */


//// Setters, Object Creation, and OOP Practice ---------------------------------------------------
//// Classes Challenge : Building a Bank Account ---------------------------------------------------
//// Constructors Part 1 : Object Initialization ---------------------------------------------------
//// Constructors Part 2 : Overloading and Chaining ---------------------------------------------------
//// Constructor Challenge : Building Customer Data ---------------------------------------------------
//// Understanding References, Objects and Instances ---------------------------------------------------
//// Static vs Instance Methods Explained ---------------------------------------------------
//// POJOs : Plain Old Java Objects ---------------------------------------------------
//// Java Records : The Modern POJO Approach ---------------------------------------------------
//// Inheritance - Part 1 : The Basics ---------------------------------------------------
//// Inheritance - Part 2 : Extending Animal Class ---------------------------------------------------
//// Inheritance - Part 3 : Unique Dog & Fish Classes ---------------------------------------------------
//// Unveiling java.lang.Object in Java ---------------------------------------------------
//// Inheritance Challenge - Designing a Worker Hierarchy ---------------------------------------------------
//// Inheritance Challenge Part 2 : Specialized Employees ---------------------------------------------------
//// Using this and super for Constructors ---------------------------------------------------
//// Method Overloading vs Overriding Explained ---------------------------------------------------
//// Text Blocks & Advanced Output Formatting ---------------------------------------------------
//// Revisiting the String : Methods and Best Practices ---------------------------------------------------
//// Mastering String Manipulation Methods ---------------------------------------------------
//// The StringBuilder : Efficient Mutable Strings ---------------------------------------------------







