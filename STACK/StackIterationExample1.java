import java.util.*;  
public class StackIterationExample1
{  
public static void main (String[] args)   
{   

//Creating an instance of Stack class  
Stack <Integer> stk = new Stack<>();  

//pushing elements into stack  
stk.push(119);  
stk.push(203);  
stk.push(988);  

System.out.println("Iteration over the stack using by the forEach() : ");  
//invoking forEach() method for iteration over the stack  
stk.forEach(n ->  
{  
System.out.println(n);  
});  
}  
}  
