package com.example.padroesJava;

/**
 * Singleton "apressado".
 *
 * @author KAYSILVHA
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
