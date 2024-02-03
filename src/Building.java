import java.util.ArrayList;
import java.util.List;

class Building {
    private String streetName;
    private String houseNumber;
    private double monthlyPaymentPerSqm;
    private List<Room> rooms = new ArrayList<>();

    public Building(String streetName, String houseNumber, double monthlyPaymentPerSqm) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.monthlyPaymentPerSqm = monthlyPaymentPerSqm;
    }

    public void addRoom(Room room) {
        rooms.add(room);
        room.setBuilding(this); // Устанавливаем текущее здание как здание для комнаты
    }

    public String getStreetName() {
        return streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public double getMonthlyPaymentPerSqm() {
        return monthlyPaymentPerSqm;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public double getTotalArea() {
        return rooms.stream().mapToDouble(Room::getArea).sum(); // Суммируем площадь всех комнат
    }
}
