import java.util.concurrent.Semaphore;

public class Foo {
    static Semaphore firstSem = new Semaphore(1);
    static Semaphore secondSem = new Semaphore(0);
    static Semaphore thirdSem = new Semaphore(0);

    public void first(Runnable r1) throws InterruptedException {
        firstSem.acquire();
        r1.run();
        secondSem.release();
    }

    public void second(Runnable r1) throws InterruptedException {
        secondSem.acquire();
        r1.run();
        thirdSem.release();
    }

    public void third(Runnable r1) throws InterruptedException {
        thirdSem.acquire();
        r1.run();
        firstSem.release();
    }
}
