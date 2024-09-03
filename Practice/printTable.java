class Print{
    synchronized void printtable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
public class printTable{
    public static void main(String[] args) {
        Print p1 = new Print();
        Thread t1 = new Thread(new Runnable()
        {
            public void run()
            {
                p1.printtable(10);
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            public void run()
            {
                p1.printtable(14);
            }
        });

        t1.start();

        try {
            t1.join();
        } catch (Exception e) {
            // TODO: handle exception
        }

        t2.start();

        try {
            t2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}


//Using Thred
// public class printTable {
//     public static void main(String args[])
//     {
//         Print p1 = new Print();
//         Thread t1 = new Thread(new Thread()
//         {
//             public void run()
//             {
//                 p1.printtable(10);
//             }
//         });
//         Thread t2 = new Thread(new Thread()
//         {
//             public void run()
//             {
//                 p1.printtable(14);
//             }
//         });
//         t1.start();
//         try {
//             t1.join();
//         } catch (Exception e) {
//             // TODO: handle exception
//         }
//         t2.start();
//         try {
//             t2.join();
//         } catch (Exception e) {
//             // TODO: handle exception
//         }
//     }
// }
