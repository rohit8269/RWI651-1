package Arrays;
import java.util.Arrays;

public class Sort {
    public static void main(String args[])
    {
        int[] arr = { 10, -2, 26, 7, 77, -32, 412 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
