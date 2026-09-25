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
