//Single Inheritance ex:

class SingleInh {
    void methodA() {
        System.out.println("Base class Method");
    }
}

class B extends SingleInh {
    void methodB() {
        System.out.println("Child class Method");
    }

    public static void main(String args[]) {
        B obj = new B();                // creating object
        obj.methodA();
        obj.methodB();
    }
}