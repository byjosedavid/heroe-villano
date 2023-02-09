package org.example;

import clases.Villano;
import org.example.paquetico.Pareja;

public class CuartelGeneral {
    public static void main(String[] args) {

        //creo un Heroe
        Heroe heroe = new Heroe();
        heroe.setNombre("Batman");
        heroe.setPoder(800);

        System.out.println(heroe.getNombre());
        System.out.println(heroe.getPoder());

        //creo un villano
        Villano villano = new Villano();


        //Creo una pareja
        Pareja pareja = new Pareja();



    }
}