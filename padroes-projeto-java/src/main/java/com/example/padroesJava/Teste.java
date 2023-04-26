package com.example.padroesJava;

import com.example.padroesJava.facade.Facade;
import com.example.padroesJava.singleton.SingletonEager;
import com.example.padroesJava.singleton.SingletonLazy;
import com.example.padroesJava.singleton.SingletonLazyHolder;
import com.example.padroesJava.strategy.*;

public class Teste {
    public static void main(String[] args) {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("----------------------------------------------");

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);


        System.out.println("----------------------------------------------");

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();


        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        System.out.println("----------------------------------------------");

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "148011789");
    }


}
