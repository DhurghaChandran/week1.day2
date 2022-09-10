package week1.day2;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,3,4,5};
int[] b= {2,3,4,5,6};
for (int i=0;i<a.length;i++)
{
	for (int j=0;j<b.length;j++) {
		if(a[i]== b[j])
		{
			System.out.println("The intersection values are" +b[j]);
			
		}
	}
}
	}

}
