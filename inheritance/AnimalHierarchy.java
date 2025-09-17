package inheritance;
// Animal Hierarchy - Assisted Problem
// Demonstrates: Inheritance, Method Overriding, Polymorphism

class Animal {
    protected String name;
    protected int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) { super(name, age); }
    @Override
    public void makeSound() { System.out.println("Woof!"); }
}

class Cat extends Animal {
    public Cat(String name, int age) { super(name, age); }
    @Override
    public void makeSound() { System.out.println("Meow!"); }
}

class Bird extends Animal {
    public Bird(String name, int age) { super(name, age); }
    @Override
    public void makeSound() { System.out.println("Tweet!"); }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Buddy", 3),
            new Cat("Whiskers", 2),
            new Bird("Tweety", 1)
        };
        for (Animal a : animals) {
            System.out.print(a.name + " (" + a.age + "): ");
            a.makeSound();
        }
    }
}
