package week1.day2;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Madame";
		String str1= "";
		for (int i=str.length()-1;i>=0;--i)
		{
			str1 += str.charAt(i);	
		}
		System.out.println(str1);	
		if(str.toLowerCase().equals(str1.toLowerCase()))
		{
			System.out.println("The string is palindrome");
		}
		else
		{
			System.out.println("The given string is not palindrome");
		}
		
	}
	

}
