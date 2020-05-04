import java.util.Scanner;
import java.util.Stack;



public class CheckBalancedParanthesis
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many strings : ");
		int t = sc.nextInt();
		sc.nextLine();
		while(t != 0)
		{
			Stack<Character> stack = new Stack<>();
			String s = new String();
			boolean isBalnced = true;
			s = sc.nextLine();
			for(int i =0 ;i< s.length();i++)
			{
				Character ch = s.charAt(i);
				if(ch == '(' || ch == '{' || ch=='[')
				{
					stack.push(ch);
					continue;
					
				}
				if(stack.isEmpty())
				{
					isBalnced = false;
					break;
				}
				if(ch == ')')
				{
					if(stack.peek() == '(')
					{
						stack.pop();
						
					}
					else
					{
						isBalnced = false;
						break;
					}
				}
				if(ch == '}')
				{
					if(stack.peek() == '{')
					{
						stack.pop();
						
					}
					else
					{
						isBalnced = false;
						break;
					}
				}
				if(ch == ']')
				{
					if(stack.peek() == '[')
					{
						stack.pop();
						
					}
					else
					{
						isBalnced = false;
						break;
					}
				}
				
			}
			
			if(!stack.isEmpty())
			{
				isBalnced = false;
			}
			if(isBalnced)
			{
				System.out.println("balanced");
		
			}
			else
			{
				
				System.out.println("not balanced");
			}
			
			t--;
		}
		
		
	}
	
	
}