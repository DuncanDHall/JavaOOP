import java.util.ArrayList;
import java.util.Random;

/**
 * Created by duncan on 1/1/17.
 */
public class AnimalPack {

    ArrayList<Animal> animals;

    AnimalPack (int packSize) {
        animals = new ArrayList<Animal>();
        Random rand = new Random();

        for (int i = 0; i < packSize; i++) {
            int kindOfAnimal = rand.nextInt(2);

            if (kindOfAnimal == 0) {
                animals.add(new Dog(10 + rand.nextInt(90)));
            } else if (kindOfAnimal == 1) {
                animals.add(new Cat(3 + rand.nextInt(10)));
            }
        }
    }

    ArrayList<Animal> getAnimals() {
        return animals;
    }

    void makeNoise() {
        for (Animal animal : this.getAnimals()) {
            animal.makeNoise();
        }
    }

    Animal biggestAnimal () {
        Animal biggest = animals.get(0);
        for (int i = 1; i < animals.size(); i++) {
            if (animals.get(i).isBigger(biggest)) {
                biggest = animals.get(i);
            }
        }
        return biggest;
    }

    double geoMean () {
        int n = 0;
        double product = 1.0;
        for (Animal a : animals) {
            n++;
            product = product * a.size;
        }
        return Math.pow(product, 1.0/n);
    }

    public static double geoMean (AnimalPack ap) {
        System.out.println(ap.animals); // this is supposed to be a problem??
        return ap.geoMean();
    }

    @Override
    public String toString() {
        return "AnimalPack{" +
                "animals=" + animals +
                '}';
    }

}



class AnimalPackTestDrive {

    public static void main(String[] args) {
        AnimalPack ap = new AnimalPack(10);
        ap.makeNoise();
        System.out.println(ap.biggestAnimal());
        System.out.println(ap.geoMean());
        System.out.println(AnimalPack.geoMean(ap));
    }

}
