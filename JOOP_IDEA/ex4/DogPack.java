import javax.sound.midi.Soundbank;
import java.util.ArrayList;

/**
 * Created by duncan on 12/30/16.
 */
public class DogPack {

    ArrayList <Dog> dogs;

    DogPack () {
        dogs = new ArrayList<Dog>();
    }

    void addDog (Dog dog) {
        dogs.add(dog);
    }

    ArrayList<Dog> getDogs () {
        return dogs;
    }

    Dog biggestDog () {
        Dog biggest = dogs.get(0);
        for (Dog dog : dogs) {
            if (dog.isBigger(biggest)) {
                biggest = dog;
            }
        }
        return biggest;
    }

    @Override
    public String toString() {
        return String.format("A pack of %d Dogs", dogs.size());
    }
}

class DogPackTestDrive {

    public static void main(String[] args) {
        DogPack dp = new DogPack();

        int [] dogSizes = {50, 35, 95, 10, 105, 30, 70, 85, 10, 5};

        for (int i = 0; i < dogSizes.length; i++) {
            Dog d = new Dog();
            d.setSize(dogSizes[i]);
            dp.addDog(d);
        }

        System.out.println(dp);

        System.out.println(dp.biggestDog());
    }

}
