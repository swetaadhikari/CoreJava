package test;

public class reverseexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// TODO Auto-generated method stub
			
			String str = "Clean World Green World";
			
			String result = "";
			
			for(int index = str.length() -1 ; index>=0;index--) {
				
				char ch = str.charAt(index);
				result = result + ch;
				
			}
			
			System.out.println("The result string is " + result);
			
			
			int num=45678;
			int res=0;
			while(num>0) {
				
				int rem=num%10;
				
				res=res*10+ rem;
				
				num=num/10;
			}
			System.out.println(res);
			
		}
	
	
	
	


	
}
