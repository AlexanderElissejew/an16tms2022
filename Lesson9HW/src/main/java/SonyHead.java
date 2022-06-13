public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    @Override
    public void upHead() {
        System.out.println("Speak the head of the firm Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }

}
