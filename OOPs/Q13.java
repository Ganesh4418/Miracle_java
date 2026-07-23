public class SuperKeyword {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}

class Person {
    String name = "Rahul";

    void display() {
        System.out.println("Person Name: " + name);
    }
}

class Student extends Person {
    String name = "Amit";

    void show() {
        System.out.println("Student Name: " + name);
        System.out.println("Person Name: " + super.name);

        super.display();
    }
}

