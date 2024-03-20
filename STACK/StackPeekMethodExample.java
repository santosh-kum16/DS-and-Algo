import java.util.Stack;  
public class StackPeekMethodExample   
{  
public static void main(String[] args)   
{  

Stack<String> stk = new Stack<>();  

// pushing elements into Stack  
stk.push("OS");  
stk.push("DSA");  
stk.push("Java");   
System.out.println("Stack: " + stk);  

// Access element from the top of the stack  
String subject = stk.peek();  

//prints stack  
System.out.println("Element at top: " + subject);  

}  
}  
