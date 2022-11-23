import one.digitalinnovation.gof.Singleton.SingletonEager;
import one.digitalinnovation.gof.Singleton.SingletonLazy;
import one.digitalinnovation.gof.Singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.Strategy.Comportamento;
import one.digitalinnovation.gof.Strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.Strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.Strategy.ComportamentoNormal;
import one.digitalinnovation.gof.Strategy.Robo;
import one.digitalinnovation.gof.facade.Facade;

public class Testes {
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
        System.out.println("-------------");
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Testes de Design Patterns 'Facade':

        Facade facade = new Facade();
        System.out.println("-------------");
        facade.migrarCliente("Fábio", "23044-850");
    }
}