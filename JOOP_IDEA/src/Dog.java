/**
 * Created by duncan on 12/30/16.
 */
public class Dog {
    private int size;
    String breed;
    String name;

    public Dog (int size, String breed, String name) {
        this.size = size;
        this.breed = breed;
        this.name = name;
    }

    void bark () {
        System.out.println(this.toString());
    }

    int getSize () {
        return this.size;
    }

    void setSize (int newSize) {
        this.size = newSize;
    }

    boolean isBigger (Dog other) {
        return this.getSize() > other.getSize();
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

        for (int i = 1; i < dogs.length; i++) {
            if (dogs[i].isBigger(biggest)) {
                biggest = dogs[i];
            }
        }

        biggest.setSize(100);

        System.out.println(biggest.getSize());
        System.out.println(biggest.breed);
        System.out.println(biggest.name);
    }

}
