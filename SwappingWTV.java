package sample;

public class SwappingWTV {
	public static void main(String[] args) {

		int a = 1;
		int b = 3;
		b = b + a;
		a = b - a;
		b = b - a;
		System.out.println(a);
		System.out.println(b);
	}
}
