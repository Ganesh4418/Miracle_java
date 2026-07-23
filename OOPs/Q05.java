class Addition {

    //Two parameters
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // Three parameters
    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }

    // Double parameters
    void add(double a, double b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {

        Addition obj = new Addition();

        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10.5, 20.5);
    }
}
