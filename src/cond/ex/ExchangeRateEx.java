package cond.ex;

public class ExchangeRateEx {

    public static void main(String[] args) {
        int dollar = 11;


        if (dollar < 0 ) {
            System.out.println("잘못된 금액");
        } else if (dollar == 0) {
            System.out.println("환전할 금액 없음");
        } else if (dollar > 0 ) {
            int exchange = dollar * 1300;
            System.out.println("환전금액은"+ exchange +"입니다");
        }
    }
}
