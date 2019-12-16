package s049;

public class AboutString {
    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        System.out.println("char at position 1 in s: " + s.charAt(1)); //stiamo chiamando il metodo charAt sulla stringa 7 mi stamperà il carattere nella posizione 1 cioè "e"

        System.out.println("s < t: " + s.compareTo(t));
        System.out.println("t > s: " + t.compareTo(s));// -1 se t viene prima +1 se s viene prima

        System.out.println("concat s and t: " + s.concat(t)); // è una concatenazione 

        System.out.println("t contains u? " + t.contains(u)); //la stringa contiene u che è or

        String u2 = t.substring(1, 3); //mi genera una nuova stringa, una sottostringa  che parte da uno e finisce tre il 3 escluso
        System.out.println("u2 = t.substring(1, 3): " + u2); //la salvo stampa 2
        System.out.println("t.substring(3): " + t.substring(3));//da quel punto stampa fino alla fine naturale della stringa

        System.out.println("u equals u2? " + u.equals(u2)); //confronto tra due stringhe confrontare davvero il contenuto. Usato solitamente per i reference
        System.out.println("u == u2? " + (u == u2)); //stesso oggetto ma come reference sono diverse 
// doppio uguale spesso usato per i primitivi
        System.out.println("First index of 'l' is s: " + s.indexOf('l')); //indice della prima l
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));// se non c'è mi ritorna -1 perchè è un indice non valido
        System.out.println("there is no 'x' in s: " + s.indexOf('x')); 
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll")); //bella stringa s c'è ll e inizia alla riga 2.Doppio apice con / davanti
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));//ritorna -1

        System.out.println("check if an empty string is empty: " + "".isEmpty()); //vede se c'è la stringa vuota.

        System.out.println("s length: " + s.length()); //metodo che negli array è una proprietà, nelle stringhe è un metodo.

        String s2 = s.replace('l', 'q'); //mi permette di sostituire tutti i caratteri con il carattere indicato
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

        String[] splits = "one for me, one for you".split(" ");//metodo split lavora su una stringa e me la trasforma in un array di stringhe
        System.out.println("Splitting: ");//usando quello che gli passo come carattere  il delimitatore del pezzo. Separatore
        for (String token : splits) { //for each per stamparmi tutti i pezzettini.
            System.out.println(token);
        } 
        String joined = String.join(" ", splits); //è un metodo statico è fa il lavoro opposto a split a sx del punto c'è il nome della classe e non un oggetto.
        System.out.println("Joining back [" + joined + "]");//cosa devo usare come congiuntore e cosa devo mettere dentro. Non servono le parentesi quadre se non ce le vuoi mettere

        System.out.println("upper: " + s.toUpperCase()); //me la mette in maiuscolo è una copia
        System.out.println("lower: " + "SHUT UP!".toLowerCase()); // per farla minuscola

        System.out.println("trim [" + " la la la ".trim() + "]"); //tronca elimina gli spazi bianchi all'inizio e alla fine della mia stringa
        
        String x = null;
        System.out.println("Sort of safe toString(): " + String.valueOf(x));  //value of mi converte questa x nella sua rappresentazione. Mi crea una stringa a partire da unoggetto di tipo reference che mi passa.
       //mi funziona anche con il null, di solito si fanno disastri 
    }
}
