public class ConstructorOverLoading {
    public static void main(String[] args) {
        InnerConstructorOverLoading In = new InnerConstructorOverLoading();
        System.out.println(In.getValue());
        In = new InnerConstructorOverLoading(Integer.valueOf(25));
        System.out.println(In.getValue());
        In = new InnerConstructorOverLoading(36);
        System.out.println(In.getValue());
    }
}

/**
 * InnerConstructorOverLoading
 */
class InnerConstructorOverLoading {
    int defualt;

    InnerConstructorOverLoading() {
        defualt = 0;
    }

    InnerConstructorOverLoading(int defualt) {
        this.defualt = defualt;
    }

    InnerConstructorOverLoading(Integer defualt) {
        this.defualt = defualt;
    }

    public int getValue() {
        return this.defualt;
    }
}
