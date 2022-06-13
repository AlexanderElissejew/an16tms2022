public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Raises the hand of the firm Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
