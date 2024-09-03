public  class CheckCompilationError{
    A a1 = new A();
    A a2 = new B();
    // B b1 = new A(); // Type mismatch: cannot convert from A to B //(USE) B b1 = (B) new A();
    B b2 = new B();

}
class A{

}
class B extends A{

}