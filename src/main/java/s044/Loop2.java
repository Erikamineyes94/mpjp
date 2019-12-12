package s044;

public class Loop2
{public static void main(String[] args) {
	int[] data = { 5, 7, 1, 3, 4, };
	System.out.print("[");
	for (int i = 0; i < data.length; ++i) {
		System.out.print(data[i]);
		if(i<data.length-1) {
			System.out.print(",");
		}
		}
	
	System.out.println("]");
}

}
