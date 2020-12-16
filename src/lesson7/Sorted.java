package lesson7;

import java.io.*;

public final class Sorted {

    public static void sort(String src, String dest) {
        try (BufferedReader reader = new BufferedReader(new FileReader(src));
             BufferedWriter writer = new BufferedWriter(new FileWriter(dest));) {
            String temp = "";
            while ((temp = reader.readLine()) != null) {
                System.out.println(temp);
                StringBuilder builder = new StringBuilder(temp).reverse();
                if (builder.toString().equalsIgnoreCase(temp)) {
                    writer.write(temp + "\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
