package HomeWork2.Task2;

public class Operations implements ComplexNumber {
    @Override
    public ComplexNumberIml sum(ComplexNumberIml a, ComplexNumberIml b) {
        ComplexNumberIml sum = new ComplexNumberIml(0,0) ;
        sum.firstNumber = (a.firstNumber +b.firstNumber);
        sum.secondNumber = (a.secondNumber +b.secondNumber);
        return sum;
    }

    @Override
    public ComplexNumberIml mult(ComplexNumberIml a, ComplexNumberIml b) {
        ComplexNumberIml mult = new ComplexNumberIml(0,0) ;
        mult.firstNumber = (a.firstNumber *b.firstNumber)-(a.secondNumber * b.secondNumber);
        mult.secondNumber = (a.firstNumber *b.secondNumber)+(a.secondNumber*b.firstNumber);
        return mult;
    }

    @Override
    public ComplexNumberIml sub(ComplexNumberIml a, ComplexNumberIml b) {
        ComplexNumberIml sum = new ComplexNumberIml(0,0) ;
        sum.firstNumber = (a.firstNumber - b.firstNumber);
        sum.secondNumber = (a.secondNumber - b.secondNumber);
        return sum;
    }

    @Override
    public double modul(ComplexNumberIml a) {
        double modul;
        modul = Math.sqrt(Math.pow(a.firstNumber, 2)+Math.pow(a.secondNumber,2));
        return modul;
    }
}

