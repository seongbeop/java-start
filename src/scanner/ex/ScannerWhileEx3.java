package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("숫자를 입력하세요 , 입력을 중단하려면 -1을 입력하세요");
        int sum = 0;
        int count = 0;



        while (true) {
            int num = input.nextInt();

            if (num == -1) {
                break;
            }

            System.out.println(num);
            sum = sum + num;
            count++;


        }
        double average = sum/count;
        System.out.println("숫자들의 합 " + sum);
        System.out.println("숫자들의 평균 " + average);
    }
}
