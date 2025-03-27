import java.util.Scanner;

public class Arrayop {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = takeinput();
        display(array);
        System.out.println(arrmax(array));

    }

    public static int[] takeinput() {
        System.out.println("size");
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;

    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int arrmax(int[] arr) {
        int max = Integer.MIN_VALUE;
        // Corrected: Integer.MIN_VALUE instead of Interger.MIN_VALUE
System.out.println("biggest");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { // Corrected: compare arr[i] with max
                max = arr[i];
            }
        }
        return max;
    }
}