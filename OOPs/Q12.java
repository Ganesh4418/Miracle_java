public class DynamicBindingExample{
    public static void main(String[] args) {

        Operation obj;

        obj = new Addition();
        obj.calculate(10, 5);
    }
}
class Operation {
    void calculate(int a, int b) {
        System.out.println("Result");
    }
}

class Addition extends Operation {
    void calculate(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }
}
