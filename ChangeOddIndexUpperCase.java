package week1.day2;
public class ChangeOddIndexUpperCase {
    public static void main(String s[])
    {
        String testString = "dhurgha chandran";
        char[] charArray = testString. toCharArray();
        for (int i = 0; i < testString.length(); i++)  {
        		char ch = charArray[i];
        		if( i%2!=0 ) {
        			System.out.println(Character. toUpperCase(ch));
        			
        		}
        		else
        		{
        			System.out.println(ch);
        		}
        }
    }
}
        			
        		