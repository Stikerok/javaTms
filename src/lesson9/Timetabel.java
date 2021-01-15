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
                // Создаю массив строк и спомощью разделителя разделяю строку
                String[] subStr;
                subStr = line.split(" ");
                bus.setNameCompany(subStr[0]);
                bus.setDeparture(subStr[1]);
                bus.setArrival(subStr[2]);
                // В список маршрутов заношу только те которые длятся меньше часа
                if (bus.travelTimeCalculation() < 60) {
                    timetable.add(bus);
                }
            }
            // Удаляю все маршруты не соответствующие условиям
            removeRoutes();
            // Сортирую маршруты по компаниям и времени отправления
            timetable.sort(new CompByCompanyDepart());
            // Записываю в файл все маршруты фирмы Posh
            for (Bus bus : timetable) {
                if (bus.getNameCompany().equals("Posh")) {
                    writer.write(bus.toString() + "\n");
                }
            }
            writer.write("\n");
            // Записываю в файл все маршруты фирмы Grotty
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
        // Создаю коллекцию TreeSet для хранения идексов маршрутов которые нужно будет удалить, она будет сортироваться
        // по убыванию для того чтобы при удалении из List индексы не смещались
        // TreeSet выбрана для того чтобы не было повторяющихся идексов и была возможна сортировка
        Set<Integer> collectionOfRemoved = new TreeSet<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < timetable.size(); i++) {
            Bus bus = timetable.get(i);
            for (int j = 0; j < timetable.size(); j++) {
                Bus nextBus = timetable.get(j);
                // Сравниваю маршруты согласно заданию и записываю индексы маршрутов которые нужно будет удалить
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
        // Удаляю маршруты не подходящие по заданию
        for (Integer rem : collectionOfRemoved) {
            timetable.remove((int) rem);
        }
    }

    public List<Bus> getTimetable() {
        return timetable;
    }

    public void setTimetable(List<Bus> timetable) {
        this.timetable = timetable;
    }
}
