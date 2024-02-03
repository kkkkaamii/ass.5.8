public class Main {
    public static void main(String[] args) {

        City city = new City("Город Астана");


        Building building1 = new Building("Улица Кошкарбаева", "12", 150.0);
        Building building2 = new Building("Улица Нажимеденова", "8", 120.0);
        city.addBuilding(building1);
        city.addBuilding(building2);


        Room room1 = new Room(101, 30.5);
        Room room2 = new Room(102, 25.0);
        Room room3 = new Room(201, 45.5);
        building1.addRoom(room1);
        building1.addRoom(room2);
        building2.addRoom(room3);


        System.out.println("Город: " + city.getName());
        for (Building building : city.getBuildings()) {
            System.out.println("Здание: " + building.getStreetName() + ", " + building.getHouseNumber());
            System.out.println("Ежемесячная плата за кв. метр: " + building.getMonthlyPaymentPerSqm());
            System.out.println("Комнаты в здании:");
            for (Room room : building.getRooms()) {
                System.out.println("Номер комнаты: " + room.getNumber() + ", Площадь: " + room.getArea() + " кв.м.");
            }
            System.out.println("Общая площадь здания: " + building.getTotalArea() + " кв.м.");
        }


        Building foundBuilding = city.findBuilding("Улица Мангилик Ел", "С1");
        if (foundBuilding != null) {
            System.out.println("Найдено здание по адресу: " + foundBuilding.getStreetName() + ", " + foundBuilding.getHouseNumber());
        } else {
            System.out.println("Здание по заданному адресу не найдено.");
        }
    }
}
