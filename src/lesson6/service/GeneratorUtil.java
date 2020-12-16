package lesson6.service;

import java.util.Random;

public final class GeneratorUtil {


    public static int generateSpeed() {

        while (true) {
            int random = new Random().nextInt(250) + 1;
            if (random >= 100) return random;
        }
    }

    public static int generatePrice() {
        while (true) {
            int random = new Random().nextInt(100000) + 1;
            if (random >= 20000) return random;
        }
    }

    public static String generateBrand() {
        String sta;
        StringBuilder brand = new StringBuilder();
        int lengthNameBrand = new Random().nextInt(10) + 1;
        for (int i = 0; i <= lengthNameBrand; i++) {
            while (true) {
                int random = new Random().nextInt(122) + 1;
                if (random >= 97) {
                    brand.append((char) random);
                    break;
                }
            }
        }
        return brand.toString();
    }

}
