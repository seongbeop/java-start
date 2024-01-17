package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int selector;
        int balance = 0;

        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("--------------------------------------");
            System.out.print("선택 : ");
            int selector = scanner.nextInt();
            int amount;
            if (selector == 1) {
                System.out.print("입금액을 입력하세요 : ");
                amount = scanner.nextInt();
                balance = deposit(balance, amount);

                //입금
            } else if (selector == 2) {
                System.out.print("출금액을 입력하세요 : ");
                amount = scanner.nextInt();
                balance = withdraw(balance, amount);
                //출금
            } else if (selector == 3) {
                checkBalance(balance);
                //잔액확인
            } else if (selector == 4) {
                System.out.println("프로그램을 종료합니다 .");
                break;
                //종료
            } else {
                System.out.println("올바른 번호를 입력하세요.");
            }
        }
    }

    public static int deposit(int balance, int n) {
        balance += n;
        System.out.println(n + "원을 입금하였습니다. 현재 잔액 : " + balance);
        return balance;
    }
    public static int withdraw(int balance, int n) {
        if (balance >= n) {
            balance -= n;
            System.out.println(n + "원을 출금하였습니다. 현재 잔액 : " + balance);
        } else if (balance < n) {
            System.out.println(n + "원을 출금하려 했으나, 잔액이 부족합니다.");
        }
        return balance;

    }
    public static int checkBalance(int balance) {
        System.out.println("현재 잔액은 " + balance +  "원 입니다.");
        return balance;
    }

}
