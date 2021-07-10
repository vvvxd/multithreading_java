class Second implements Runnable {
    Foo f;

    Second(Foo f) {
        this.f = f;
        new Thread(this, "Second").start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                f.second();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}