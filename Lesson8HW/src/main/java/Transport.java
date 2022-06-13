public abstract class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String model;

    public Transport(int power, int maxSpeed, int weight, String model) {
        this.power = power;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }
}
