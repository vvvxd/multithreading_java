class Third implements Runnable {
    Foo f;

    Third(Foo f) {
        this.f = f;
        new Thread(this, "Third").start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                f.third(()-> System.out.print("third "));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
