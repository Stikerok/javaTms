package lesson6.customException;

public class ExceptionStop extends Throwable {
    public void message() {
        System.out.println("Not stop");
    }
}
