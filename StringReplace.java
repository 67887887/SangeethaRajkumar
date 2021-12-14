package assignment.week3.day1;

public class StringReplace {
	public static void main(String[] args) {

		String originalSentence = "I am working with Java8";
		originalSentence = originalSentence.replace("8", "11");
		System.out.println(originalSentence);
		System.out.println("Replaceing 8 with 11 :" + originalSentence);
		originalSentence = originalSentence.concat("#");
		System.out.println("Concat with # :"+originalSentence);
		System.out.println(originalSentence.substring(5, 14));
		
	
       
       
	}

}
