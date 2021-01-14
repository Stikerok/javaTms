package lesson9;

import java.io.*;
import java.util.*;

public class Timetabel {
    List<Bus> timetable = new ArrayList<>();

    public Timetabel() {

    }

    public void sortTimetable(String input, String output) {
        try (BufferedReader reader = new BufferedReader(new FileReader(input));
             BufferedWriter writer = new BufferedWriter(new FileWriter(output));) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                Bus bus = new Bus();
                String[] subStr;
                subStr = line.split(" ");
                bus.setNameCompany(subStr[0]);
                bus.setDeparture(subStr[1]);
                bus.setArrival(subStr[2]);
                if (bus.travelTimeCalculation() < 60) {
                    timetable.add(bus);
                }
            }
            removeRoutes();
            timetable.sort(new CompByCompanyDepart());
            for (Bus bus : timetable) {
                if (bus.getNameCompany().equals("Posh")) {
                    writer.write(bus.toString() + "\n");
                }
            }
            writer.write("\n");
            for (Bus bus : timetable) {
                if (bus.getNameCompany().equals("Grotty")) {
                    writer.write(bus.toString() + "\n");
                }
            }
            writer.write("<end-of-file>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void removeRoutes() {
        Set<Integer> collectionOfRemoved = new HashSet<>();
        for (int i = 0; i < timetable.size(); i++) {
            Bus bus = timetable.get(i);
            for (int j = 0; j < timetable.size(); j++) {
                Bus nextBus = timetable.get(j);
                if (i != j) {
                    if (bus.getDeparture().compareTo(nextBus.getDeparture()) == 0 &&
                            bus.getArrival().compareTo(nextBus.getArrival()) < 0) {
                        collectionOfRemoved.add(j);
                    }
                    if (bus.getDeparture().compareTo(nextBus.getDeparture()) > 0 &&
                            bus.getArrival().compareTo(nextBus.getArrival()) == 0) {
                        collectionOfRemoved.add(j);
                    }
                    if (bus.getDeparture().compareTo(nextBus.getDeparture()) > 0 &&
                            bus.getArrival().compareTo(nextBus.getArrival()) < 0) {
                        collectionOfRemoved.add(j);
                    }
                    if (bus.getDeparture().compareTo(nextBus.getDeparture()) == 0 &&
                            bus.getArrival().compareTo(nextBus.getArrival()) == 0) {
                        if (bus.getNameCompany().equals("Grotty")) {
                            collectionOfRemoved.add(i);
                        } else {
                            collectionOfRemoved.add(j);
                        }
                    }
                }
            }
        }
        int count = 0;
        for (Integer rem : collectionOfRemoved) {
            timetable.remove((int) rem - count);
            count++;
        }
    }

    public List<Bus> getTimetable() {
        return timetable;
    }

    public void setTimetable(List<Bus> timetable) {
        this.timetable = timetable;
    }
}
