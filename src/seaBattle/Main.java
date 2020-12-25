package seaBattle;

public class Main {
    public static void main(String[] args) {
        Field field = new Field(10);
        field.creatField();
        RandomPlaceShip.randomPlace(field);
        field.outField();
    }
}
