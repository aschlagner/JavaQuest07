public class Hangar {

    public static void main(String[] args) {
        Car streetVehicle = new Car("Clio", 102331);
        Boat waterVehicle = new Boat("Queen Elizabeth 2", 932081);

        System.out.println(streetVehicle.doStuff());
        System.out.println(waterVehicle.doStuff());
    }
    
}
