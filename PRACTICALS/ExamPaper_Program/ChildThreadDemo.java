public class ChildThreadDemo {
    public static void main(String[] args) {
        ChildThread childthread = new ChildThread();
        childthread.start();

        System.out.println("Main thread is running....");
        try{
            childthread.join();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Child thread has finished execution.");
        System.out.println("Main thread is ending...");
    }
}
class ChildThread extends Thread
{
    public void run()
    {
        for(int i=0; i<=10;i++)
        {
            System.out.println(i);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

}
