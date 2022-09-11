package org.example.Singleton;

public class Main {
    public static void main(String[] args) {
       Singelton singelton = Singelton.getInstance();
       singelton.setContador(20);

        Singelton singelton2 = Singelton.getInstance();

        System.out.println("Valor: " + singelton.getContador() + " en memoria" + singelton);
        System.out.println("Valor 2: " + singelton2.getContador() + " en memoria" + singelton2);
    }
}