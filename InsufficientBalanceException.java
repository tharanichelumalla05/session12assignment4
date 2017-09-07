package atmexception;//created package atmexception
//by extending the class,we can make the class as Exception
public class InsufficientBalanceException  extends Exception{ //as im extending the class INsufficientBalanceException class
	
String message ;                        //in this creating constructors 
public InsufficientBalanceException(){
	System.out.println("Exception Constructor called"); //which shows a message 
	//system is used to return code
    //out is a static number
    
	               
}
 public InsufficientBalanceException(String message){
	 this.message=message;
	 System.out.println("Exception thrown with message" +getMessage());//system is used to return code
     //out is a static number
     //println is used to print text and gives output
    printStackTrace();
}
}
