package lesson6.customException;

import lesson6.service.Car;

public class ExceptionStart extends Throwable {
    public void message(Car car) {
        System.out.println("Car " + car.getBrand() + ". Price: " + car.getPrice() +
                ", speed: " + car.getSpeed() + ". Not start");
    }
}
