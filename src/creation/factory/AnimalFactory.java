package creation.factory;

public class AnimalFactory {
    public Animal getAnimal(String animal) {
        if(animal.equals("dog")) {
            return new Dog();
        }
        else if(animal.equals("eagle")) {
            return new Eagle();
        }
        return null;
    }
}
