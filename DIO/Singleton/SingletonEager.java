package DIO.Singleton;

/* Singleton "apressado"
 */
public class SingletonEager {
 



    private static SingletonEager instancia = new SingletonEager();;

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia(){
        if(instancia==null){
  
        }
        return instancia;
    }
}

