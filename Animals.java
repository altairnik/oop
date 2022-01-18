package animals;

public abstract class Animals {
    String name;
    String type;
    String activity;
    String habitat;
    int weight;
    int age;

    public  Animals(String name, String type, String activity, String habitat, int weight, int age){
        //System.out.println("Animal creator");
        this.name = name;
        this.type = type;
        this.activity = activity;
        this.habitat = habitat;
        this.weight = weight;
        this.age = age;
    }
    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age;
    }
}
