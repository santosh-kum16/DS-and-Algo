import java.util.Stack;  
public class StackSizeExample   
{    
public static void main (String[] args)   
{   
Stack stk = new Stack();  
stk.push(10);  
stk.push(20);  
stk.push(300);  
stk.push(40);  
stk.push(55);  
// Checks the Stack is empty or not  
boolean result = stk.empty();  
System.out.println("Is the stack empty or not? " +result);  
// Find the size of the Stack  
int stksize = stk.size();  
System.out.println("The stack size is: "+stksize);  
}  
}  
