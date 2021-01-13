package lesson9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Bus> timetable = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                Bus bus = new Bus();
                String[] subStr;
                subStr = line.split(" ");
                bus.setNameCompany(subStr[0]);
                bus.setDeparture(subStr[1]);
                bus.setArrival(subStr[2]);
                timetable.add(bus);
            }
            for (Bus bus: timetable) {
                System.out.println(bus);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
