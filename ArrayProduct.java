package project1;

public class ArrayProduct {

	public static void main(String[] args) 
	{
		int x[][]={{1,2,3},{4,5,6},{7,8,9}};
		int y[][]={{1,1,1},{2,1,3},{4,6,8}};
		int res[][]=new int[3][3];
		int sum=0;
		for (int i = 0; i < 3; i++) 
	    { 
	        for (int j = 0; j < 3; j++) 
	        { 
	            res[i][j] = 0; 
	            for (int k = 0; k < 3; k++) 
	                res[i][j] += x[i][k] *  
	                             y[k][j]; 
	        } 
	    } 
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(res[i][j]+" ");
			}
		System.out.println();
		}

	}

}
