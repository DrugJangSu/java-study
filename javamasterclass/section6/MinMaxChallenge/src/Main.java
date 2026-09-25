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
