interface Animal {
    void sound();   // Abstract method

    default void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.sound();
        d.sleep();
    }
}
