package Practice;

/**
 * Generics in Java is a feature that was introduced in J2SE 5 to deal with type-safe objects. It makes the code stable by detecting bugs at compile time1. The idea behind generics is to allow type (Integer, String, etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types2. An entity such as a class, interface, or method that operates on a parameterized type is called a generic entity2. Generics add type safety features to the Java language2. Is there anything else you would like to know?
 *
 * @param <T1>
 * @param <T2>
 */
class MyGenerics1<T1, T2> {
    private int val;
    private T1 t1;
    private T2 t2;

    public MyGenerics1(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }


}

public class JavaGenerics_CWH {
    public static void main(String[] args) {
        MyGenerics1<Integer, String> myGenerics1 = new MyGenerics1<>(21, 999, "This sis my generics");
        System.out.println(myGenerics1.getT1());
        System.out.println(myGenerics1.getT2());
        System.out.println(myGenerics1.getVal());
    }
}
