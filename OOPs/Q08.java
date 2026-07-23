class Person {
    String firstName = "Ganesh";
    String lastName = "Ye' Lenin";
    String getFirstName() {
        return firstName;
    }
    String getLastName() {
        return lastName;
    }
}
class Employee extends Person {

    int employeeId = 6493;
    String jobTitle = "Trainee";

    int getEmployeeId() {
        return employeeId;
    }

    @Override
    String getLastName() {
        return lastName + " (" + jobTitle + ")";
    }
}

public class Job {

    public static void main(String[] args) {

        Employee e = new Employee();
        e.getFirstName();
        e.getLastName();
        e.getEmployeeId();
        System.out.println(e.getFirstName()+" "+ e.getLastName()+" ("+ e.getEmployeeId()+")" );
    }
}
