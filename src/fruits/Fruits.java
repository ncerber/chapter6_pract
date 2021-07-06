package fruits;

public class Fruits {
    private String name;
    protected int ripening;

    public Fruits(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRipening() {
        return ripening >= 100;
    }

    public void doRipening(int sun, int water) {
        ripening += sun + water;
    }

    public String getName() {
        return name;
    }
}
