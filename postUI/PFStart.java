package postUI;

import java.util.Scanner;

import postPD.LinkedStack;

public class PFStart {

	public static void main(String[] args) {
		LinkedStack<String> stack = new LinkedStack<String>();
		String input[];
		Scanner console = new Scanner(System.in);
		int firOp, secOp, result;
		
		input = console.nextLine().split("\\s");
		
		for (int i = 0; i < input.length; i++)
		{
			if(input[i].contentEquals("*"))
			{
				secOp = Integer.parseInt(stack.pop());
				firOp = Integer.parseInt(stack.pop());
				
				result = firOp * secOp;
				
				stack.push(Integer.toString(result));
			}
			else if (input[i].contentEquals("/"))
			{
				secOp = Integer.parseInt(stack.pop());
				firOp = Integer.parseInt(stack.pop());
				
				result = firOp / secOp;
				
				stack.push(Integer.toString(result));
			}
			else if (input[i].contentEquals("+"))
			{
				secOp = Integer.parseInt(stack.pop());
				firOp = Integer.parseInt(stack.pop());
				
				result = firOp + secOp;
				
				stack.push(Integer.toString(result));
			}
			else if (input[i].contentEquals("-"))
			{
				secOp = Integer.parseInt(stack.pop());
				firOp = Integer.parseInt(stack.pop());
				
				result = firOp - secOp;
				
				stack.push(Integer.toString(result));
			}
			else
				stack.push(input[i]);
		}
		
		System.out.println("Result is :" + stack.peek());
		
		console.close();
	}
}