package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 12;

        if(price >= 10000){
           price = price - 1000;
        }

        if (age <= 10){
            price = price - 1000;
        }
        System.out.println("price: " + price + "원");
    }
}
