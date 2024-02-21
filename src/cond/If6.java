package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 9;

        if(price >= 10000){
            price = price - 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10){
            price = price - 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인없음");
        }
        System.out.println("price: " + price + "원");
    }
}
