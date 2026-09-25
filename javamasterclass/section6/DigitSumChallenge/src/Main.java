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
