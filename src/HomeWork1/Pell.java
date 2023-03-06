package HomeWork1;

import java.util.Scanner;

public class Pell {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int first = 0;
            int second = 1;
            int pn = 0;
            while (n>=1){
                pn = 2*first + second;
                second = first;
                first = pn;
                n = n-1;
            }

            System.out.println(pn);
        }
    }
}

