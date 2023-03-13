package HomeWork2.Task1;

import java.util.Scanner;

public class SequencesTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SequencesImpl seqGen = new SequencesImpl();
        seqGen.a(n);
        seqGen.b(n);
        seqGen.c(n);
        seqGen.d(n);
        seqGen.e(n);
        seqGen.f(n);
        seqGen.g(n);
        seqGen.h(n);
        seqGen.i(n);
        seqGen.j(n);
        sc.close();
    }



}
