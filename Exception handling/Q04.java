class FinallyDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
            int result_2 = 10/0;
            System.out.println("Result: " + result_2);

        }
        catch (Exception e) {
            System.out.println("Exception occurred");
        }
        finally {
            System.out.println("Finally block always executes");
        }
    }
}
