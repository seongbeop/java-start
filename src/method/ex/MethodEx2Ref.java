package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String massage = "Hello World!";

//        for (int i = 0; i < 3; i++) {
//            System.out.println(massage);
//
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(massage);
//
//        }
//        for (int i = 0; i < 7; i++) {
//            System.out.println(massage);
//
//        }

        printMessage(massage,3);
        System.out.println("@@");
        printMessage(massage,5);
        System.out.println("@@");

        printMessage(massage,7);
    }

    public static void printMessage(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);

        }
    }
}
