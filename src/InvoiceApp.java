


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;
public class InvoiceApp {

    public static void main(String[] args) {
        
        double value=0 ;
        int count = 0;
    //    int i =0;
        double rate=0;
        double total = 0;
        double tax = 0.09;
        double grandTotal = 0;
        String taxItem = "";
        String untaxItem = "";
   
        double k=0;
        double r=0;
        
        double [] d = new double [100];
        double [] c = new double [100];
        
        Scanner sc=new Scanner(System.in);
        

        BookInvoice a = new BookInvoice();
        
        
        for (int i =0; i < 100; i++)
        {
        	
        	
        System.out.println("Do you want to enter taxed item- y/n");
      taxItem = sc.next();
      
        if (taxItem.equals("n")){
        	i++;
        break;
        }
        else if (taxItem.equals("y"))
        {
        	
        	System.out.println("Enter Amount: ");
            d[i] = sc.nextDouble();
            
            
            k=d[i];
      	
        	System.out.println("Enter tax Rate: ");
            r = sc.nextDouble();
   
        	System.out.println(a.Add(k,i,r));
     
        }
        else 
        	System.out.println("Incorrect input");
        }
        
        
        
        
        

        for (int j =0; j < 100; j++)
        {
        	
        	
        System.out.println("Do you want to enter un-taxed item- y/n");
      untaxItem = sc.next();
      
        if (untaxItem.equals("n"))
        break;
        
        else if (untaxItem.equals("y"))
        {
        	 System.out.println("Enter Amount: ");
              c[j] = sc.nextDouble();

              k=c[j];
            	
     
          	System.out.println(a.Add2(k,j));
              
        }
        else 
        	System.out.println("Incorrect input");
        }
        
   
            
            System.out.println("---------------------------------------------------");
            
            System.out.println("Receipt ");
        
       
    
        	System.out.println(a.grandTotal());
            
            
            
    }
}




