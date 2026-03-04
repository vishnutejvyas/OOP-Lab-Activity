class AccessModifiersDemo {

    // private variable
    private int privateVar = 10;

    // default variable
    int defaultVar = 20;

    // protected variable
    protected int protectedVar = 30;

    // public variable
    public int publicVar = 40;

    // private method
    private void privateMethod() {
        System.out.println("This is a Private Method");
    }

    // default method
    void defaultMethod() {
        System.out.println("This is a Default Method");
    }

    // protected method
    protected void protectedMethod() {
        System.out.println("This is a Protected Method");
    }

    // public method
    public void publicMethod() {
        System.out.println("This is a Public Method");
    }

    public static void main(String[] args) {

        AccessModifiersDemo obj = new AccessModifiersDemo();

        // accessing variables
        System.out.println(obj.privateVar);
        System.out.println(obj.defaultVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.publicVar);

        // accessing methods
        obj.privateMethod();
        obj.defaultMethod();
        obj.protectedMethod();
        obj.publicMethod();
    }
}