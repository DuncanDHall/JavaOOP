/**
 * Created by duncan on 12/29/16.
 */
public class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Ruff, Ruff!");
    }
}

class DogTestDrive {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 10;
        d.bark();
    }

}
