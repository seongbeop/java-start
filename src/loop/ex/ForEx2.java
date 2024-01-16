package loop.ex;

public class ForEx2 {

    public static void main(String[] args) {
        int num = 2;
        for (num = 2; num <= 20; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
