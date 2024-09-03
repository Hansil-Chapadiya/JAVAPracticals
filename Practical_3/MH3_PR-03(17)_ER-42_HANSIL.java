class StaticBlock {
    static{
        System.out.println("I am executing Before main() method");
    }
    public static void main(String[] args) {
        System.out.println("I am main() method");
    }
}
