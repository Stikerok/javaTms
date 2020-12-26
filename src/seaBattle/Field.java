package seaBattle;

public class Field {
    private int sizeField;
    private int[][] field;

    public Field() {
    }

    public Field(int sizeField) {
        this.sizeField = sizeField;
        this.field = new int[sizeField][sizeField];
    }

    public void creatField() {
        for (int i = 0; i < sizeField; i++) {
            for (int j = 0; j < sizeField; j++) {
                field[i][j] = 0;
            }
        }
    }

    public void outField() {
        for (int i = 0; i < sizeField; i++) {
            for (int j = 0; j < sizeField; j++) {
                switch (field[i][j]) {
                    case 1:
                        System.out.print("X ");
                        break;
                    case 3:
                        System.out.print("# ");
                        break;
                    case 4:
                        System.out.print("O ");
                        break;
                    default:
                        System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void outFieldEnemy() {
        System.out.print("  ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < sizeField; i++) {
            for (int j = 0; j < sizeField; j++) {
                if (j == 0) {
                    System.out.print(i + " ");
                }
                switch (field[i][j]) {
                    case 3:
                        System.out.print("# ");
                        break;
                    case 4:
                        System.out.print("O ");
                        break;
                    default:
                        System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void placeShip(Ship ship) {
        int[] coordinateY = ship.getCoordinateY();
        int[] coordinateX = ship.getCoordinateX();
        if (ship.isVertical()) {
            if (coordinateX[0] > 0 && coordinateX[0] < 9) {
                if (coordinateY[0] != 0) {
                    field[coordinateY[0] - 1][coordinateX[0]] = 2;
                    field[coordinateY[0] - 1][coordinateX[0] + 1] = 2;
                    field[coordinateY[0] - 1][coordinateX[0] - 1] = 2;
                }
                if (coordinateY[coordinateY.length - 1] != 9) {
                    field[coordinateY[coordinateY.length - 1] + 1][coordinateX[0]] = 2;
                    field[coordinateY[coordinateY.length - 1] + 1][coordinateX[0] + 1] = 2;
                    field[coordinateY[coordinateY.length - 1] + 1][coordinateX[0] - 1] = 2;
                }
                for (int i = 0; i < ship.getLength(); i++) {
                    field[coordinateY[i]][coordinateX[0]] = 1;
                    field[coordinateY[i]][coordinateX[0] + 1] = 2;
                    field[coordinateY[i]][coordinateX[0] - 1] = 2;
                }
            }
            if (coordinateX[0] == 0) {
                if (coordinateY[0] != 0) {
                    field[coordinateY[0] - 1][coordinateX[0]] = 2;
                    field[coordinateY[0] - 1][coordinateX[0] + 1] = 2;
                }
                if (coordinateY[coordinateY.length - 1] != 9) {
                    field[coordinateY[coordinateY.length - 1] + 1][coordinateX[0]] = 2;
                    field[coordinateY[coordinateY.length - 1] + 1][coordinateX[0] + 1] = 2;
                }
                for (int i = 0; i < ship.getLength(); i++) {
                    field[coordinateY[i]][coordinateX[0]] = 1;
                    field[coordinateY[i]][coordinateX[0] + 1] = 2;
                }
            }
            if (coordinateX[0] == 9) {
                if (coordinateY[0] != 0) {
                    field[coordinateY[0] - 1][coordinateX[0]] = 2;
                    field[coordinateY[0] - 1][coordinateX[0] - 1] = 2;
                }
                if (coordinateY[coordinateY.length - 1] != 9) {
                    field[coordinateY[coordinateY.length - 1] + 1][coordinateX[0]] = 2;
                    field[coordinateY[coordinateY.length - 1] + 1][coordinateX[0] - 1] = 2;
                }
                for (int i = 0; i < ship.getLength(); i++) {
                    field[coordinateY[i]][coordinateX[0]] = 1;
                    field[coordinateY[i]][coordinateX[0] - 1] = 2;
                }
            }

        } else {
            if (coordinateY[0] > 0 && coordinateY[0] < 9) {
                if (coordinateX[0] != 0) {
                    field[coordinateY[0]][coordinateX[0] - 1] = 2;
                    field[coordinateY[0] + 1][coordinateX[0] - 1] = 2;
                    field[coordinateY[0] - 1][coordinateX[0] - 1] = 2;
                }
                if (coordinateX[coordinateX.length - 1] != 9) {
                    field[coordinateY[0]][coordinateX[coordinateX.length - 1] + 1] = 2;
                    field[coordinateY[0] + 1][coordinateX[coordinateX.length - 1] + 1] = 2;
                    field[coordinateY[0] - 1][coordinateX[coordinateX.length - 1] + 1] = 2;
                }
                for (int i = 0; i < ship.getLength(); i++) {
                    field[coordinateY[0]][coordinateX[i]] = 1;
                    field[coordinateY[0] + 1][coordinateX[i]] = 2;
                    field[coordinateY[0] - 1][coordinateX[i]] = 2;
                }
            }
            if (coordinateY[0] == 0) {
                if (coordinateX[0] != 0) {
                    field[coordinateY[0]][coordinateX[0] - 1] = 2;
                    field[coordinateY[0] + 1][coordinateX[0] - 1] = 2;
                }
                if (coordinateX[coordinateX.length - 1] != 9) {
                    field[coordinateY[0]][coordinateX[coordinateX.length - 1] + 1] = 2;
                    field[coordinateY[0] + 1][coordinateX[coordinateX.length - 1] + 1] = 2;
                }
                for (int i = 0; i < ship.getLength(); i++) {
                    field[coordinateY[0]][coordinateX[i]] = 1;
                    field[coordinateY[0] + 1][coordinateX[i]] = 2;
                }
            }
            if (coordinateY[0] == 9) {
                if (coordinateX[0] != 0) {
                    field[coordinateY[0]][coordinateX[0] - 1] = 2;
                    field[coordinateY[0] - 1][coordinateX[0] - 1] = 2;
                }
                if (coordinateX[coordinateX.length - 1] != 9) {
                    field[coordinateY[0]][coordinateX[coordinateX.length - 1] + 1] = 2;
                    field[coordinateY[0] - 1][coordinateX[coordinateX.length - 1] + 1] = 2;
                }
                for (int i = 0; i < ship.getLength(); i++) {
                    field[coordinateY[0]][coordinateX[i]] = 1;
                    field[coordinateY[0] - 1][coordinateX[i]] = 2;
                }
            }
        }
    }

    public boolean possiblePlaceShip(Ship ship) {
        int startY = ship.getStartCoordinateY();
        int startX = ship.getStartCoordinateX();
        int count = 0;
        int[] coordinateY = new int[ship.getCoordinateY().length];
        int[] coordinateX = new int[ship.getCoordinateX().length];
        int j = 0;
        if (ship.isVertical()) {
            coordinateX[0] = startX;
            if (startY < 7) {
                for (int i = startY; i < startY + ship.getLength(); i++) {
                    if (field[i][startX] == 0) {
                        coordinateY[j] = i;
                        j++;
                        count++;
                    }
                }
            } else {
                for (int i = startY - (ship.getLength() - 1); i <= startY; i++) {
                    if (field[i][startX] == 0) {
                        coordinateY[j] = i;
                        j++;
                        count++;
                    }
                }
            }
        } else {
            coordinateY[0] = startY;
            if (startX < 7) {
                for (int i = startX; i < startX + ship.getLength(); i++) {
                    if (field[startY][i] == 0) {
                        coordinateX[j] = i;
                        j++;
                        count++;
                    }
                }
            } else {
                for (int i = startX - (ship.getLength() - 1); i <= startX; i++) {
                    if (field[startY][i] == 0) {
                        coordinateX[j] = i;
                        j++;
                        count++;
                    }
                }
            }
        }
        ship.setCoordinateX(coordinateX);
        ship.setCoordinateY(coordinateY);
        return count == ship.getLength();
    }

    public int getSizeField() {
        return sizeField;
    }

    public void setSizeField(int sizeField) {
        this.sizeField = sizeField;
    }

    public int[][] getField() {
        return field;
    }

    public void setField(int[][] field) {
        this.field = field;
    }
}
