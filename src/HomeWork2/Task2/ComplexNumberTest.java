package HomeWork2.Task2;

public class ComplexNumberTest {
    public static void main(String[] args) {
        ComplexNumberIml CN = new ComplexNumberIml(5);
        ComplexNumberIml CN1 = new ComplexNumberIml(5,10);

        Operations oper = new Operations();

        ComplexNumberIml sum = oper.sum(CN,CN1);
        System.out.println(sum);
        ComplexNumberIml mult = oper.mult(CN,CN1);
        System.out.println(mult);
        ComplexNumberIml sub = oper.sub(CN,CN1);
        System.out.println(sub);
        double modul = oper.modul(CN);
        System.out.println(modul);


    }
}
