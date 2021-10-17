import java.util.Scanner;
     
public class GcdOfNumber
    {  
    public static void main(String[] args)   
    {  
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number :");
    int x =sc.nextInt();
    System.out.println("Enter second number :");
    int y =sc.nextInt();
    
    int gcd = 1;  
    
    for(int i = 1; i <= x && i <= y; i++)  
    {  

    if(x%i==0 && y%i==0)  
    
    gcd = i;  
    }  
      
    System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
    }  
} 