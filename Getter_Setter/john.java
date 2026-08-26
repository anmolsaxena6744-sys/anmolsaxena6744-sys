class Student {
    // Private variable
    private String name;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        // Using setter to set the value
        s.setName("John");

        // Using getter to get the value
        System.out.println("Student Name: " + s.getName());
    }
}
