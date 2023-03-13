package HomeWork2.Task1;

public class SequencesImpl implements Sequences {
    @Override
    public void a(int n) {
        System.out.print("A: ");
        for (int i = 1; i <= n*2; i++) {
            if(i%2==0){
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

    @Override
    public void b(int n) {
        System.out.print("B: ");
        for (int i = 1; i <= n*2; i++) {
            if(i%2!=0){
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

    @Override
    public void c(int n) {
        System.out.print("C: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i*i + " ");
        }
        System.out.println();
    }

    @Override
    public void d(int n) {
        System.out.print("D: ");
        for (int i = 1; i <= n; i++) {
                System.out.print((int)Math.pow(i,3) + " ");

        }
        System.out.println();
    }

    @Override
    public void e(int n) {
        System.out.print("E: ");
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
                System.out.print(1 + " ");
            }else System.out.print(-1 + " ");

        }
        System.out.println();
    }

    @Override
    public void f(int n) {
        System.out.print("F: ");
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                System.out.print(-i + " ");
            }else System.out.print(i + " ");

        }
        System.out.println();
    }

    @Override
    public void g(int n) {
        System.out.print("G: ");
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                System.out.print(-(int)Math.pow(i,2) + " ");
            }else System.out.print((int)Math.pow(i,2) + " ");

        }
        System.out.println();
    }

    @Override
    public void h(int n) {
        System.out.print("H: ");
        int index = 1;
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                System.out.print(0 + " ");
            }else {
                System.out.print(index + " ");
                index++;
            }

        }
        System.out.println();
    }

    @Override
    public void i(int n) {
        System.out.print("I: ");
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact*=i;
            System.out.print(fact + " ");
        }
        System.out.println();
    }

    @Override
    public void j(int n) {
        System.out.print("J: ");
        int first = 1;
        int second = 1;
        int third;
        System.out.print(first + " " +second+ " ");
        for (int i = 2; i <= n; i++) {
            third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;

        }
        System.out.println();
    }
}
