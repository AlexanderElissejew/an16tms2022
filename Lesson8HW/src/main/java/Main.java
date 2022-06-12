public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(70, 120, 900, "Moskwich", 4, 6.5, "sedan", 5);
        System.out.println(passenger.description());
        passenger.distanceWithMaxSpeed(5);
        Cargo cargo = new Cargo(100, 180, 1800, "GAZ", 4, 20, 2500);
        System.out.println(cargo.description());
        cargo.loading(100);
        cargo.loading(2600);
        Civil civil = new Civil(1000, 950, 74500, "TU-104", 35, 1970, 110, false);
        System.out.println(civil.description());
        civil.checkCountOfPassenger(200);
        civil.checkCountOfPassenger(40);
        Military military = new Military(10000, 1700, 32300, "SU-24", 18000, 1250, true, 14);
        System.out.println(military.description());
        military.checkRockets();
        military.checkEjectionSystem();
    }
}
