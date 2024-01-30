package Practice;

@FunctionalInterface
interface A {
    void show();
}

@FunctionalInterface
interface B {
    void showIn(int x);
}

@FunctionalInterface
interface C {
    int sumUp(int x, int y, int z);
}


public class lambda30thJan {
    public static void main(String[] args) {
//        ACTUAL IMPLEMENTATION OF LAMBDA FUNCTION WITHOUT USING LAMBDA
//        A obj = new A() {
//            @Override
//            public void show() {
//                System.out.println("This method is inside show");
//            }
//        };
//        obj.show();

        A a = () -> System.out.println("This method is inside show");
        a.show();

//      ACTUAL IMPLEMENTATION OF LAMBDA FUNCTION WITHOUT USING LAMBDA
//        B b = new B() {
//            @Override
//            public void showIn(int x) {
//                System.out.println(x + " : This is the number");
//            }
//        };
//        b.showIn(67);
        B b = x -> System.out.println(x + " : This is the number");
        b.showIn(89);

//      ACTUAL IMPLEMENTATION OF LAMBDA FUNCTION WITHOUT USING LAMBDA
//        C c = new C() {
//            @Override
//            public int sumUp(int x, int y, int z) {
//                return (x + y + z);
//            }
//        };
        C c = (x, y, z) -> x + y + z;
        System.out.println(c.sumUp(1, 3, 2));

    }
}