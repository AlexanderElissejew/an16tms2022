public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void upLeg() {
        System.out.println("Sony robot lifts leg");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
