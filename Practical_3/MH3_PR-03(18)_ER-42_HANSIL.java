class StaticMethodTest {
    public static void main(String[] args) {
        StaticMethod s1 = new StaticMethod();
        StaticMethod s2 = new StaticMethod();
        s1.Cntincr();
        s2.Cntincr();
        StaticMethod.ShowCount();
    }
}
class StaticMethod{
    static int cnt=0;
    void Cntincr(){
        cnt++;
    }
    static void ShowCount(){
        System.out.println(cnt);

    }
}
