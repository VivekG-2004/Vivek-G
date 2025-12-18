package Problems;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        int limit;
        if (a % 2 == 0) {
            limit = a - 1;
        } else {
            limit = a;
        }

        for (int i = 0; i < limit; i++) {
            int odd = 2 * i + 1;
            System.out.print(odd);
            if (i < limit - 1) {
                System.out.print(", ");
            }
        }
        sc.close();
    }
}

