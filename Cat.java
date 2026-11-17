public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age, "Cat");   
    }

    @Override
    public void makeSound() {
        System.out.println("Sound:   Meow!");
    }

    public void displayType() {
        System.out.println("This is a cat.");
    }
}