package lesson6;

import lesson6.customException.ExceptionStart;
import lesson6.service.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", 250, 25000);
        Car car2 = new Car("Honda", 250, 25000);
        Car car3 = new Car("Honda", 250, 25000);
        try {
            car1.start();
        } catch (ExceptionStart exceptionStart) {
            exceptionStart.message();
        }
        try {
            car2.start();
        } catch (ExceptionStart exceptionStart) {
            exceptionStart.message();
        }
        try {
            car3.start();
        } catch (ExceptionStart exceptionStart) {
            exceptionStart.message();
        }
    }

}
