class ReturningObjTest{
    public static void main(String[] args) {
        ReturningObj R1 = new ReturningObj();
        ReturningObj R2 = new ReturningObj();
        R1.getData(10, 14);
        R2.getData(10, 14);
        ReturningObj R3;
        R3 = new ReturningObj();
        R3 = R1.Addition(R2);
        R3.putData();
    }
}
/**
 * MH3_PR-03(14)_ER-42_HANSIL
 */
class ReturningObj{
    private int nn1;
    private int nn2;
    void getData(int n1, int n2){
        this.nn1 = n1;
        this.nn2 = n2;
    }    
    void putData(){
        System.out.println("Num1 = " + nn1 + "\nNum2 = " + nn2);
    }
    ReturningObj Addition(ReturningObj R1){
        R1.nn1 = nn1 + R1.nn1;
        R1.nn2 = nn2 + R1.nn2;
        return R1; 
    }
}
