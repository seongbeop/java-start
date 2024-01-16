package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세요 ! ");
        int count = scanner.nextInt();
        System.out.println(count + "개의 정수를 입력하세요");

        int[] numbers = new int[count];
        int min = 0;
        int max = 0;

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            if (i == 0) {
                min = numbers[i];
                max = numbers[i];

            } else {
                if (max < numbers[i]) {
                    max = numbers[i];
                } else if (min > numbers[i]) {
                    min = numbers[i];
                }

            }

        }
        System.out.println("가장 큰 수 " + max);
        System.out.println("가장 작은 수 " + min);

    }
}
