/**
 * Created by duncan on 12/30/16.
 */
public class Dog {
    int size;
    String breed;
    String name;

    public Dog (int size, String breed, String name) {
        this.size = size;
        this.breed = breed;
        this.name = name;
    }

    void bark() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format("%s dog named %s with size %d", breed, name, size);
    }
}

class DogTestDrive {

    public static void main(String[] args) {
        String [] names = {"Abe", "Bob", "Charlie", "Drake", "Erin", "Fin", "George", "Herald", "Ivan", "James"};
        Dog [] dogs = new Dog[names.length];

        for (int i = 0; i < names.length; i++) {
            dogs[i] = new Dog(i + 10, "Lab", names[i]);
        }

        for (int i = 0; i < names.length; i++) {
            dogs[i].bark();
        }

        Dog biggest = dogs[0];
        int sizeRecord = -1;

        for (int i = 1; i < dogs.length; i++) {
            if (sizeRecord < dogs[i].size) {
                biggest = dogs[i];
                sizeRecord = biggest.size;
            }
        }

        System.out.println(biggest.size);
        System.out.println(biggest.breed);
        System.out.println(biggest.name);
    }

}
