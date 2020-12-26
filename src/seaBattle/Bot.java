package seaBattle;

public class Bot extends Player{

    public Bot(String namePlayer, Field fieldPlayer) {
        super(namePlayer, fieldPlayer);
    }

    @Override
    public boolean shot(Field enemy) {
        int coordinateY;
        int coordinateX;
        int[][] enemyfield = enemy.getField();
        do {
            coordinateY = (int) (Math.random() * 10);
            coordinateX = (int) (Math.random() * 10);
        } while (enemyfield[coordinateY][coordinateX] == 3 || enemyfield[coordinateY][coordinateX] == 4);
        if (enemyfield[coordinateY][coordinateX] == 1) {
            enemyfield[coordinateY][coordinateX] = 3;
            enemy.setField(enemyfield);
            System.out.println("Бот попал");
            return true;
        } else {
            enemyfield[coordinateY][coordinateX] = 4;
            enemy.setField(enemyfield);
            System.out.println("Бот промазал");
        }
        return false;
    }
}
