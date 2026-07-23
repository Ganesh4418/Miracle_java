class Employee {

    void work() {
        System.out.println("Active employee");
    }

    int getSalary() {
        return 30000;
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        e.work();
        System.out.println("Salary = " + e.getSalary());
    }
}
