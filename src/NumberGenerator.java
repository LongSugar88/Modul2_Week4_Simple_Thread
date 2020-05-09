import java.util.Random;

public class NumberGenerator implements Runnable {
    String name;
    NumberGenerator(){

    }
    NumberGenerator(String name){
     this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int num = new Random().nextInt(100);
                System.out.println(this.name +" "+ num);
                Thread.sleep(500);
            }
            System.out.println("HashCode: " + this.toString());
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
