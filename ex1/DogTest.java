// Duncan Hall

class Pet {
    int size;
    String breed;
    String name;
}

class Dog extends Pet {
    void bark() {
        String template = "Imma %s lb dog. #bark";
        System.out.println(String.format(template, size));
    }
}

class Cat extends Pet {

    public Cat () {
        //no default parameter values in Java... );
        name = "Bob";
    }

    void bark() {
        String template = "lol, I'm %s the barking cat";
        System.out.println(String.format(template, name));
    }
}

public class DogTest {
    public static void main (String[] args) {
        Dog d = new Dog();
        d.size = 40;
        d.bark();

        Cat c = new Cat();
        c.breed = "Maine Coon";
        c.bark();
    }
}
