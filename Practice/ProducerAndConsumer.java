import java.util.LinkedList;
import java.util.Scanner;
class ProducerAndConsumerTest{
    int capacity = 2;
    LinkedList<Integer> list = new LinkedList<>();
    void producer() throws InterruptedException {
        while(true){
            synchronized(this){
                while (list.size() == capacity) {
                    wait();
                }
                Scanner sc = new Scanner(System.in);
                int item = sc.nextInt();
                list.add(item);
                System.out.println("Added Element = " + item);
                notify();
                Thread.sleep(100);
            }
        }
    } 
    void Consumer() throws InterruptedException{
        while(true){
            synchronized(this){
                while (list.size() == 0) {
                    wait();
                }
                int item= list.removeFirst();
                System.out.println("Removed Element = " + item );
                notify();
                Thread.sleep(100);
            }
        }
    } 
}
public class ProducerAndConsumer {
    public static void main(String[] args) throws InterruptedException{
        ProducerAndConsumerTest t1 = new ProducerAndConsumerTest();
        Thread p1 = new Thread(new Thread(){
        public void run(){
            try{
                t1.Consumer();
            }
            catch(InterruptedException i){}
           
        }
       });
       Thread c1 = new Thread(new Runnable() {
        public void run(){
            try{
                t1.producer();
            }
            catch(InterruptedException i){}
           
        }
       });
       p1.start();
       c1.start();
       p1.join();
       c1.join();
    }
}
