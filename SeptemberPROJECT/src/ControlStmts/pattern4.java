package ControlStmts;

public class pattern4 {

	public static void main(String[] args) {
		int t=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(t+" ");
				t++;
			}
			System.out.println();
		}
	}

}
