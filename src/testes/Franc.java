package testes;

class Franc extends Money {   
	//private int amount;					
   	Franc(int amount, String currency) {      
      //this.amount = amount;
      //this.currency = currency;
   		super(amount, currency);
    }					
    Money times(int multiplier)  {      
       //return new Franc(amount * multiplier);			
    	return Money.franc(amount * multiplier);
    }   				
}
