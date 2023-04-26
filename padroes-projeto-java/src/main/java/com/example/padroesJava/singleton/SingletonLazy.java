package com.example.padroesJava.singleton;

/**
 * Singleton "preguiçoso".
 *
 * @author KAYSILVHA
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
