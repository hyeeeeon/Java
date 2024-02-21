package practice.method;

public class Method1 {
    public static void main(String[] args) {


       int sum1= add(1,2);
        System.out.println("결과 출력1 : " + sum1);
       int sum2 = add(10,20);
        System.out.println("결과 출력2: " + sum2);

    }
    public static int add(int a, int b){
        int sum;
        sum = a + b;
        System.out.println(a + "+" + b + " 연산 수행");
        return sum;
    }
}
