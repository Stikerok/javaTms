package seaBattle;

import java.util.Random;

public abstract class RandomPlaceShip {


    public static void randomPlace(Field field) {
        int lengthShip = 4;
        int quantityShips = 1;
        Random random = new Random();
        for (int i = lengthShip; i > 0; i--) {
            int count = 0;
            do {
                int startCoordinateY = (int) (Math.random() * 10);
                int startCoordinateX = (int) (Math.random() * 10);
                boolean isVertical = random.nextBoolean();
                Ship ship = new Ship(i, startCoordinateY, startCoordinateX, isVertical);
                if (field.possiblePlaceShip(ship)) {
                    field.placeShip(ship);
                    count++;
                }
            } while (count < quantityShips);
            quantityShips++;
        }
    }
}
