package lesson6;

import lesson6.customException.ExceptionStart;
import lesson6.customException.ExceptionStop;
import lesson6.service.Car;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Car car = new Car("Honda", 250, 25000);
            try {
                car.start();
                car.stop();
            } catch (ExceptionStart exceptionStart) {
                exceptionStart.message();
            } catch (ExceptionStop exceptionStop) {
                exceptionStop.message();
            }finally {
                System.out.println("end");
            }
        }


    }

}
