package lesson8;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        int[] field = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        boolean win = false;
        boolean player = true;
        int numberPlayer;
        for (int i = 0; i < 9; i++) {
            if (player) {
                numberPlayer = 1;
            } else numberPlayer = 2;
            int numberCell;
            System.out.println("Ход " + numberPlayer + " игрока");
            while (true) {
                System.out.println("Введите номер квадрата от 1-го до 9-ти:");
                numberCell = scanner.nextInt() - 1;
                if (numberCell >= 0 && numberCell < 9 && field[numberCell] == 0) {
                    break;
                } else {
                    System.out.println("Вы ввели неверное значение!!!");
                }
            }
            if (player) {
                field[numberCell] = 1;
            } else {
                field[numberCell] = 2;
            }
            outputField(field);
            win = checkWiner(numberCell, field);
            if (win) {
                System.out.println("Выйграл " + numberPlayer + " игрок");
                return;
            } else if (i == 8) {
                System.out.println("Ничья");
            }
            player = !player;
        }
        scanner.close();
    }

    public static boolean checkWiner(int numberCell, int[] field) {
        if (numberCell == 0 || numberCell == 1 || numberCell == 2) {
            if (field[0] == field[1] && field[0] == field[2] && field[1] != 0) {
                return true;
            }
            if (field[numberCell] == field[numberCell + 3] && field[numberCell] == field[numberCell + 6]) {
                return true;
            }
        }
        if (numberCell == 3 || numberCell == 4 || numberCell == 5) {
            if (field[3] == field[4] && field[3] == field[5] && field[4] != 0) {
                return true;
            }
            if (field[numberCell] == field[numberCell - 3] && field[numberCell] == field[numberCell + 3]
            && field[numberCell - 3] != 0 && field[numberCell + 3] != 0) {
                return true;
            }
        }
        if (numberCell == 6 || numberCell == 7 || numberCell == 8) {
            if (field[6] == field[7] && field[6] == field[8] && field[7] != 0) {
                return true;
            }
            if (field[numberCell] == field[numberCell - 3] && field[numberCell] == field[numberCell - 6]) {
                return true;
            }
        }
        if (numberCell == 0 || numberCell == 2 || numberCell == 4 || numberCell == 6 || numberCell == 8) {
            if (field[0] == field[4] && field[0] == field[8] && field[4] != 0) {
                return true;
            }
            if (field[2] == field[4] && field[2] == field[6] && field[4] != 0) {
                return true;
            }
        }
        return false;
    }

    public static void outputField(int[] arr) {
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (arr[k]) {
                    case 0:
                        System.out.print("_ ");
                        break;
                    case 1:
                        System.out.print("x ");
                        break;
                    case 2:
                        System.out.print("o ");
                        break;
                }
                k++;
            }
            System.out.println();
        }
    }
}
