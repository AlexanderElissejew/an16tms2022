public class Civil extends AirTransport {
    int countOfPassenger;
    boolean businessClassAvailability;

    public Civil(int power, int maxSpeed, int weight, String model, int wingspan, int minimalRunwayLength, int countOfPassenger, boolean businessClassAvailability) {
        super(power, maxSpeed, weight, model, wingspan, minimalRunwayLength);
        this.countOfPassenger = countOfPassenger;
        this.businessClassAvailability = businessClassAvailability;
    }

    public int getCountOfPassenger() {
        return countOfPassenger;
    }

    public boolean isBusinessClassAvailability() {
        return businessClassAvailability;
    }

    private double kiloPower() {
        double kilowatt = getPower();
        return kilowatt * 0.74;
    }

    public void checkCountOfPassenger(int checkPassengers) {
        if (checkPassengers > countOfPassenger) {
            System.out.println("You need a bigger airplane");
        } else {
            System.out.println("Airplane is ready");
        }
    }

    public String description() {
        return "Civil{" +
                "countOfPassenger=" + countOfPassenger +
                ", businessClassAvailability=" + businessClassAvailability +
                "wingspan=" + getWingspan() +
                ", minimalRunwayLength=" + getMinimalRunwayLength() +
                "power=" + getPower() +
                "kilowatt power= " + kiloPower() +
                ", maxSpeed=" + getMaxSpeed() +
                ", weight=" + getWeight() +
                ", model='" + getModel() +
                '}';
    }
}
