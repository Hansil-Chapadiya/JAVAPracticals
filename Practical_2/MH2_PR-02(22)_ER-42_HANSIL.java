class FibonacciSeries2{
   public static void main(String args[]) {
      int f, s, th, i, n;
      n = 20;
      f = 0;
      s = 1;
      System.out.println("Fibonacci series of first 20 number : " );
      System.out.print(f+" "+s);
      for(i = 2; i < n; i++) {
         th = f + s;
         System.out.print(" ");
         System.out.print(th);
         f = s;
         s = th;
      }
   }
}