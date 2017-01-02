/**
 * Created by duncan on 1/1/17.
 */
public class Dog extends Animal implements Fetcher {

    public Dog () {
        super();
    }

    public Dog (int size) {
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

    @Override
    public String fetch(String s) {
        return "damp " + s;
    }
}
