package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식의 이름을 입력하세요:");
        String str = scanner.nextLine();

        System.out.print("음식의 가격을 입력하세요:");
        int foodPrice  = scanner.nextInt();

        System.out.print("음식의 수량을 입력하세요:");
        int foodQuantity  = scanner.nextInt();

       int totalPrice;
       totalPrice = foodPrice * foodQuantity;

        System.out.println(str + " " + foodQuantity +"개를 주문하셨습니다. 총 가격은 " + totalPrice +"원입니다.");
    }
}
