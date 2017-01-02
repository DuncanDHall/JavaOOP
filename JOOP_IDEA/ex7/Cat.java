/**
 * Created by duncan on 1/1/17.
 */
public class Cat extends Animal {

    public Cat() {
        super();
    }

    public Cat(int size) {
        super(size);
    }

    @Override
    void makeNoise() {
        System.out.println("Meow, meow...");
    }

    @Override
    public String toString() {
        return String.format("Cat with size %d", size);
    }

}


