package array.ex;

import java.util.Scanner;

public class ProductAdminEx_practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxProduct = 10;
        String[] productName = new String[maxProduct];
        int[] productPrice = new int[maxProduct];
        int productCount = 0;
        int menu;

        while(true){
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요:");
            menu = scanner.nextInt();
            scanner.nextLine();

            if(menu == 1){
                if(productCount >= maxProduct){
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품의 이름을 입력하세요: ");
                productName[productCount] = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                productPrice[productCount] = scanner.nextInt();
                productCount++;

            } else if (menu == 2){
                if(productCount == 0){
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for(int i = 0; i < productCount; i++){
                    System.out.println(productName[i]+": "+productPrice[i]);
                }

            } else if (menu == 3){
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}
