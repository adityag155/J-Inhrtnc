class X {
    void methodX() {
        System.out.println("Parent class method ");
    }
}

class Y extends X {
    void methodY() {
        System.out.println("class Y method");
    }
}

class Z extends Y {
    void methodZ() {
        System.out.println("class Z Method");
    }
}

public class MultileveInhrtnc {
    public static void main(String args[]) {
        Z obj = new Z();
        obj.methodX();
        obj.methodY();
        obj.methodZ();
    }
}
/*
O/P:
Parent class method
class Y method
class Z Method
*/