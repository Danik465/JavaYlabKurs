package HomeWork2.Task2;

public interface ComplexNumber {
//    Сложение чисел:
    ComplexNumberIml sum(ComplexNumberIml a , ComplexNumberIml b);
    //    Умножение чисел:
    ComplexNumberIml mult(ComplexNumberIml a , ComplexNumberIml b);
    //    Вычитание чисел:
    ComplexNumberIml sub(ComplexNumberIml a , ComplexNumberIml b);
    //    Взятие модуля:
    double modul(ComplexNumberIml a);

}
