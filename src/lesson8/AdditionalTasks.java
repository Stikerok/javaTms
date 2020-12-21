package lesson8;

import java.util.Random;

public class AdditionalTasks {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
//        task1(arr);
//        task2(arr);
//        task3(arr);
//        task4(arr);
//        task5(arr);
//        task6(arr);
//        task7(arr);
//        task8(arr);
//        task9(arr);
        task10(arr);
    }

    private static void task10(int[] arr) {
        int max = arr[0];
        int maxI = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxI = i;
            }
        }
        arr[maxI] = arr[0];
        arr[0] = max;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void task9(int[] arr) {
        int min = arr[2];
        for (int i = 4; i < arr.length; i+=2) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    private static void task8(int[] arr) {
        int[] sortedArr = new int[arr.length];
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int mtp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = mtp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != arr[i - 1]) {
                System.out.println(arr[i - 1]);
                break;
            }
        }
    }

    private static void task7(int[] arr) {
        int setValue = 2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == setValue) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static void task6(int[] arr) {
        boolean isSame = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isSame = true;
                }
            }
        }
        if (isSame) {
            System.out.println("Элементы не различны");
        } else {
            System.out.println("Все элементы различны");
        }
    }

    private static void task5(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    private static void task4(int[] arr) {
        int min = arr[1];
        for (int i = 3; i < arr.length; i += 2) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    private static void task3(int[] arr) {
        int count = 0;
        int c = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > c) {
                count += arr[i];
            }
        }
        System.out.println();
        System.out.println(count);
    }

    private static void task2(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                count += arr[i];
            }
        }
        System.out.println();
        System.out.println(count);
    }

    private static void task1(int[] arr) {
        int composition = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                composition *= arr[i];
            }
        }
        System.out.println();
        System.out.println(composition);
    }
}
