/*
- Create a for loop using a range of numbers from 1 to 1000 inclusive
- Sum all the numbers that can be divided by both 3 and 5.
- Print out the numbers that have met the above conditions.
- Break out of the loop once you have found 5 numbers that met the conditions above.
- After breaking out of the loop, print the sum of the numbers that met the conditions above.
*/

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