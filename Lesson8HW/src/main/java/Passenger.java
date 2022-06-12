public class Passenger extends LandTransport {
    private String bodyType;
    private int countOfPassenger;

    double time;

    public Passenger(int power, int maxSpeed, int weight, String model,
                     int countOfWheels, double fuelConsumption, String bodyType, int countOfPassenger) {
        super(power, maxSpeed, weight, model, countOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.countOfPassenger = countOfPassenger;


    }

    public String getBodyType() {
        return bodyType;
    }

    public int getCountOfPassenger() {
        return countOfPassenger;
    }

    private double kiloPower() {
        double kilowatt = getPower();
        return kilowatt * 0.74;
    }

    public double getTime() {
        return time;
    }

    private double fuelRate(double distance) {
        return super.getFuelConsumption() * distance / 100;
    }

    public void distanceWithMaxSpeed(double time) {
        double distance = getMaxSpeed() * time;
        System.out.println("During " + time + " hour car " + getModel() + " moving at maximum speed " + getMaxSpeed() +
                " km/h will drive " + distance + " km and will use up " + fuelRate(distance) + " liters of fuel ");

    }

    public String description() {
        return "Passenger: " +
                " bodyType = " + bodyType +
                ", countOfPassenger = " + countOfPassenger +
                ", power in kilowatt " + kiloPower() +
                ", max speed " + super.getMaxSpeed() +
                ", weight = " + super.getWeight() +
                ", model " + super.getModel() +
                ", count of wheels: " + super.getCountOfWheels() +
                ", fuel consumption: " + super.getFuelConsumption();
    }
}
