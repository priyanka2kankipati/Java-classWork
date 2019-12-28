package project1;

public class TwoDArray {

	public static void main(String[] args) 
	{
		int x[][] = new int[3][3];
		int y[][]={{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x.length; j++) 
			{
				x[i][j] = i + j;
			}
		}
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x.length; j++) 
			{
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
			
		}
		System.out.println();
		for (int i = 0; i < y.length; i++)
		{
			for (int j = 0; j < y.length; j++) 
			{
				System.out.print(y[i][j] + " ");
			}
			System.out.println();
		}


	}

}
