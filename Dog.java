public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age, "Dog");  
    }

    @Override
    public void makeSound() {
        System.out.println("Sound:   Woof!");
    }

    public void displayType() {
        System.out.println("This is a dog.");
    }
}