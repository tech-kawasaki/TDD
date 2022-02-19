package money;

import java.util.Currency;

abstract public class Money {
    protected int amount;
    protected String currency;
    Money(int amount, String currnecy) {
        this.amount = amount;
        this.currency = currnecy;
    }
    abstract Money times(int multiplier);
    String currency() {
        return currency;
    }
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
            && getClass().equals(money.getClass());
    }
    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }
    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }
}
