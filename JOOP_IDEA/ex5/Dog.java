/**
 * Created by duncan on 1/1/17.
 */
public class Dog extends Animal {

    public Dog(int size) {
        super(size);
    }

    @Override
    void makeNoise() {
        System.out.println("Bark, bark!");
    }

    @Override
    public String toString() {
        return String.format("Dog with size %d", size);
    }
}
