public class FibonacciSeries {  
	
	static int baseValue1=0,baseValue2=1,nextSeries=0;      
    
	static void printFibonacciSeries(int count){ 
    if(count>0){      
		nextSeries = baseValue1 + baseValue2;      
        baseValue1 = baseValue2;      
        baseValue2 = nextSeries;      
        System.out.print(" "+nextSeries);     
        printFibonacciSeries(count-1);      
        }      
    }        
  
public static void main(String[] args) {  
	int count=12;      
	//printing 0 and 1
  System.out.print(baseValue1+" "+baseValue2);  
	//n-2 because 2 numbers are already printed
  printFibonacciSeries(count-2);     
}  
} 
