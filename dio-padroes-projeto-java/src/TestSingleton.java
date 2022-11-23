import one.digitalinnovation.gof.Singleton.SingletonEager;
import one.digitalinnovation.gof.Singleton.SingletonLazy;
import one.digitalinnovation.gof.Singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.Strategy.Comportamento;
import one.digitalinnovation.gof.Strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.Strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.Strategy.ComportamentoNormal;
import one.digitalinnovation.gof.Strategy.Robo;

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

        // Testes de Design Patterns 'Strategy':

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
    
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
