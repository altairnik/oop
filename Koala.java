package animals;

public class Koala extends Animals{
    public Koala(String name, String type, String activity, String habitat, int weight, int age) {
        super(name, type, activity, habitat, weight, age);
        System.out.println("New koala was born!");
    }

    @Override
    public void makeSound() {
        System.out.println("Koala says Hello");
    }

    @Override
    public void eat() {
        System.out.println("I am eating eucalyptus");
    }

    @Override
    public void sleep() {
        System.out.println("I am sleeping almost always");
    }
}
