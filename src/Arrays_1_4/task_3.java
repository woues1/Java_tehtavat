package Arrays_1_4;
import java.util.Scanner;
import java.util.ArrayList;
public class task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> noDuplicates = new ArrayList<>();
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arrSize; i++) {
                if (!noDuplicates.contains(arr[i])) {
                    noDuplicates.add(arr[i]);
                }
        }
        System.out.println("The array without duplicates:");

        for (Integer noDuplicate : noDuplicates) {
            System.out.print(noDuplicate + " ");
        }
    }
}
