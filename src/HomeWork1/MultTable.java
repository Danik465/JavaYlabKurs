package HomeWork1;

public class MultTable {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int mul = i*j;
                System.out.print(i+" * "+j+ " = "+ mul + "; ");

            }
            System.out.println();
        }
    }
}
