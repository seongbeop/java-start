package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5];

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        for (int i = 0; i < students.length ; i++) {
            System.out.println("학생 " + (i +1) + " 점수 : " +students[i]);
        }

//
//        System.out.println(students);
//        System.out.println("학생 1 점수 : " + students[0]);
//        System.out.println("학생 2 점수 : " + students[1]);
//        System.out.println("학생 3 점수 : " + students[2]);
//        System.out.println("학생 4 점수 : " + students[3]);
//        System.out.println("학생 5 점수 : " + students[4]);
    }
}
