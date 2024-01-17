package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }


    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else { // else 가 없을 때 missing return statement !
            return false;
        }

    }
}
