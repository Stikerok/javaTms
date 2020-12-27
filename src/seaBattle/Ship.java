package seaBattle;

public class Ship {
    private int length;
    private int startCoordinateY;
    private int startCoordinateX;
    private int[] coordinateY;
    private int[] coordinateX;
    private boolean isVertical;

    public Ship(int length, int startCoordinateY, int startCoordinateX, boolean isVertical) {
        this.length = length;
        this.startCoordinateY = startCoordinateY;
        this.startCoordinateX = startCoordinateX;
        this.isVertical = isVertical;
        if (isVertical) {
            coordinateY = new int[length];
            coordinateX = new int[1];
        } else {
            coordinateX = new int[length];
            coordinateY = new int[1];
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getStartCoordinateY() {
        return startCoordinateY;
    }

    public void setStartCoordinateY(int startCoordinateY) {
        this.startCoordinateY = startCoordinateY;
    }

    public int getStartCoordinateX() {
        return startCoordinateX;
    }

    public void setStartCoordinateX(int startCoordinateX) {
        this.startCoordinateX = startCoordinateX;
    }

    public boolean isVertical() {
        return isVertical;
    }

    public void setVertical(boolean vertical) {
        isVertical = vertical;
    }

    public int[] getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int[] coordinateY) {
        this.coordinateY = coordinateY;
    }

    public int[] getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int[] coordinateX) {
        this.coordinateX = coordinateX;
    }
}
