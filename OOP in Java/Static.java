class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static int getCount() {
        return count;
    }
}

public class Static {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Count: " + Counter.getCount());
    }
}
