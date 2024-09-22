package Arrays_1_4;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        String[] firstNames = {"asd", "fgh", "jkl", "mno", "pqr", "tuv"};
        String[] lastNames = {"qwe","rty","yui", "zxc", "vbn", "zaq"};

        for (int i = 0; i < n; i++) {
            int randomInt = (int) (Math.random() * firstNames.length);
            int randomLastInt = (int) (Math.random() * lastNames.length);
            System.out.println(firstNames[randomInt] + " " + lastNames[randomLastInt]);
        }

    }
}
