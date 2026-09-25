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
//        int j = 1;
//        boolean isReady = false;
//        do {                    // do 안의 코드를 먼저 실행
//            if (j > 5) {        // j가 5보다 커졌는지 확인
//                break;          // j가 5보다 크면 do-while문 종료
//            }
//            System.out.println(j);
//            j++;
//        }  while (isReady); // do블록 실행 이후 여기서 isReady 값을 확인함. isReady가 true이면 do로 돌아가 다시 실행. false이면 반복 종료
//

        // continue
        int number = 0; // 변수를 0부터 시작
        while (number < 50) { // number가 50보다 작은 동안 반봅
            number += 5; // 매번 number에 5 더하기
            if (number % 25 == 0) { // number가 25로 나누어 떨어지는지 확인(25의 배수)
                continue; // 해당되면 해당 반복을 끝내고 다음 반복으로 넘어감 (vs break : 반복문 자체 종료)
            }
            System.out.print(number + "_");
        }






    }
}
