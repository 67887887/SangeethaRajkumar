package assignment.week3.day1;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String test = "changeme";
		StringBuilder temp = new StringBuilder();
		
		char[] ch = test.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if(i%2==0)
			{

				temp = temp.append(ch[i]);
			}
			else {
			ch[i]=Character.toUpperCase(ch[i]);

			temp = temp.append(ch[i]);
			}
		}
		System.out.println(temp);

	}

}
