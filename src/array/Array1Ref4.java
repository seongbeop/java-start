package array;

public class Array1Ref4 {
    public static void main(String[] args) {

        int[] students = {90, 80, 70, 60, 50, 40, 30, 20, 10}; // 배열 생성과 초기화
    // 선언 하면서 동시에 !

        //변수 값 대입
        for (int i = 0; i < students.length ; i++) {
            System.out.println("학생 " + (i +1) + " 점수 : " +students[i]);
        }


    }
}
