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