public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void upLeg() {
        System.out.println("Samsung robot lifts leg");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
