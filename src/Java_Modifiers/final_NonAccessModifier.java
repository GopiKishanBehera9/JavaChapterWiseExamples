package Java_Modifiers;


class final_gfg{
	String s1 = "geek1";
}

class extended_gfg extends final_gfg{
	String s2 = "geek2";
}

public class final_NonAccessModifier {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * The final keyword indicates that the specific class cannot be extended or a method cannot be overridden.
		 */
		
		//creating object
		extended_gfg obj = new extended_gfg();
		
		System.out.println(obj.s1);
		System.out.println(obj.s2);
		
		
	}

}
