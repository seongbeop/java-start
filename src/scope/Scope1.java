package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10; // m 변수 생존 시작
        if (true) {
            int x = 20;// x 변수 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }// x 생존 종료
        //System.out.println(x);
        System.out.println("if m = " + m);
    }//m 생존 종료
    //System.out.println("if m = " + m);
 // 변수의 접근가능한 범위를 Scope 라고 한다!
}
