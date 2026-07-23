class NestedTry {
    public static void main(String[] args) {

        try {
            System.out.println("outer try");

            try {
                int a = 10 / 0;
                System.out.println(a);
            }
            catch (ArithmeticException e) {
                System.out.println("inner try catch: Division by zero");
            }

            int arr[] = new int[2];
            arr[5] = 20;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("outer try catch: Array index error");
        }
    }
}
