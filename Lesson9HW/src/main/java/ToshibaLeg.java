public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void upLeg() {
        System.out.println("Toshiba robot lifts leg");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
