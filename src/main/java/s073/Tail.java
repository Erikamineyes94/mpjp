package s073;

public class Tail { //classe pubblica con la proprietà privata  size è come me lo ha inizializzato il costruttore
    private int size;

    public Tail(int size) {//classe Tail
        this.size = size;
    }

    public int getSize() { //se voglio stampare quanto è lunga la coda del mio gatto ma non posso cambiarlo
        return size;// posso inizializzarlo con il costruttore ma non posso modificarlo
    }//get size è un metodo

    @Override
    public String toString() {
        return "Tail [size=" + size + "]";
    }
}
