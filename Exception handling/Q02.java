class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a[] = new int[3];
            a[5] = 10;

            System.out.print("Enter: ");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}
