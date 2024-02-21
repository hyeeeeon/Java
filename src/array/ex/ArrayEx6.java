package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //n개의 정수 입력 받기
        System.out.println("입력받을 숫자의 개수를 입력하세요:");
        int count = 0;
        count = scanner.nextInt();

        int[] num = new int[count];
        int maxNumber =0;
        int minNumber = 0;

        //n개의 정수 배열 저장
        System.out.println(count+"개의 정수를 입력하세요:");

        for(int i = 0; i < count; i++){
            num[i] = scanner.nextInt();
        }

        //max, min 수 구하기
        minNumber = maxNumber = num[0];
        for(int i = 1; i < count; i++){
            if(num[i] < minNumber){
                minNumber = num[i];
            }
            if(num[i] > maxNumber){
                maxNumber = num[i];
            }
        }

        System.out.println("가장 큰 정수: "+maxNumber);
        System.out.println("가장 작은 정수: "+minNumber);
    }
}
