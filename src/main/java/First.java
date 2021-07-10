
public class First implements Runnable{
    Foo f;
    First(Foo f){
        this.f = f;
        new Thread(this,"First").start();
    }
    public  void run(){
        for (int i = 0; i < 10; i++) {
            try {
                f.first(()-> System.out.print("first"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}