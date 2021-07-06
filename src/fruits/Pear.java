package fruits;

public class Pear extends Fruits {
    @Override
    public void doRipening(int sun, int water) {
        super.doRipening(sun + 3, water - 10);
    }

    public Pear(String name) {
        super("Груша: "+name);
    }
}
