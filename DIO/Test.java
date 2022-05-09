package DIO;


import DIO.Facade.Facade;
import DIO.Singleton.SingletonEager;
import DIO.Singleton.SingletonLazy;
import DIO.Singleton.SingletonLazyHolder;
import DIO.Strategy.Comportamento;
import DIO.Strategy.ComportamentoAgressivo;
import DIO.Strategy.ComportamentoDefensivo;
import DIO.Strategy.ComportamentoNormal;
import DIO.Strategy.Robo;

public class Test {
    
    public static void main(String[] args) {

        //Testes relacionados ao Design Pattern Singleton
        SingletonLazy lazy =  SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager =  SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder =  SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
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

        
		Facade facade = new Facade();
		facade.migrarCliente("Douglas", "14801788");
        
    }
}
