package Sample;

import java.util.LinkedList;
import java.util.Scanner;
class ProducerAndConsumerTest extends Thread{
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
                notify();
                sleep(100);
            }
        }
    } 
    void Consumer() throws InterruptedException{
        while(true){
            synchronized(this){
                while (list.size() == 0) {
                    wait();
                }
                list.removeFirst();
                notify();
                sleep(100);
            }
        }
    } 
}
class Producer extends ProducerAndConsumerTest{
    public void run(){
        try{
            producer();
        }
        catch(InterruptedException i){}
        
    }
}
class Consumer extends ProducerAndConsumerTest{
    public void run(){
        try{
            Consumer();
        }
        catch(InterruptedException i){}
        
    }
}
public class ProducerAndConsumer {
    public static void main(String[] args) throws InterruptedException{
       Producer p1 = new Producer();
       Consumer c1 = new Consumer();
       p1.start();
       c1.start();
       p1.join();
       c1.join();
        //   Thread t1 = new Thread();
        //   t1.start();
        //   Thread t2 = new Thread();
        //   t2.start();
    }
}
