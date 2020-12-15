package lesson6.customException;

import lesson6.service.Car;

public class ExceptionStop extends Throwable {
    public void message(Car car) {
        System.out.println("Car " + car.getBrand() + ". Price: " + car.getPrice() +
                ", speed: " + car.getSpeed() + ". Not stop");
    }
}
