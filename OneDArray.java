package project1;

public class OneDArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]={1,2,3,4};
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+2;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}

	}

}
