package animals;

public class Main {
    public static void main(String[] args) {
        Koala koala = new Koala("Po","graminivorous","daytime", "forest", 30, 10 );
        System.out.println(koala.toString());
        koala.makeSound();
        koala.eat();
        koala.sleep();
        System.out.println("#######################################");
        Dog dog = new Dog("Volt", "predator", "daytime", "house", 14, 5);
        System.out.println(dog.toString());
        dog.makeSound();
        dog.eat();
        dog.sleep();
        System.out.println("#######################################");
        Duck duck = new Duck("Scrooge NcDuck", "graminivorous", "daytime", "water", 1, 3, 1);
        System.out.println(duck.toString());
        duck.makeSound();
        duck.eat();
        duck.sleep();
        System.out.println("#######################################");
        Lion lion = new Lion("Simba","predator","daytime/nighttime", "savanna", 100,20);
        System.out.println(lion.toString());
        lion.makeSound();
        lion.eat();
        lion.sleep();
        System.out.println("#######################################");
        if(koala.age < dog.age)
            System.out.println("Po is younger");
                    else
            System.out.println("Po is older");

    }
}
