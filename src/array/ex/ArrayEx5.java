package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average;

        System.out.println("입력받을 숫자의 개수를 입력하세요 : ");
        int num = scanner.nextInt();

        System.out.println(num + "개의 정수를 입력하세요 !");
        int[] numbers = new int[num];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        System.out.println("합계 : " + sum);
        average = (double) sum / numbers.length;
        System.out.println("평균 : " + average);

    }
}

