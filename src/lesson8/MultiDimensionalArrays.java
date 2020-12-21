package lesson8;

import java.util.Random;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(50);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=============================");
//        task1(arr);  //первые два задания сделал что бы работали не только для квадратной матрицы
//        task2(arr);
//        task3(arr);
//        task4(arr);
        task5(arr);
    }

    private static void task5(int[][] arr) {
        int[][] arrTrans = new int[arr.length][arr.length];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                arrTrans[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < arrTrans.length; i++) {
            for (int j = 0; j < arrTrans.length; j++) {
                System.out.print(arrTrans[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void task4(int[][] arr) {
        int sumEvenNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][j] % 2 == 0) {
                    sumEvenNumbers += arr[i][j];
                }
            }
        }
        System.out.println(sumEvenNumbers);
    }

    private static void task3(int[][] arr) {
        int max = 1;
        String numberDiagonal = null;
        for (int k = 0; k < arr.length; k++) {
            int i = 0;
            int mpv = 1;
            for (int j = k; j < arr.length; j++) {
                mpv *= arr[i][j];
                i++;
            }
            if (mpv > max) {
                max = mpv;
                numberDiagonal = "Произведение диагонали 0 : " + k;
            }
        }
        for (int k = 1; k < arr.length; k++) {
            int mpv = 1;
            int j = 0;
            for (int i = k; i < arr.length; i++) {
                mpv *= arr[i][j];
                j++;
            }
            if (mpv > max) {
                max = mpv;
                numberDiagonal = "Произведение диагонали " + k + " : 0";
            }
        }
        System.out.println(numberDiagonal);
        System.out.println(max);
    }

    private static void task2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int limiter = i;
            if (i == arr[0].length) {
                limiter = i - 1;
            }
            for (int j = 0; j <= limiter; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void task1(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr[0].length) {
                if (arr[i][i] % 2 == 0) {
                    sum += arr[i][i];
                }
            }
        }
        System.out.print(sum);
    }
}
