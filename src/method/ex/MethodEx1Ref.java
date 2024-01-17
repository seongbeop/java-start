package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {

//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        int sum = a + b + c;
//        double average = sum / 3.0;
//        System.out.println("평균 값 : " + average);
//
//        int x = 15;
//        int y = 25;
//        int z = 35;
//
//        sum = x + y + z;
//        average = sum / 3.0;
//        System.out.println("평균 값 : " + average);
//
        average(1, 2, 3);
        average(15, 25, 35);
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균 값 : " + average);
        return average;
    }
}
