import java.util.Stack;  
public class StackEmptyMethodExample  
{  
public static void main(String[] args)   
{  

//Creating an Object of Stack Class
Stack<Integer> stk= new Stack<>();  

// Checking Stack is empty or not  
boolean result = stk.empty();  

System.out.println("Checking Is the stack empty? " + result);  

// pushing elements into stack  
stk.push(10);  
stk.push(11);  
stk.push(22);  
stk.push(122);
stk.push(999);

//prints elements of the stack  
System.out.println("Elements in Stack: " + stk);  
result = stk.empty();  
System.out.println("Checking Is the stack empty? " + result);  
}  
}  
