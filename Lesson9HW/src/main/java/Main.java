public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SamsungHand(100), new ToshibaHead(50), new SamsungLeg(75));
        robot1.action();
        System.out.println(robot1.getPrice());

        Robot robot2 = new Robot(new SonyHand(200), new SonyHead(200), new ToshibaLeg(50));
        robot2.action();
        System.out.println(robot2.getPrice());

        Robot robot3 = new Robot(new SamsungHand(100), new SonyHead(200), new SonyLeg(200));
        robot3.action();
        System.out.println(robot3.getPrice());

        int[] robots = {robot1.getPrice(), robot2.getPrice(), robot3.getPrice()};
        int maxPrice = robots[0];
        for (int i = 1; i < robots.length; i++) {
            if (robots[i] > maxPrice) {
                maxPrice = robots[i];
            }
        }
        System.out.println("The most expensive robot is " + maxPrice);

    }

}
