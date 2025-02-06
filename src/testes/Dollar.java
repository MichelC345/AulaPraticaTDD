package testes;


class Dollar extends Money {
	
   Dollar(int amount, String currency) {
	   //this.amount = amount;
	   //this.currency = currency;
	   super(amount, currency);
   }
   Money times(int multiplier) {
	   //return new Dollar(amount * multiplier);
	   return Money.dollar(amount * multiplier);
   }
}	