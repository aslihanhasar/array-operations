import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        minMaxValue(receiveArray());
        System.out.println();
        nearestNumber(receiveArray());
    }

    static int[] receiveArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");

        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + ". element of the array: ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    static void minMaxValue(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        System.out.println("The minimum value of the array: " + min);
        System.out.print("The maximum value of the array: " + max);
    }

    static void nearestNumber(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a limit number: ");
        int number = scanner.nextInt();
        int minNear = arr[0];
        int maxNear = arr[0];

        for (int i : arr) {
            if (i < number) {
                if ((Math.abs(i - number)) <= (Math.abs(minNear - number))) {
                    minNear = i;
                }
            }
            if (i > number) {
                if ((Math.abs(i - number)) <= (Math.abs(number - maxNear))) {
                    maxNear = i;
                }
            }
        }
        System.out.println("The nearest number smaller than the number: " + minNear);
        System.out.println("the nearest number bigger than the number: " + maxNear);

    }

}
