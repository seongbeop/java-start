package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        //2x3의 배열을 만든다.
        int[][] arr = new int[2][3]; //행2 , 열3

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for (int row = 0; row < 2; row++) {
            System.out.print(arr[row][0]);
            System.out.print(arr[row][1]);
            System.out.print(arr[row][2]);
            System.out.println();
        }

//
//        // 0행 출력
//        System.out.print(arr[0][0] +  " "); // 0열 출력
//        System.out.print(arr[0][1] +  " "); // 1열 출력
//        System.out.print(arr[0][2] +  " "); // 2열 출력
//        System.out.println(); // 행 끝나면 라인 변경
//        //1행 출력
//        System.out.print(arr[1][0] +  " "); // 0열 출력
//        System.out.print(arr[1][1] +  " "); // 1열 출력
//        System.out.print(arr[1][2] +  " "); // 2열 출력
//        System.out.println(); // 행 끝나면 라인 변경
    }
}
