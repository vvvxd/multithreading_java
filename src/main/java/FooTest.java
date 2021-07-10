public class FooTest {
    public static void main(String[] args) {
        Foo foo = new Foo();
        new First(foo);
        new Second(foo);
        new Third(foo);
    }
}

