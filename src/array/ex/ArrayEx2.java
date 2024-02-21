package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요:");
        int[] numbers = new int[5];

        //정수 5개 입력 받기
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
            for(int j = 0; j < numbers.length; j++){
                System.out.print(numbers[j]);
            //쉼표 출력
            if(j != numbers.length - 1) {
                System.out.print(",");
            }
        }
    }
}
