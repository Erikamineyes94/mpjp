package s046;

public class Simple {
    static String h() {//h è un metodo e contiene degli statement h è un blocco di codice.
        return "Hi"; //la stringa Hi viene tornata al chiamante. Qui vediamo la classe
    }

    int f(int a, int b) {
        return a * b;
    }
//riga 12 true lo metto nel parametro flag e mi viene inizializzato con true.facciamo 13-14 si prosegue alla 18 xk non c'è il return
    void g(boolean flag) { //abbiamo un metodo che è void c'è un if e abbiamo due branches nel codice 
        if (flag) { //se flag (parametro)passandomi un booleano in flag abbiamo o true o false
            System.out.println("Hello"); //se flag è vero stampa qlc poi passa alla riga 15 e termina l'esecuzione del
            return;    //metodo g, se è false passa alla riga 18
        }

        System.out.println("Goodbye"); //inplicito il void
    }
}