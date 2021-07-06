package fruits;

public class Apple extends Fruits {
    @Override
    public void doRipening(int sun, int water) {
        super.doRipening(sun - 5, water);
    }

    public Apple(String name) {
        super("Яблоня: "+name);
    }
}
