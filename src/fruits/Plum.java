package fruits;

public class Plum extends Fruits {
    @Override
    public void doRipening(int sun, int water) {
        if (sun > 10) {
            sun = sun * (-1);
        } else {
            sun = sun / 2;
        }
        super.doRipening(sun, water);
    }

    public Plum(String name) {
        super("Слива: "+name);
    }
}
