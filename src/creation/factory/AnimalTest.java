package creation.factory;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1 = new AnimalFactory().getAnimal("dog");
        Animal animal2 = new AnimalFactory().getAnimal("eagle");

        animal1.move();
        animal1.eat();

        animal2.move();
        animal2.eat();
    }
}
