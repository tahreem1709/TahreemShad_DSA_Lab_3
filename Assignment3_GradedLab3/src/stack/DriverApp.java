package stack;

public class DriverApp {
	public static void main(String[] args) {
		String input = "{[()]}";
		MyStack ms = new MyStack();
		Boolean result = ms.checkBracket(input);
		if (result == true)
			System.out.println("Valid Expression");
		else
			System.out.println("Invalid Expression");
	}
}
