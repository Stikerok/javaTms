package lesson9;

import java.sql.Time;

public class Bus {
    private String nameCompany;
    private String departure;
    private String arrival;

    public Bus() {

    }

    @Override
    public String toString() {
        return "Bus{" +
                "nameCompany='" + nameCompany + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
}
