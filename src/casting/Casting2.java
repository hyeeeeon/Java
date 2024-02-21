package casting;

public class Casting2 {
    public static void main(String[] args) {
        double dsoubleValue = 1.5;
        int intValue = 0;

        //intValue = dsoubleValue; //컴파일 오류 발생
        intValue = (int)dsoubleValue; //형변환
        System.out.println(intValue);
    }
}
