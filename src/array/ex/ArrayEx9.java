package array.ex;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        //상품 등록 : 상품의 이름과 가격을 입력받아 저장한다
        // 상품 목록 : 지금까지 등록한 모든 상품의 목록을 출력한다

        //1. 상품등록 , 2. 상품 목록 , 3.종료
        //1 -> 사용자로부터 상품 이름과 가격을 입력받아 배열에 저장한다
        //2 -> 배열에 저장된 모든 상품을 출력한다
        //3 -> 프로그램을 종료
        // 최대 상품은 10개까지

        Scanner scanner = new Scanner(System.in);
        int maxProduct = 10;
        String[] productNames = new String[maxProduct] ;//상품 이름을 저장할 배열
        int[] productPrices = new  int[maxProduct]; // 상품 가격을 저장할 배열
        int productCount = 0; // 현재 등록된 상품의 개수를 저장할 변수

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료 ");
            System.out.print("메뉴를 선택하세요 : ");

            int selector = scanner.nextInt();
            scanner.nextLine();

            if (selector == 1 && productCount < maxProduct) {
                System.out.print("상품 이름을 입력하세요 : ");
                productNames[productCount] = scanner.next();
                System.out.print("상품 가격을 입력하세요 : ");
                productPrices[productCount] = scanner.nextInt();
                productCount++;

            } else if (selector == 1 && productCount >= maxProduct) {
                    System.out.println("더이상 상품을 등록할 수 없습니다.");
            } else if (selector == 2 && productCount > 0 ) {
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + " : " + productPrices[i]);
                }
            } else if (selector == 2 && productCount == 0) {
                System.out.println("등록된 상품이 없습니다.");
            } else if (selector == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            }
            else {
                System.out.println("올바른 숫자를 입력하세요.");

            }
        }


    }
}
