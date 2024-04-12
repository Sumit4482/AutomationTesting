class MyClass {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;

    public void display() {
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Protected Variable: " + protectedVar);
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.publicVar);    // Output: 10
      //  System.out.println(obj.privateVar); // Compile error: privateVar has private access in MyClass
        System.out.println(obj.protectedVar); // Output: 30
        obj.display();
    }
}
