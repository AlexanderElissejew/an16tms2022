public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Raises the hand of the firm Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
