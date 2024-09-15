public import java.util.Arrays;

class k1 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No arguments provided. Please provide integer arguments.");
            return;
        }

        int[] arr = new int[args.length];

        try {
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide only integer values.");
            return;
        }

        System.out.println("Before Sorting ::");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        Arrays.sort(arr);

        System.out.println("After Sorting ::");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Minimum Value : " + arr[0] + " Maximum Value : " + arr[arr.length - 1]);
    }
}
