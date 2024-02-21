package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자, 두 번째 숫자 모두 0 입력하면 프로그램 종료됩니다.");
        while(true){
            System.out.print("첫 번째 숫자를 입력하새요:");
            int num1 = scanner.nextInt();
            System.out.print("첫 번째 숫자를 입력하새요:");
            int num2 = scanner.nextInt();
            int sum = num1 + num2;
            System.out.println("두 숫자의 합:"+sum);

            if(num1 == 0 && num2 == 0){
                System.out.print("프로그램을 종료합니다.");
                break;
            }

        }
    }
}
