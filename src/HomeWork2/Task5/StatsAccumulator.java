package HomeWork2.Task5;

public interface StatsAccumulator {
    /**
     * Добавляет число в аккумулятор. Вызывается многократно
     * @param value число
     */
    void add(int value) throws ValidateExeption;
    /**
     * Возвращает минимальное из всех добавленных чисел
     * @return минимальное из всех добавленных чисел
     */
    int getMin() throws ValidateExeption;
    /**
     * Возвращает максимальное из всех добавленных чисел
     * @return максимальное из всех добавленных чисел
     */
    int getMax() throws ValidateExeption;
    /**
     * Возвращает количество всех добавленных чисел
     * @return количество добавленных чисел
     */
    int getCount();
    /**
     * Возвращает среднее арифметическое всех добавленных чисел
     * @return среднее арифметическое всех добавленных
     */
    Double getAvg();
}
