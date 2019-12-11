package s047;

import java.util.Objects;

public class ParameterPassing {
	static void primitive(int parameter) {// inserisco in parameter "primitivevalue della riga 56" e mi inserisce 12. Il
											// METODO ha un parametro di tipo int
		parameter += 1;// incrementa parameter=13
		System.out.println("parameter is " + parameter); // stampa
	}// finisce il blocco c'è un return senza nulla si torna nel main

	static int square(int value) {
		value *= value; // qui sot modificando il valore ma non in input.
		System.out.println("Value is" + value);
		return value;

	}

	static int triple(int value) { // è sempre un metodo
		value *= 3;
		System.out.println("Value is " + value);
		return value; // se non metto return non va bene

	}

	static void immutableReference(String parameter) {
		if (parameter == null) { // se non è salta a riga 18 //quando ho fatto il cotrollo che data non è null allora vedo la lunghezza
			
			System.out.println("Nothing to do here");
			return;
		}

		// alternatively: if parameter is null throws a NullPointerException
		Objects.requireNonNull(parameter, "Parameter should not be null");

		System.out.println("parameter id was " + System.identityHashCode(parameter));
		parameter += " there";
		System.out.println("Now parameter id is " + System.identityHashCode(parameter));
		System.out.println("parameter value is " + parameter);
	}

	static void reference(StringBuilder parameter) {//inizio metodo
		if (parameter == null) {
			System.out.println("Nothing to do here");
			return;
		}

		// alternatively: if parameter is null throws a NullPointerException
		Objects.requireNonNull(parameter, "Parameter should not be null");
		
    
	  parameter.append(" there"); //serve per aggiungere alla stringa append è un metodo di string builder
	  //per aggiungere roba
		System.out.println("parameter value is " + parameter);
	}//fine metodo

	static void reference(int[] data) {
		if (data == null || data.length == 0) {
			System.out.println("Nothing to do here");
			return;
		}

		// alternatively: if parameter is null throws a NullPointerException
		Objects.requireNonNull(data, "Parameter should not be null");

		data[0] += 1;
		System.out.println("data[0] is " + data[0]);
	}

	public static void main(String[] args) {  //MAIN
		int primitiveValue = 12; // metodo definisco la variabile primitivevalue e la inizializzo a 12

		System.out.println("primitiveValue has been initialized to " + primitiveValue);
		primitive(primitiveValue); // è un METODO che la JVM metodo fa un'invocazione a quel metodo va ad eseguire
									// il blocco relativo a primitive nella riga 6

		int result = square(primitiveValue); // per fare il quadrato lo abbiamo aggiunto noi
		System.out.println("primitiveValue squared is" + result);

		result = triple(primitiveValue); //nuovo
		System.out.println("primitiveValue squared is" + result);

		String string = "Hi";

		System.out.println("string has been initialized to " + string);
		immutableReference(string);
		System.out.println("string is still " + string);

		StringBuilder referenceValue = new StringBuilder("Hi");//lavoriamo con lo stringbuilder abbiamo i due reference che chiamano lo stesso oggett
//ho cambiarto il reference 
		
		System.out.println("referenceValue has been initialized to " + referenceValue);
		reference(referenceValue);
		System.out.println("referenceValue now is " + referenceValue);

		int []array= { 42 };//array è un array di interi e lo inizializzo mettendoci dentro 42

		System.out.println("array[0] is " + array[0]);
		reference(array);//chiamo reference di array
		System.out.println("array[0] now is " + array[0]);
	}
}
