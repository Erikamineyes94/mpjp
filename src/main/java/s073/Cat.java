package s073;

public class Cat extends Mammal {// la classe cat estende mammal che è astratta ma la classe cat no.
    private Tail tail;//proprietà privata di tipo tail

    public Cat(int gestationDays, int tailLen) {//cat è un costruttore che ha due variabili int che sono parametri
        super(gestationDays); //modo in cui diciamo che dobbiamo chiamare uno stato più interno super è un costruttore anche se sembra un metodo
        this.tail = new Tail(tailLen);//lunghezza della cosa
    }  

    @Override
    public String toString() {//Converte con la funzione Tostring 
        return "Cat [tail=" + tail + ", gestation=" + gestation + "]";
    }  //tail come è i
}
