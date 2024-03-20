import java.util.Iterator;  
import java.util.Stack;  
public class StackIterationExample
{     
public static void main (String[] args)   
{   
//creating an object of Stack class  
Stack stk = new Stack();  
//pushing elements into stack  
stk.push("Car");  
stk.push("Bus");  
stk.push("Truck");  
 
//iteration over the stack  
Iterator iterator = stk.iterator();  

while(iterator.hasNext())  
{  
Object values = iterator.next();  
System.out.println(values);   
}     
}  
}  
