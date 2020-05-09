public class Test {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator("Long đẹp trai");
        NumberGenerator numberGenerator2 = new NumberGenerator("Long siêu đẹp trai");
        Thread myThread1 = new Thread(numberGenerator1);
        Thread myThread2 = new Thread(numberGenerator2);
        myThread2.setPriority(Thread.MAX_PRIORITY);
        myThread1.setPriority(Thread.MIN_PRIORITY);
        myThread1.start();
        myThread2.start();
    }
}
