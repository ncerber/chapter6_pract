package gardens;

import fruits.Fruits;

public class Garden {
    Fruits[] fruits;
    private int fruitsIterator = -1;

    public Garden() {
        fruits = new Fruits[10];
    }

    public void add(Fruits fruit) {
        if (fruitsIterator > 9) {
            return;
        }

        fruits[++fruitsIterator] = fruit;
    }

    public void doCare(int sun, int water) {
        for (int i=0; i<=fruitsIterator; i++) {
            if (!fruits[i].isRipening()) {
                fruits[i].doRipening(sun, water);
            }
        }
    }

    public Fruits[] getFruits() {
        return fruits;
    }
}
