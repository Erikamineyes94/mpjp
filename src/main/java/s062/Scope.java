package s062;

public class Scope {
    private static int staticMember = 5;
    private long member = 5; //non lo vede perchè non è statico mi servirà. Proprietà dell'oggetto scope. non è statica e quindi non ci posso accedere. devo accedervi attraverso un reference.

    public void f() {
        int local = 7;
        if (staticMember == 2) {
            short inner = 12;
            staticMember = 1 + inner;
            member = 3 + local;
        }
    }

    public void g() {
        System.out.println(member);
    }
    
    public static void main(String[] args) {
        double local = 5;
        System.out.println(local);
        staticMember = 12;
      Scope scope= new Scope(); //mi creo l'oggetto scope per così posso accedere.
      System.out.println(scope.member);// ho passato a println la proprietà member dell'oggetto scope
     //  scope.f(); chiamo il metodo f di tipo scope
    }
}
