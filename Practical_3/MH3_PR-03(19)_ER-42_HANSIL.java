class  StaticNon {
    static int cnt = 0;
    static class StaticClass{
        StaticClass(){
            cnt++;
        }
        static void cntIncr(){
            cnt++;
        }   
        static void showcnt(){
            System.out.println("Count  = " +  cnt);
        }
    }
    public static void main(String[] args) {
        StaticNon.StaticClass s1 = new StaticNon.StaticClass();
        s1.showcnt();
        StaticNon.StaticClass s2 = new StaticNon.StaticClass();
        s2.showcnt();
    }           
}

