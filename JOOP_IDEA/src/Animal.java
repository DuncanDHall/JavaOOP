import javax.sound.midi.Soundbank;

/**
 * Created by duncan on 1/1/17.
 */
public abstract class Animal {

    int size;
    String name;

    public Animal(int size) {
        setSize(size);
    }

    abstract void makeNoise ();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    boolean isBigger (Animal other) {
        return getSize() > other.getSize();
    }
}



class AnimalTestDrive {

    public static void main (String[] args) {
        Fetcher d = new Dog(95);
        Cat c = new Cat(7);

//        d.makeNoise();
        c.makeNoise();

//        System.out.println(d.isBigger(c));

        System.out.println(d.fetch("tennis ball"));
    }

}
