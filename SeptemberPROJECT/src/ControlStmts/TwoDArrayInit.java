package ControlStmts;

public class TwoDArrayInit {

	public static void main(String[] args) {
		int a[][]= {{10,20},{30,40},{10,12}};
		for(int i[]:a)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
		
		System.out.println();
		}

	}

}
