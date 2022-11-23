package one.digitalinnovation.gof.Singleton;

/**
 * Singleton "Lazy Holder".
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Ref</a>
 * 
 * @author Fábio (BiNh0X)
 * 
 */
public class SingletonLazyHolder {
 
    private static class InstanceHolder {
        
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
    
        super();
    }

    public static SingletonLazyHolder getInstancia() {

        return InstanceHolder.instancia;
    }    
}