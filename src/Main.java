public class Main{
	public static void main(String... s) {
		int i1 = 1_000;
		int i2 = 1___0;
//		int i3 = _100;
		int i4 = 0b1_111_101_000;
//		int i5 = 0b_1_111_01000;
		int i6 = 0_1750;
//		int i7 = 0_x3E8;
//		long i8 = 1_000_000_000_L;
//		float i9 = 3._1415F;
		double i10 = 3.1_415;  
		System.out.println(i1 + " " + i2 + " " + i4 + " " + i6 + " " + i10);
	}
}