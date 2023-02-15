package creation.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        EagerInitialization eagerInitialization1 = EagerInitialization.getInstance();
        EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();

        System.out.println("1 : " + eagerInitialization1);
        System.out.println("2 : " + eagerInitialization2);

        System.out.println();

        ThreadSafeLazyInitialization threadSafeLazyInitialization1 = ThreadSafeLazyInitialization.getInstance();
        ThreadSafeLazyInitialization threadSafeLazyInitialization2 = ThreadSafeLazyInitialization.getInstance();

        System.out.println("1 : " + threadSafeLazyInitialization1);
        System.out.println("2 : " + threadSafeLazyInitialization2);

        System.out.println();

        DoubleCheckedLocking doubleCheckedLocking1 = DoubleCheckedLocking.getInstance();
        DoubleCheckedLocking doubleCheckedLocking2 = DoubleCheckedLocking.getInstance();

        System.out.println("1 : " + doubleCheckedLocking1);
        System.out.println("2 : " + doubleCheckedLocking2);
    }
}
