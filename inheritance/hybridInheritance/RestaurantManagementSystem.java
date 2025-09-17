package inheritance.hybridInheritance;
// Hybrid Inheritance - Restaurant Management System
// Demonstrates: Hybrid Inheritance (Inheritance + Interface)

interface Worker {
    void performDuties();
}

class Person {
    protected String name;
    protected int id;
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    public Chef(String name, int id) { super(name, id); }
    @Override
    public void performDuties() {
        System.out.println("Chef prepares food.");
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) { super(name, id); }
    @Override
    public void performDuties() {
        System.out.println("Waiter serves customers.");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Worker[] workers = {
            new Chef("Alice", 1),
            new Waiter("Bob", 2)
        };
        for (Worker w : workers) {
            w.performDuties();
        }
    }
}
