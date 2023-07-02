public class TaskTwo {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,4,1,4};
        try {
            int d = 0;
            double catchedRes1 = arr[1] / d;
            System.out.println(catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e.getMessage());
        }
    }
}
