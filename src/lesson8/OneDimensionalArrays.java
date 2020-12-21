package lesson8;

import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArrays {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr1 = new int[10];
        //task2(arr);
        //task3(arr);
        //task4(arr);
        //task5(arr, arr1);
        //task6(arr);
        //task7(arr);
        //task8(arr,arr1);
        //task9();
        task10();
    }

    private static void task10() {
        Scanner scanner = new Scanner(System.in);
        int n;
        int counterEvenNumber = 0;
        while (true) {
            System.out.println("Введите число больше 3");
            n = scanner.nextInt();
            if (n > 3) {
                break;
            } else {
                System.out.println("Вы ввели неверное число");
            }
        }
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0 && arr[i] > 0) {
                counterEvenNumber++;
            }
        }
        if (counterEvenNumber > 0) {
            System.out.println();
            int[] arrEvenNumber = new int[counterEvenNumber];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0 && arr[i] > 0) {
                    arrEvenNumber[j] = arr[i];
                    System.out.print(arrEvenNumber[j] + " ");
                    j++;
                }
            }
        }
    }

    private static void task9() {
        int arrLength;
        int sum1 = 0;
        int sum2 = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите положительно число");
            arrLength = scanner.nextInt();
            if (arrLength > 0) {
                break;
            }
        }
        int[] arr = new int[arrLength];
        Random random = new Random();
        for (int i = 0; i < arrLength; i++) {
            arr[i] = random.nextInt(15);
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i < arrLength / 2; i++) {
            sum1 += arr[i];
            sum2 += arr[arrLength - 1 - i];
        }
        if (sum1 > sum2) {
            System.out.println("Сумма левой части массива больше");
        } else if (sum1 < sum2) {
            System.out.println("Сумма левой части массива меньше");
        } else {
            System.out.println("Суммы равный");
        }
        scanner.close();
    }

    private static void task8(int[] arr, int[] arr1) {
        double[] arrDoub = new double[10];
        Random random = new Random(1);
        StringBuilder builderArr1 = new StringBuilder();
        StringBuilder builderArrDoub = new StringBuilder();
        StringBuilder builderInt = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            arr1[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
            builderArr1.append(arr1[i] + " ");
            arrDoub[i] = (double) arr[i] / arr1[i];
            builderArrDoub.append(arrDoub[i] + " ");
            if (arrDoub[i] % 1 == 0) {
                builderInt.append(arrDoub[i] + " ");
            }
        }
        System.out.println();
        System.out.println(builderArr1);
        System.out.println(builderArrDoub);
        System.out.println(builderInt);
    }


    private static void task7(int[] arr) {
        Random random = new Random();
        int maxElement = 0;
        int maxElementIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
            System.out.print(arr[i] + " ");
            if (maxElement <= arr[i]) {
                maxElement = arr[i];
                maxElementIndex = i;
            }
        }
        System.out.println();
        System.out.print("последнее вхождение " + maxElementIndex);

    }

    private static void task6(int[] arr) {
        Random random = new Random();
        boolean isIncreasing = true;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isIncreasing = false;
            }
        }
        if (isIncreasing) {
            System.out.println("Массив является возрастающим");
        } else {
            System.out.println("Массив не является возрастающим");
        }
    }

    private static void task5(int[] arr, int[] arr1) {
        Random random = new Random();
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
            arr1[i] = random.nextInt(15);
            sum += arr[i];
            sum1 += arr1[i];
        }
        sum = sum / arr.length;
        sum1 = sum1 / arr.length;
            if (sum > sum1) {
                System.out.println(sum + " больше " + sum1);
            } else if (sum < sum1) {
                System.out.println(sum + " меньше " + sum1);
            } else {
                System.out.println(sum + " равны " + sum1);
            }

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
