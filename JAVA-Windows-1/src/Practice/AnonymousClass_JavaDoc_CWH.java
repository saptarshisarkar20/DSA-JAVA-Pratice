package Practice;

interface DemoAno {
    public void Method1();

    public int method2(int a, int b);
}

/**
 * This is a description of the Javadoc
 * This description renders as a <b>HTML</b> file
 * Let's test -> This <i><b>Description</b></i>
 *
 * @author Saptarshi Sarkar (Github: saptarshisarkar20)
 * @version 1.0.0
 * {@code @use} This class is used to Demo the work of Anonymous Class of Java
 * @see <a href="https://github.com/saptarshisarkar20" target="_blank"> My Profile</a>
 */
public class AnonymousClass_JavaDoc_CWH {
    public static void main(String[] args) {
        DemoAno da = new DemoAno() {
            /**
             * This is a method inside the Anonymous Class
             * It is a void method just prints
             *
             */
            @Override
            public void Method1() {
                System.out.println("This is a method of Anonymous Class :)");
            }

            /**
             * this method returns a value
             * @param a -> input int
             * @param b -> input int
             * @return output int
             */
            @Override
            public int method2(int a, int b) {
                return (a * b + a / b + b / a);
            }
        };

        da.Method1();
        System.out.println(da.method2(45, 21));
    }
}
