package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("음식 이름을 입력하세요 : ");
        String foodName = input.nextLine();

        System.out.println("음식 가격을 입력하세요 : ");
        int foodPrice = input.nextInt();

        System.out.println("음식 수량을 입력하세요: ");
        int foodQuantity = input.nextInt();

        System.out.println(foodName + " 을 " + foodQuantity + "개 주문 하였습니다. 가격은 " + foodPrice * foodQuantity + "원 입니다.");

    }
}
