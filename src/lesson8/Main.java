package lesson8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        //task2(arr);
        //task3(arr);
        task4(arr);

    }

    private static void task4(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(21);
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }

    }

    private static void task3(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(99);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }

    private static void task2(int[] arr) {
        for (int i = 1; i <= 99; i += 2) {
            int j = 0;
            arr[j] = i;
            j++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 49; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
