package Java_Operators;

public class Assignment_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java assignment operator is one of the most common operators.
		//It is used to assign the value on its right to the operand on its left.
	
		int a = 10;
		int b = 20;
		
		a+=4; //a=a+4 (a=10+4)
		b-=4; //b=b-4 (b=20-4)
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("--------------------------------------------");
		
		int x=10;
		x+=3; //10+3
		System.out.println(x);
		x-=4; //13-4
		System.out.println(x);
		x*=2;//9*2  
		System.out.println(x);  
		x/=2;//18/2  
		System.out.println(x);
	
		System.out.println("--------------------------------------------");
		//Adding Short
			short k=10;  
			short j=10;  
			k=(short)(k+j);//20 which is int now converted to short  
			System.out.println(k); 
	
	}

}
