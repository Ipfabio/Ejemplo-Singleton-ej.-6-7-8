package org.example.Singleton;

public class Singelton {
    private static Singelton singelton;

    private Singelton(){}

    public static Singelton getInstance(){
        if (singelton == null){
            singelton = new Singelton();
        }
        return singelton;
    }
    int contador;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
