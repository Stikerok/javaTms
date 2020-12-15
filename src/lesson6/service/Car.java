package lesson6.service;

import lesson6.customException.ExceptionStart;
import lesson6.customException.ExceptionStop;

import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private int price;

    public Car() {}

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public void start() throws ExceptionStart {
        if (new Random().nextInt(20) % 2 == 0) {
            throw new ExceptionStart();
        } else {
            System.out.println("Car " + brand + ". Price: " + price +
                    ", speed: " + speed + ". Start");
        }
    }
    public void stop() throws ExceptionStop {
        if (new Random().nextInt(20) % 2 != 0) {
            throw new ExceptionStop();
        } else {
            System.out.println("Car " + brand + ". Price: " + price +
                    ", speed: " + speed + ". Stop");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
