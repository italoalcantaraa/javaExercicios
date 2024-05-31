package src.classes_introdução.test;

import src.classes_introdução.diminio.Carro;

public class CarroTeste_01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.name = "Uno";
        carro.model = "Escada";
        carro.year = 2000;

        carro2.name = "Corsa";
        carro2.model = "Brabo";
        carro2.year = 2010;

        carro2 = carro;

        System.out.println("Nome:  " + carro.name + " Modelo: " + carro.model + " Ano: " + carro.year);
        System.out.println("Nome:  " + carro2.name + " Modelo: " + carro2.model + " Ano: " + carro2.year);
    }
}
