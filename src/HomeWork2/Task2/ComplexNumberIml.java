package HomeWork2.Task2;

public class ComplexNumberIml {
    double firstNumber;
    double secondNumber;
    public ComplexNumberIml(double firstNumber,double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public ComplexNumberIml(double firstNumber){
        this.firstNumber =firstNumber;
        this.secondNumber = 0;
    }



    @Override
    public String toString() {
        return firstNumber +" + "+ secondNumber +"i" ;
    }
}
