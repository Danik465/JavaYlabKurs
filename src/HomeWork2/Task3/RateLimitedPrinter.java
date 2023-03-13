package HomeWork2.Task3;

public class RateLimitedPrinter {
    int interval ;
    public RateLimitedPrinter(int interval) {
// code here
        this.interval = interval;
    }
    long currentTime = System.currentTimeMillis(); // возвращает текущее
    // время

    public void print(String message) {
// code here
    long deltaTime =  System.currentTimeMillis();

        if(deltaTime - currentTime  == interval){
            System.out.println(message);
            currentTime = System.currentTimeMillis();
        }

    }

}
