package s050;

public class AboutStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(20);
        StringBuilder sb3 = new StringBuilder("hello");
        
        System.out.println("capacity 1: " + sb.capacity());
        System.out.println("capacity 2: " + sb2.capacity());
        System.out.println("capacity 3: " + sb3.capacity());
        
        System.out.println("appending: " + sb3.append(' ').append("world"));
        
        System.out.println("char at position 1 in sb3 is '" + sb3.charAt(1) + "'");
        
        System.out.println("deleting: " + sb3.delete(5, 10).deleteCharAt(2));
        
        System.out.println("index of \"elo\": " + sb3.indexOf("elo"));// esiste la sottostringa elo si sulla pos 1
       
        
        System.out.println("inserting \"lo c\" at 3: " + sb3.insert(3, "lo c")); //vai alla posizione ed inserisci..
        
        System.out.println("current sb3 length: " + sb3.length()); //mi dice la lunghezza dello stringbuilder è una classe
        
        System.out.println("replace section 2-7 with \"r r\": " + sb3.replace(2, 7, "r r"));//prendimi l'intervallo con 7 escluso e sostituiscimi la stringa che ti passo anche se le lettere sono di più
        
        System.out.println("reversing: " + sb3.reverse()); //ribaltare la mia stringa corrente 
        
        sb3.setCharAt(5, 'a'); //7vai carattere pos 5 e mettici dentro una a
        System.out.println("setCharAt: " + sb3);
        
        sb3.setLength(3);
        System.out.println("setLength: " + sb3); //posso cambiare la lunghezza della mia stringa spesso per accorciarle
    }
}
