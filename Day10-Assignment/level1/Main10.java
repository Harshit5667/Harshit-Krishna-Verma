interface Worker {
    void performDuties();
}

class Person2 {
    String name;
    int id;
    Person2(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person2 implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking");
    }
}

class Waiter extends Person2 implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving");
    }
}

public class Main10 {
    public static void main(String[] args) {
        Worker w1 = new Chef("John", 1);
        Worker w2 = new Waiter("Emma", 2);
        w1.performDuties();
        w2.performDuties();
    }
}
