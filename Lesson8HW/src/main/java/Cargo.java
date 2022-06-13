public class Cargo extends LandTransport {
    private int loadingCapacity;

    public Cargo(int power, int maxSpeed, int weight, String model, int countOfWheels, double fuelConsumption, int loadingCapacity) {
        super(power, maxSpeed, weight, model, countOfWheels, fuelConsumption);
        this.loadingCapacity = loadingCapacity;
    }

    public int getLoadingCapacity() {
        return loadingCapacity;
    }

    private double kiloPower() {
        double kilowatt = getPower();
        return kilowatt * 0.74;
    }

    public void loading(int load) {
        if (load > loadingCapacity) {
            System.out.println("You need a bigger truck.");
        } else {
            System.out.println("Truck is loaded");
        }
    }


    public String description() {
        return "Cargo{" +
                "loadingCapacity=" + loadingCapacity +
                "power=" + getPower() +
                "kilowatt power= " + kiloPower() +
                ", maxSpeed=" + getMaxSpeed() +
                ", weight=" + getWeight() +
                ", model='" + getModel() +
                "count of wheels: " + getCountOfWheels() +
                "fuel consumption: " + getFuelConsumption() +
                '}';
    }
}
