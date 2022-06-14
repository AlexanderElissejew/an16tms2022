public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void upHead() {
        System.out.println("Speak the head of the firm Toshiba");
    }
}
