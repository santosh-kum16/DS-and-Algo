public class InfinitelyCalled { 

//Recusively called
static void printHello(){  
System.out.println("hello");  
printHello(); // Calling the same method
}  
  
public static void main(String[] args) {  
printHello();  
}  
}  
