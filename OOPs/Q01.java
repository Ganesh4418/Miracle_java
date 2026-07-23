public class Inheritance {
    public static void main(String[] args) {
        Mul m = new Mul();
        m.add();
        m.sub();
        m.mul();
    }
}

class Maths {
    int a = 20;
    int b = 10;
    void add() {
        System.out.println(a+b);
    }
}

class Sub extends Maths {
    void sub() {
        System.out.println(a-b);
    }
}

class Mul extends Sub {
    void mul() {
        System.out.println(a*b);
    }
}

