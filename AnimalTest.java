public class AnimalTest {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 5);
        Cat cat = new Cat("Whiskers", 3);

        System.out.println("----- Animal 1 -----");
        dog.displayType();
        dog.displayInfo();
        dog.makeSound();

        System.out.println();
        System.out.println("----- Animal 2 -----");
        cat.displayType();
        cat.displayInfo();
        cat.makeSound();
    }
}