package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        int count = 0;
        double average = 0;

        System.out.println("숫자를 입력하세요.(입력 중단은 -1 입력) :");
        while(true) {
            num = scanner.nextInt();

            if (num == -1) {
                break;
            }
            sum += num;
            count++;
        }
        average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
