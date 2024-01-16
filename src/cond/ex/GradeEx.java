package cond.ex;

public class GradeEx {

    public static void main(String[] args) {

        String grade = "D";

        switch (grade) {
            case "A" -> {
                System.out.println("탁월한 성과");
            }case "B" -> {
                System.out.println("좋은 성과");
            }case "C" -> {
                System.out.println("준수한 성과");
            }case "D" -> {
                System.out.println("향싱이 필요합니다");
            }case "F" -> {
                System.out.println("불합격입니다");
            }
        }
    }
}
