package lesson6;

import lesson6.customException.ExceptionStart;
import lesson6.customException.ExceptionStop;
import lesson6.service.Car;
import lesson6.service.GeneratorUtil;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            String brand = GeneratorUtil.generateBrand();
            int price = GeneratorUtil.generatePrice();
            int speed = GeneratorUtil.generateSpeed();
            Car car = new Car(brand,speed,price);
            try {
                car.start();
                car.stop();
            } catch (ExceptionStart exceptionStart) {
                exceptionStart.message(car);
            } catch (ExceptionStop exceptionStop) {
                exceptionStop.message(car);
            }finally {
                System.out.println("end");
            }
        }
    }
}
