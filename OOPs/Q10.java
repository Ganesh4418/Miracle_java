class InterfaceDemo {
    public static void main(String[] args) {
        Problem p = new Problem();
        p.sum();
    }
}
interface Maths {
    int a=10;
    int b=20;
    void sum();
}
class Problem implements Maths {
    public void sum() {
        System.out.println(a+b);
    }
}
