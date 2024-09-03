class CozaLozaWoza{ 
    public static void main(String[] args) {
        CozaLozaWoza aCozaLozaWoza = new CozaLozaWoza();
        aCozaLozaWoza.printCozaLozaWoza(110, 11);
    }
    private void printCozaLozaWoza(int x, int y)
    {
        boolean b;
        for (int i = 1; i <= x; i++) {
            b = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                b = true;
            }
            if (i % 5 == 0) {
                System.out.print("Losa");
                b = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                b = true;
            }          
            if ( ! b) {
                System.out.print(i);
            }
            System.out.print(" ");
            
            if (i % 11 == 0) {
                System.out.println();
            }          
        }
        System.out.println();        
    }
}