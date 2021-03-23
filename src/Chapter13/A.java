package Chapter13;

abstract class A {
    abstract void callme();

    void callmetoo() {
        System.out.println("this is a concrete method");
    }

}

class B extends A {
    void callme() {
        System.out.println("this is b implementaion of callme the abstract method in class A");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
//        A a = new A(); this is wrong it's an abstract class
        B b = new B();
        b.callme();
        b.callmetoo();
    }
}

