package HomeWork2.Task5;

public class StatsAccumulatorTest {
    public static void main(String[] args) throws ValidateExeption {
        StatsAccumulator s = new StatsAccumulatorIml(); // как то создается
        s.add(2);
        s.add(19);
        System.out.println(s.getAvg()); // 1.5 - среднее арифметическое элементов
        s.add(-1);
        System.out.println(s.getMin()); // 0 - минимальное из переданных значений
        s.add(-1);
        s.add(10);
        s.add(10);
        System.out.println(s.getMax()); // 8 - максимальный из переданных
        System.out.println(s.getCount()); // 5 - количество переданных элементов
    }
}
