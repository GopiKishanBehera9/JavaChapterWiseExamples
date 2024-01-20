package Java_Methods;

public class Method_Overloading1 {
	// this method accepts int
    private static void display(int a){
        System.out.println("Got Integer data.");
    }

    // this method  accepts String object
    private static void display(String a){
        System.out.println("Got String object.");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		display(1);
        display("Hello");
	}

}
