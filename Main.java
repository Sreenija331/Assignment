package MultiThread;

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<=3;i++){
            Multithreading myThing=new Multithreading(i);
            myThing.start();
        }

    }
}
