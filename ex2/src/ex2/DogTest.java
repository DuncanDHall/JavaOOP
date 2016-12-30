package ex2;


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

class DogChorus {
	Dog[] chorus = getDogChorus();
	
	Dog[] getDogChorus() {
		Dog[] chorus = 
		for (int i = 0; i < 20; i ++) {
			
		}
	}
}

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
