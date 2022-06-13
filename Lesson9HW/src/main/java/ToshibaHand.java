public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Raises the hand of the firm Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
