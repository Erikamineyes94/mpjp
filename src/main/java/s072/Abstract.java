package s072;

public abstract class Abstract { //classe abstract
    public abstract void anAbstractMethod(); //metodo astratto anche xk c'è il ;

    public void aConcreteMethod() {// questo non è astratto ma è vuoto quindi non serve a nulla
    }//non si può istanziare abstract si cercherà di richiamare il metodo che però è finito e quindi non si riesce
}//implementazione di base che non fa nulla
