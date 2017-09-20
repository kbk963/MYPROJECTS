package samplejava8;

public class sample {
	
	
	public static void main(String args[])
	{
		
		add m=(a,b)->a+b;
		System.out.print(m.add1(10,10));
		
	}

}

interface add{
	
	
int add1(int a, int b);
}