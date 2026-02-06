class Sample07{
	public static void main(String... s) {
		String s1 = "Java Language";
		String s2 = s1.replace("Language", "VM");
		System.out.println("s1\s:\s" + s1);
		System.out.println("s2\s:\s" + s2 );
		System.out.println("s1.substring\s:\s" + s1.substring(0, 1));
		System.out.println("s1.indexOf(\"a\")\s:\s" + s1.indexOf("a"));
		System.out.println("s1.length()\s:\s" + s1.length());
	}
}