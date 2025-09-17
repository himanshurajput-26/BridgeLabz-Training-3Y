package Java_OOPS.Inheritance;

interface Worker {
    void performDuties();
}

class Person1 {
    String name; int id;
    Person1(String name, int id) { this.name = name; this.id = id; }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) { super(name, id); }
    @Override
    public void performDuties() {
        System.out.println(name + " (Chef) is cooking food.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) { super(name, id); }
    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving customers.");
    }
}

public class RestaurantTest {
    public static void main(String[] args) {
        Worker w1 = new Chef("Raj", 101);
        Worker w2 = new Waiter("Sam", 102);
        w1.performDuties();
        w2.performDuties();
    }
}
