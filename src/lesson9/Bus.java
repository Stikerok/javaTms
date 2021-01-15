package lesson9;


public class Bus {
    private String nameCompany;
    private String departure;
    private String arrival;

    public Bus() {

    }

    @Override
    public String toString() {
        return nameCompany + " " + departure + " " + arrival;
    }
    // метод для вычисления времени в пути
    public int travelTimeCalculation() {
        int depart = Integer.parseInt(departure.substring(0, 2)) * 60 + Integer.parseInt(departure.substring(3));
        int arriv = Integer.parseInt(arrival.substring(0, 2)) * 60 + Integer.parseInt(arrival.substring(3));
        return arriv - depart;
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
