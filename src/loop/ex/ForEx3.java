package loop.ex;

public class ForEx3 {

    public static void main(String[] args) {
        int sum = 0;
        int max = 100;
        for (int i = 1; i <= max; i++) {
            sum = sum + i;
        }
        System.out.println("max : " + max + " sum : "+ sum);
    }
}
