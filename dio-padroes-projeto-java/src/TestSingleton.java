import one.digitalinnovation.gof.SingletonEager;
import one.digitalinnovation.gof.SingletonLazy;
import one.digitalinnovation.gof.SingletonLazyHolder;

public class TestSingleton {
    public static void main(String[] args) throws Exception {
        
        // Testes de Design Patterns 'Singleton': 

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println("-------------\n" + eager);

        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println("-------------\n" + holder);

        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
    }
}
