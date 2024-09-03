class StaticVarTest {
    static int cnt = 0;
    StaticVarTest(){
        cnt++;   
    }
    public static void main(String[] args) {
        StaticVarTest s1 = new StaticVarTest();
        StaticVarTest s2 = new StaticVarTest();
        System.out.println(cnt);
        System.gc();
    }
}
