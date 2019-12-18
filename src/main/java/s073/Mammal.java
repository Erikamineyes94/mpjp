package s073;

public abstract class Mammal { //classe astratta mammifero
    protected int gestation; //proprietà  e gestation è un parametro

    public Mammal(int gestation) { //è un metodo costruttore xk ha lo stesso nome della classe
        this.gestation = gestation; //è come se fosse un reference all'oggetto corrente l'oggetto lo voglio mettere nella
    }

    @Override //già definito o almeno dichiarato nella classe madre.
    public String toString() {//metodo to string che mi ridà una nuova stringa
        return "Mammal [gestation=" + gestation + "]";//concatenazione di stringhe 
    }// se non specifichiamo la classe madre sottointendiamo object che è la prima classe della gerarchia, la madre di tutte le classi in java
}
