package creation.singleton;

public class ThreadSafeLazyInitialization {

    private static ThreadSafeLazyInitialization threadSafeLazyInitialization;

    private ThreadSafeLazyInitialization(){}

    public static synchronized ThreadSafeLazyInitialization getInstance() {
        if(threadSafeLazyInitialization == null) {
            threadSafeLazyInitialization = new ThreadSafeLazyInitialization();
        }
        return threadSafeLazyInitialization;
    }
}
