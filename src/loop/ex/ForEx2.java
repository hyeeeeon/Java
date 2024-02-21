package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        int num = 2;

        for (int count = 1; count <= 20; count++) {
        if(num % 2 == 0){
            System.out.println(num);
        }
        num++;
        }
    }
}
