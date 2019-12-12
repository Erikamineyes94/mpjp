package s044;

public class Main {
	public static void main(String[] args) {
		System.out.println(args.length);
		for (String arg : args) {
			System.out.println(arg);//vede che args è di lunghezza zero e va avanti                                                                                                                                                                                                                                                                                                                                                                                                       
		}
		for (int i = 0; i < args.length; ++i) {
			System.out.println(args);

		}
		int i = 0;

		while (i < args.length) {
			System.out.print(args[i]);
			++i;

		}
	}
}
