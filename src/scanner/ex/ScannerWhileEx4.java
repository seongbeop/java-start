package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String product;
        int cost;
        int quantity;
        int total = 0;

        while (true){
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            num = scanner.nextInt();
            if (num == 1) {
                System.out.println("상품명을 입력하세요 : ");
                product = scanner.next();
                System.out.println("상품의 가격을 입력하세요 : ");
                cost = scanner.nextInt();
                System.out.println("구매 수량을 입력하세요 : ");
                quantity = scanner.nextInt();
                total += (cost * quantity);
                System.out.println("상품명 : " + product + " 가격 : " + cost + " 합계 : " + (cost * quantity));
            } else if (num == 2) {
                System.out.println("총 가격 : " + total);
                total = 0;
            } else if (num == 3) {
                System.out.println("프로그램 종료 !");
                break;
            } else {
                System.out.println("올바른 옵션을 선택하세요");
            }
        }



    }
}
