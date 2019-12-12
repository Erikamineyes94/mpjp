package s044;

public class Loop {

	public static void main(String[] args) {
		int[] data = { 5, 7, 1, 3, 4, };
		System.out.print("[");
		for (int i = 0; i < data.length; ++i) {
			System.out.print(data[i]+",");
		}
		System.out.println("]");

		int i = 0;
		System.out.print("[");
		while (i < data.length) {
			System.out.print(data[i]);
			i += 1;

		}
		System.out.println("]");
		
		System.out.print("[");
		for (int item : data) {
			System.out.print(item);

		}
		System.out.println("]");
	


	}
}
