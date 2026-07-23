class Person {

    String firstName = "Ganesh";
    String lastName = "Ye' Lenin";

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    public static void main(String[] args) {

        Person p = new Person();
        p.getFirstName();
        p.getLastName();

        System.out.println("First Name: " + p.getFirstName());
        System.out.println("Last Name: " + p.getLastName());
    }
}
