package s070;

public class Main {
    public static void main(String[] args) { //array di abbaianti array di referenze a interface
        Barker[] barkers = new Barker[2];
        
        //Barker b=new Barker(); è un interfaccia e non ho un cpstruttore,non posso creare un'interfaccia
        
        barkers[0] = new Fox();
        barkers[1] = new Dog();

        for(Barker barker: barkers) {// for each per ogni elemento dell'array barker
            System.out.println(barker.bark());
        }
        
        BarkAndWag baw = new Dog(); //mi sono creato un cane nello heap nuovo cane, il reference lo metto a sx dell'uguale lo metto dentro un interfaccia barkewag
        System.out.println(baw.tailWaggingSpeed());

        Dog dog = new Dog();
        System.out.println(dog.bark(3));
    }
}
