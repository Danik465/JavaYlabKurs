package HomeWork2.Task4;

public class SnilsValidatorImpl implements SnilsValidator {
    @Override
    public boolean validate(String snils) {

        int mult = 0;
        int index = 9;
        int result = 0;
        for (int i = 0; i < snils.length() - 2; i++) {
            int x = Character.digit(snils.charAt(i), 10);
            boolean isDigit = Character.isDigit(x);
            if (isDigit || x == -1) {
                return false;
            } else {
                //1. Вычислить сумму произведений цифр СНИЛС
                mult += x * index;
                index--;
            }
        }
        //2. Проверка контрольного числа
        if (mult < 100) {
            result = mult;
        } else if (mult == 100) {
            result = 0;
        } else {
            mult = mult % 101;
            if (mult == 100) {
                result = 0;
            } else {
                result = mult;
            }
        }
        //3. Сравнение цифр СНИЛСа с контрольным числом

        int last = Integer.parseInt(snils.substring(snils.length() - 2));
        if (last == result) {
            return true;
        } else {
            return false;
        }


    }


}
