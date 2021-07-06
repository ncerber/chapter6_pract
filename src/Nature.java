import fruits.Apple;
import fruits.Fruits;
import fruits.Pear;
import fruits.Plum;
import gardens.Garden;

public class Nature {
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.add(new Apple("Гала"));
        garden.add(new Pear("Обыкновенная"));
        garden.add(new Plum("Желтая"));

        garden.doCare(30,10);
        garden.doCare(10,50);
        garden.doCare(30,30);

        for (Fruits fruit:garden.getFruits()) {
            if (fruit == null){
                continue;
            }
            System.out.print(fruit.getName()+" -");
            if(fruit.isRipening()){
                System.out.println(" Созрел");
            } else {
                System.out.println(" Ещё зеленый");
            }
        }

        garden.add(new Apple("Ранетка"));
        garden.add(new Plum("Красная"));

        garden.doCare(20,10);
        garden.doCare(20,10);
        garden.doCare(20,10);
        garden.doCare(20,10);
        System.out.println("Вторая очередь");
        for (Fruits fruit:garden.getFruits()) {
            if (fruit == null){
                continue;
            }
            System.out.print(fruit.getName()+" -");
            if(fruit.isRipening()){
                System.out.println(" Созрел");
            } else {
                System.out.println(" Ещё зеленый");
            }
        }
    }
}
