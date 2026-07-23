public class MethodOverriding {
    public static void main(String[] args) {
        Thor t = new Thor();
        t.display();
    }
}
class Odin {
    void display() {
        System.out.println("Odin is worthy");
    }
}
class Thor extends Odin {
    @Override
    void display() {
        System.out.println("Thor is worthy");
    }
}
