package Arrays_1_4;
import java.util.Scanner;
public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        int high = 0;
        int pos1 = 0;
        int pos2 = 0;
        for(int i = 0; i < arr.length -1; i++){
            for(int j = 0; j < arrSize; j++){

                if(arr[i] + arr[j] > high && j != i){
                    high = arr[i] + arr[j];
                    pos1 = i + 1;
                    pos2 = j + 1;
                }
            }
        }
        System.out.println("Maximum sum: " + high);
        System.out.println("Integers " + pos1 + "-" + pos2);

    }
}
