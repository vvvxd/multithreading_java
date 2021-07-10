import java.util.concurrent.Semaphore;

public class Foo {
    static Semaphore firstSem = new Semaphore(1);
    static Semaphore secondSem = new Semaphore(0);
    static Semaphore thirdSem = new Semaphore(0);

    public void first() throws InterruptedException {
        firstSem.acquire();
        System.out.print("first");
        secondSem.release();
    }

    public void second() throws InterruptedException {
        secondSem.acquire();
        System.out.print("second");
        thirdSem.release();
    }

    public void third() throws InterruptedException {
        thirdSem.acquire();
        System.out.print("third ");
        firstSem.release();
    }
}
