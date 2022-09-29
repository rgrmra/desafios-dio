package com.dio.me.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author rgrmra
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}