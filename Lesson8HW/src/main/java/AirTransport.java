public abstract class AirTransport extends Transport {
    private int wingspan;
    private int minimalRunwayLength;

    public AirTransport(int power, int maxSpeed, int weight, String model, int wingspan, int minimalRunwayLength) {
        super(power, maxSpeed, weight, model);
        this.wingspan = wingspan;
        this.minimalRunwayLength = minimalRunwayLength;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getMinimalRunwayLength() {
        return minimalRunwayLength;
    }

    @Override
    public String toString() {
        return "AirTransport{ " +
                "wingspan=" + wingspan +
                ", minimalRunwayLength=" + minimalRunwayLength +
                "power=" + getPower() +
                ", maxSpeed=" + getMaxSpeed() +
                ", weight=" + getWeight() +
                ", model='" + getModel() +
                '}';
    }
}
