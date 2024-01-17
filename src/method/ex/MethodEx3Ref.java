package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(balance, 500);
        balance = withdraw(balance, 2000);
        System.out.println("최종 잔액 : " + balance + "원");

        //입금 500
//        int depositAmount = 1000;
//        balance += depositAmount;
//        System.out.println(depositAmount + " 원을 입금 하였습니다. 현재 잔액 : " + balance + " 원");

//        //출금 200
//        int withdrawAmount = 2000;
//        if (balance >= withdrawAmount) {
//            balance -= withdrawAmount;
//            System.out.println(withdrawAmount + " 원을 출금하였습니다" + balance + " 원");
//        } else {
//            System.out.println(withdrawAmount + " 원을 출금하려 했으나 잔액이 부족합니다.");
//
//        }
//        System.out.println("최종 잔액 : " + balance + "원");
    }

    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + " 원을 입금 하였습니다. 현재 잔액 : " + balance + " 원");
        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + " 원을 출금하였습니다 " + balance + " 원");
        } else {
            System.out.println(withdrawAmount + " 원을 출금하려 했으나 잔액이 부족합니다.");

        }
        return balance;
    }

}
