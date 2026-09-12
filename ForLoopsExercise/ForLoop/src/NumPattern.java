
public class NumPattern {

	public static void main(String[] args)
	{
		int num = 1;
		
		for(int temp=1; temp<=4; temp++)
		{
			for(int j=1; j<=temp; j++)
			{
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
