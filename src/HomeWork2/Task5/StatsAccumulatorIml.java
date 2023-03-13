package HomeWork2.Task5;

public class StatsAccumulatorIml implements StatsAccumulator{

    int first;
    int second;
    int count;
    double sum = 0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    public void validate() throws ValidateExeption {
        if(count==0){
            throw new ValidateExeption("Вализация не прошла");
        }
    }
    @Override
    public void add(int value) throws ValidateExeption {

        this.first = value;
        count++;
        validate();
        getMin();
        getMax();
        this.sum += value;


    }

    @Override
    public int getMin() throws ValidateExeption {
        validate();
        if(first<min){
            min = first;
        }
        return min;
    }

    @Override
    public int getMax() throws ValidateExeption {
        validate();
        if(first>max){
            max = first;
        }
        return max;

    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Double getAvg() {
        Double Avg = sum / (double)count;
        return Avg;
    }
}
