class Company{
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();                  // Override method
        hr.addEmployee();           // New method
    }
}
class Employee {
    void work() {
        System.out.println("Active employee");
    }
    int getSalary() {
        return 30000;
    }
}
class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager");
    }
    void addEmployee() {
        System.out.println("New Employee Added");
    }
}
