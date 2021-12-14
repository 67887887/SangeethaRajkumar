package assignment.week3.day1;

public class IgnoreCaseInString {

	public static void main(String[] args) {
		String s1 = "I am Learning Java";
		String s2 = "I am learning java";
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");
		System.out.println(s1.equals(s2));
		System.out.println(str3.equals(str4));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(str3.equalsIgnoreCase(str4));
		System.out.println(s1 == s2);
		System.out.println(str3 == str4);
	}

}
