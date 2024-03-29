package Java_Methods;

class Method_Overloading_RealWorld {

	private String formatNumber(int value) {
        return String.format("%d", value);
    }

    private String formatNumber(double value) {
        return String.format("%.3f", value);
    }

    private String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_Overloading_RealWorld hs = new Method_Overloading_RealWorld();
        System.out.println(hs.formatNumber(500));
        System.out.println(hs.formatNumber(89.9934));
        System.out.println(hs.formatNumber("550"));
	}

}
