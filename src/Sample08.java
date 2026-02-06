public class Sample08{
	public static void main(String...s) {
		String s1 = """
					Language: %s
					Version: %d
				""".formatted("Java", 15);
		System.out.println(s1);
	}
}