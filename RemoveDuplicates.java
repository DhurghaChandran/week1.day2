package week1.day2;

public class RemoveDuplicates {
	
	public static void main(String[] args)
	{
		String text = "We learn java basics as part of java sessions in java week1";	
		int count=0;
		char[] charArray=text.toCharArray();
		int len=text.length();
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
			if(charArray[i] == charArray[j]){
			count ++;
				
			}
				System.out.println(count);
			}
				
		}
	}

}
