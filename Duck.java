package animals;

public class Duck extends Animals{
    int wingspan;
    public Duck(String name, String type, String activity, String habitat, int wingspan, int weight, int age) {
        super(name, type, activity, habitat, weight, age);
        this.wingspan = wingspan;
        System.out.println("New duck was born!");
    }

    @Override
    public void makeSound() {
        System.out.println("My name is McDuck. Scrooge NcDuck");
    }

    @Override
    public void eat() {
        System.out.println("I am eating everything");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep standing on one leg");
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", wingspan='" + wingspan + '\'';
    }
}
