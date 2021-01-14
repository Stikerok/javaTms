package seaBattle;

import java.util.Scanner;

public class Player {
    private String namePlayer;
    private Field fieldPlayer;

    public Player(String namePlayer, Field fieldPlayer) {
        this.namePlayer = namePlayer;
        this.fieldPlayer = fieldPlayer;
    }

    public boolean shot(Field enemy) {
        Scanner scanner = new Scanner(System.in);
        int coordinateY;
        int coordinateX;
        int[][] enemyfield = enemy.getField();
        do {
            System.out.println(namePlayer + ". Введите координаты выстрела.\nY (0 - 9): ");
            coordinateY = scanner.nextInt();
            System.out.println("X (0 - 9): ");
            coordinateX = scanner.nextInt();
            System.out.println();
            if (enemyfield[coordinateY][coordinateX] == 3 || enemyfield[coordinateY][coordinateX] == 4) {
                System.out.println("Вы туда уже стреляли");
            }
        } while (enemyfield[coordinateY][coordinateX] == 3 || enemyfield[coordinateY][coordinateX] == 4);
        if (enemyfield[coordinateY][coordinateX] == 1) {
            enemyfield[coordinateY][coordinateX] = 3;
            enemy.setField(enemyfield);
            System.out.println("Игрок попал");
            return true;
        } else {
            enemyfield[coordinateY][coordinateX] = 4;
            enemy.setField(enemyfield);
            System.out.println("Игрок промазал");
        }
        return false;
    }

    public boolean isWin(Field enemy) {
        int[][] enemyField = enemy.getField();
        for (int i = 0; i < enemyField.length; i++) {
            for (int j = 0; j < enemyField[i].length; j++) {
                if (enemyField[i][j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public Field getFieldPlayer() {
        return fieldPlayer;
    }

    public void setFieldPlayer(Field fieldPlayer) {
        this.fieldPlayer = fieldPlayer;
    }
}
