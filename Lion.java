package animals;

public class Lion extends Animals{
    public Lion(String name, String type, String activity, String habitat, int weight, int age) {
        super(name, type, activity, habitat, weight, age);
        System.out.println("New lion was born!");
    }

    @Override
    public void makeSound() {
        System.out.println("I am king of all animals!");
    }

    @Override
    public void eat() {
        System.out.println("I eat each slowly animals expect turtle");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep when I am full");
    }
}
