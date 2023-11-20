
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
     public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();

        if (newCents > 99) {
            newEuros = newEuros + newCents / 100;
            newCents = newCents % 100;
        }

        return new Money(newEuros, newCents);
    }
     
     public boolean lessThan(Money compared) {
         Money money = new Money(this.euros, this.cents); 
         if(money.euros < compared.euros) {
             return true;
         } else if((money.euros == compared.euros) && (money.cents < compared.cents)) {
             return true;
         }
         return false;
     }
     
     public Money minus(Money decreaser){
         int totalCents = this.euros * 100 + this.cents;
         int decreaserTotalCents = decreaser.euros * 100 + decreaser.cents;
         
         int differenceInCents = totalCents - decreaserTotalCents;
         
         if(differenceInCents < 0) {
             return new Money(0, 0);
         } else {
             int newEuros = differenceInCents / 100;
             int newCents = differenceInCents % 100;
             return new Money(newEuros, newCents);
         }
     }

}
