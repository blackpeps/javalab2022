import java.util.Random;
class RandomThread extends Thread {
    public void run() {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int n = r.nextInt(100);
            if (n % 2 == 0) {
                new Even(n).start();
            }
            else {
                new Odd(n).start();
            }
        }
    }
}
class Even extends Thread {
    private int num;
    public Even (int num){
        this.num = num;
    }
    public void run() {
        System.out.println("Square of " + num + " = " + num * num);
    }
}
class Odd extends Thread {
    private int num;
    public Odd (int num){
        this.num = num;
    }
    public void run() {
        System.out.println("Cube of " + num + " = " + num * num * num);
    }
}
public class Test {
    public static void main (String args[]) {
        RandomThread r = new RandomThread();
        r.start();
    }
}
