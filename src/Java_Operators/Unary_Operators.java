package Java_Operators;

public class Unary_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaring a custom variable
		int n1 = 20;
		
		//Printing the above variable
		System.out.println("Number= "+ n1);
		
		//Performing unary operation
		n1= -n1;
		
		//Printing the above result number
		//after unary operation
		System.out.println("Result = "+ n1);
		
		//NOT Operator(!)
		boolean cond = true;
		int a=10,b=1;
		
		//Displaying values stored in above variables
		System.out.println("Cond is: " + cond);
		System.out.println("Var1 = " + a);
		System.out.println("Var2 = " + b);
		
		//Displaying values stored in above variables
		//after applying unary Not operator
		
		System.out.println("Now cond is: " + !cond);
		System.out.println("!(a<b)= "+ !(a<b));
		System.out.println("!(a>b)= "+ !(a>b));
	
		//Post-Increment Operator (++)
		int num = 5;
		num++;
		System.out.println(num);
		
		//Pre-increment Operator
		int k = 15;
		++k;
		System.out.println(k);
	
	
		//Post Decrement (-)
		int l = 14;
		l--;
		System.out.println(l);
		
		//Pre Decrement 
		int t = 12;
		--t;
		System.out.println(t);
		
	
	
	
	
	}

}
