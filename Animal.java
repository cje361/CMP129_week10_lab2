public abstract class Animal {
    private String name;
    private int age;
    private String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void displayInfo() {
        System.out.println("Name:    " + name);
        System.out.println("Age:     " + age);
        System.out.println("Species: " + species);
    }

    public abstract void makeSound();
}
