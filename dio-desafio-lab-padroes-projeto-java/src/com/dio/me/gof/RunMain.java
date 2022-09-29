package com.dio.me.gof;

import com.dio.me.gof.facade.Facade;
import com.dio.me.gof.singleton.SingletonEager;
import com.dio.me.gof.singleton.SingletonLazy;
import com.dio.me.gof.singleton.SingletonLazyHolder;
import com.dio.me.gof.strategy.*;

public class RunMain {

    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Singleton:
        // Singletton

        System.out.println("SINGLETON");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy
        System.out.println("---");
        System.out.println("STRATEGY");
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        // Facade
        System.out.println("---");
        System.out.println("FACACE");
        Facade facade = new Facade();
        facade.migrarCliente("Fulano de Tal", "00000-000");

    }
}
