package access.ex;

public class CounterMain {
    static void main(String[] args) {

        MaxCounter maxCounter = new MaxCounter(3);
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();

        int count = maxCounter.getCount();
        System.out.println(count);
    }
}
