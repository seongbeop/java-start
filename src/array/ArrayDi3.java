package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        //2x3의 배열을 만든다.
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; //행2 , 열3


//        int[][] arr = new int[][]{
//                {1,2,3},
//                {4,5,6}
//        }; //행2 , 열3
//
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0 ; column < arr[row].length ; column ++){
                System.out.print(arr[row][column] + " ");

            }
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
