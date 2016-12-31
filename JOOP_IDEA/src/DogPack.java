import javax.sound.midi.Soundbank;

/**
 * Created by duncan on 12/30/16.
 */
public class DogPack {
    Dog [] dogs;

    void makeArray (int numberOfDogs) {
        dogs = new Dog [numberOfDogs];
    }

    void addDog (Dog dog, int index) {
        dogs[index] = dog;
    }

    Dog [] getDogs () {
        return dogs;
    }

    Dog biggestDog () {
        Dog biggest = dogs[0];
        for (Dog dog : dogs) {
            if (dog.isBigger(biggest)) {
                biggest = dog;
            }
        }
        return biggest;
    }

    @Override
    public String toString() {
        return String.format("A pack of %d Dogs", dogs.length);
    }
}

class DogPackTestDrive {

    public static void main(String[] args) {
        DogPack dp = new DogPack();
        dp.makeArray(10);

        int [] dogSizes = {50, 35, 95, 10, 105, 30, 70, 85, 10, 5};

        for (int i = 0; i < dp.getDogs().length; i++) {
            Dog d = new Dog();
            d.setSize(dogSizes[i]);
            dp.addDog(d, i);
        }

        System.out.println(dp);

        System.out.println(dp.biggestDog());
    }

}
