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
