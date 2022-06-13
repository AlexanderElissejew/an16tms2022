public abstract class LandTransport extends Transport {
    private int countOfWheels;
    private double fuelConsumption;

    public LandTransport(int power, int maxSpeed, int weight, String model, int countOfWheels, double fuelConsumption) {
        super(power, maxSpeed, weight, model);
        this.countOfWheels = countOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "LandTransport{" +
                "countOfWheels=" + countOfWheels +
                ", fuelConsumption=" + fuelConsumption +
                "power=" + getPower() +
                ", maxSpeed=" + getMaxSpeed() +
                ", weight=" + getWeight() +
                ", model='" + getModel() +
                '}';
    }
}
