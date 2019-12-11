package s046;

public class MethodCaller {//è una classe che ha un metodo main
    public static void main(String[] args) {
        System.out.println(Simple.h());//metodo che chiama la funzione h di simple è statica xk la chiamo sulla classe
         //Chiamo il metodo h e gli assegno s qui c'è una chiamata dentro una chimata. La funzione è h Simple è una classe.
        //Se lavoro su più classi mi aspetto che sia su più file qui chiamo il metodo definito all'interno della classe.
       // Non c'è l'import perchè tutte e due le classi sono all'interno di questo package.non serve importarlo perchè 
      //sempre nello stesso package. Nel packege ci sono diverse classi in diversi file. La stringa Hi lo do in pasto 
     //ad un nuovo metodo.
        Simple reference = new Simple(); //abbiamo creato un oggetto che ci serve x chiamare i metodi h invece è statico
   //la JVM instanzia un oggetto di tipo simple che è nello heap,
  //  la jvm alloca nello steck spazio per una variabile di tipo reference chiamata in questo caso reference. Nell'oggetto
  //ci sono i metodi senza l'oggetto il metodo non si può fare
        
        int result = reference.f(7, 6);
        System.out.println(result);
        
        reference.g(true); // reference è una variabile di tipo è un reference a simple ad un oggetto di tipo simple.
        reference.g(false);//poi invoco il metodo, prima però controlla che sia tutto corretto.
    }
}
