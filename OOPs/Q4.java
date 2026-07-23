public class Maths {
    public static void main(String[] args) {
        Sub a = new Add();
        a.problem();
    }
}
class Sub {
    int a=10;
    int b=5;
    void problem() {
        System.out.println(a-b);
    }
}

class Add extends Sub {
    void problem() {
        System.out.println(a+b);
    }
}
