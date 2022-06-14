import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString

public class Robot implements IRobot {
    private IHand ihand;
    private IHead ihead;
    private ILeg ileg;

    @Override
    public void action() {
        ihand.upHand();
        ihead.upHead();
        ileg.upLeg();
    }

    @Override
    public int getPrice() {
        int price = ihand.getPrice() + ihead.getPrice() + ileg.getPrice();
        return price;
    }
}
