abstract class Shape {
    abstract void area();

    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of circle = πr²");
    }
}

class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
        c.display();
    }
}
