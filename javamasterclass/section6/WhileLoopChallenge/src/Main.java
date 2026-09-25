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