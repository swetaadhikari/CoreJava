package test;

public class exceptionexample {

	public static void main(String[] args) {
		
		
		int[] arr= {10,20};
		int num=0;
		
		try {
		
		// TODO Auto-generated method stub
			int res=num/0;
		
			System.out.println(arr[5]);

	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("inside arrayout of bond");
		}

		
		catch(ArithmeticException e) {
			System.out.println("inside arithmetic");
		}
		
		finally {
			System.out.println("finally ");
		}
		System.out.println("after");
	}
	
}
