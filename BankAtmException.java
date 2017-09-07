package atmexception;//created package atmexception

public class BankAtmException {     //creating a class BankAtmException
	                               //classes are the basics of opps(object oriented program)
	public static void main(String[]args){ 
		// TODO Auto-generated method stub
				//Here public is a access modifier which defines who can access this method
				//Here static a keyword which identifies class related thing
				//void is used to define return type of the method,void means method wont return any value
				//main is name of method,and to display
				//declares method String[]
				//String[]args means arguments will be passed into main method and says that main() as a parameter

				
		 BankAtm rama = new BankAtm (30000,1,"rama","hyd",10000);   //creating objects which shows the details
		 BankAtm veena = new BankAtm (12000,2,"veena","hyd",20000);
		 BankAtm kranthi = new BankAtm (2000,3,"kranthi","hyd",1000);
		  
		 rama.deposit(1000);//her I'm depositing the amount
		 try
		 {
			 rama.withdraw(1300);          //here the withdrawal throws an Exception with try catch showing the withdrawn amount 
			 veena.withdraw(4000);
			 kranthi.withdraw(700);
		 }
		 catch (InsufficientBalanceException e){     //here it catch the exception which occurs in the output and shows insufficient balance
			 System.out.println("insufficient balance:");//system is used to return code
			                                            //out is a static number
			                                            //println is used to print text and gives output
		 }
	}

}