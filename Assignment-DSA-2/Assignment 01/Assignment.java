// Programming Assignment 1 - Two Pointer Technique
public class Assignment {

    // 1. Remove duplicates - Brute Force
    static void removeBrute() {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int[] unique = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (arr[i] == unique[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[k] = arr[i];
                k++;
            }
        }

        System.out.print("Brute Force: ");
        for (int i = 0; i < k; i++)
            System.out.print(unique[i] + " ");
        System.out.println("\nCount: " + k + "\n");
    }

    // 2. Remove duplicates - Two Pointers
    static void removeTwoPointers() {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int k = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[k - 1]) {
                arr[k] = arr[i];
                k++;
            }
        }

        System.out.print("Two Pointers: ");
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\nCount: " + k + "\n");
    }

    // 3. Pair Sum - Brute Force
    static void pairBrute() {
        int[] arr = {1, 2, 4, 7, 11, 15};
        int target = 15;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Brute Force Pair: "
                            + arr[i] + " + " + arr[j]);
                    System.out.println("Indices: " + i + ", " + j + "\n");
                    return;
                }
            }
        }

        System.out.println("No pair found\n");
    }

    // 4. Pair Sum - Two Pointers
    static void pairTwoPointers() {
        int[] arr = {1, 2, 4, 7, 11, 15};
        int target = 15;
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Two Pointers Pair: "
                        + arr[left] + " + " + arr[right]);
                System.out.println("Indices: " + left + ", " + right + "\n");
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("No pair found\n");
    }

    public static void main(String[] args) {
        System.out.println("REMOVE DUPLICATES");
        removeBrute();
        removeTwoPointers();

        System.out.println("PAIR SUM");
        pairBrute();
        pairTwoPointers();
    }
}
