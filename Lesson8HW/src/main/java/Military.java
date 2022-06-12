public class Military extends AirTransport {
    boolean presenceOfEjectionSystem;
    int countOfRockets;

    public Military(int power, int maxSpeed, int weight, String model, int wingspan, int minimalRunwayLength, boolean presenceOfEjectionSystem, int countOfRockets) {
        super(power, maxSpeed, weight, model, wingspan, minimalRunwayLength);
        this.presenceOfEjectionSystem = presenceOfEjectionSystem;
        this.countOfRockets = countOfRockets;
    }

    public boolean isPresenceOfEjectionSystem() {
        return presenceOfEjectionSystem;
    }

    public int getCountOfRockets() {
        return countOfRockets;
    }

    private double kiloPower() {
        double kilowatt = getPower();
        return kilowatt * 0.74;
    }

    public void checkRockets() {
        if (countOfRockets != 0) {
            System.out.println("Rocket is starting...");
        } else {
            System.out.println("There is no ammunition");
        }
    }

    public void checkEjectionSystem() {
        if (presenceOfEjectionSystem) {
            System.out.println("Ejection was successful");
        } else {
            System.out.println("You don't have a system like this");
        }
    }


    public String description() {
        return "Military{" +
                "presenceOfEjectionSystem=" + presenceOfEjectionSystem +
                ", countOfRockets=" + countOfRockets +
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
