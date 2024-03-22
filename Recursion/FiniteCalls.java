public class FiniteCalls {  
static int count=0;  
static void printHello(){  
count++;  
if(count<=5){  
System.out.println("hello "+count);  
printHello();  //Calling it self
}  
}  
public static void main(String[] args) {  
printHello();  
}  
}  
