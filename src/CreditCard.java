public class CreditCard {
    public Person owner;
    private Money balance;
    private Money creditLimit;

    public CreditCard(Person owner_, Money creditLimit_) {
        owner = owner_;
        balance = new Money(0);
        creditLimit = new Money(creditLimit_) ;
    }

    public Money getBalance() {
        return new Money(balance) ;
    }

    public Money getCreditLimit() {
        return new Money(creditLimit) ;
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amountM) {
        int compareRes = new Money(balance).add(amountM).compareTo(creditLimit);
        if (compareRes > 0 ) {
            System.out.println("UNABLE TO ADD - EXCEEDS CREDIT LIMIT");
            return;
        }
        balance = balance.add(amountM);
    }

    public void payment(Money amountM) {
       balance = balance.subtract(amountM);
    }

}
