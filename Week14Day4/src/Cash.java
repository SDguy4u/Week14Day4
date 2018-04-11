import java.util.Scanner;
public class Cash {
	
	    public static void main(String args[])
	    {
	        int amt, r100=0, r50=0, r20=0, r10=0, r5=0, r2=0 , r1=0 ,count=0; 
	        Scanner sc = new Scanner(System.in);
	 
	        System.out.print("Enter The Amount in rupees : \n\n");
	        amt = sc.nextInt();
	 
	while(amt >= 100) 
	{ 
	  r100 = amt / 100 ; 
	  amt = amt % 100;
	  System.out.print("\nTotal Number Of 100 rupees : "+ r100) ;
	  break ; 
	} 
	while(amt >= 50) 
	{ 
	  r50 = amt / 50 ;
	  amt = amt % 50; 
	  System.out.print("\nTotal Number Of 50 rupees : "+ r50) ; 
	break ; 
	}  
	while(amt >= 20) 
	{ 
	  r20 = amt / 20 ; 
	  amt = amt % 20;
	  System.out.print("\nTotal Number Of 20 rupees : "+ r20) ; 
	  break ; 
	}  
	while(amt >= 10) 
	{ 
	  r10 = amt / 10 ; 
	  amt = amt % 10;
	  System.out.print("\nTotal Number Of 10 rupees Or Coin : "+ r10) ; 
	  break ; 
	} 
	while(amt >= 5) 
	{ 
	  r5 = amt / 5 ; 
	  amt = amt % 5;
	  System.out.print("\nTotal Number Of 5 rupees Or Coin : "+ r5) ; 
	  break ; 
	} 
	while(amt >= 2) 
	{ 
	  r2 = amt / 2 ; 
	  amt = amt % 2;
	  System.out.print("\nTotal Number Of 2 rupees Or Coin : "+ r2) ; 
	  break ; 
	} 
	while(amt >= 1) 
	{ 
	  r1 = amt / 1 ; 
	  amt = amt % 1;
	  System.out.print("\nTotal Number Of 1 rupees Or Coin : "+ r1) ; 
	  break ; 
	}
	count = r100 + r50 + r20 + r10 + r5 + r2 + r1;   
	System.out.print("\n\nTotal Number Of rupees Require : \n\n"+ count) ; 
	    }
	}
