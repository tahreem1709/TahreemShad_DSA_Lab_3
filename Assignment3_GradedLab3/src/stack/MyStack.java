package stack;

import java.util.Stack;

public class MyStack {

	Stack<Character> stack = new Stack<>();

	public Boolean checkBracket(String input) { // length-size of an array
		char z, p;
		for (int i = 0; i < input.length(); i++) // length()-size of a string
		{
			z = input.charAt(i);
			if (z == '{' || z == '[' || z == '(') {
				stack.push(z);
				continue;
			}

			if (stack.isEmpty())
				return false;

			switch (z) {
			case '}':
				p = stack.pop();
				if (p == '[' || p == '(')
					return false;
				break;

			case ']':
				p = stack.pop();
				if (p == '{' || p == '(')
					return false;
				break;

			case ')':
				p = stack.pop();
				if (p == '[' || p == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());

	}
}
