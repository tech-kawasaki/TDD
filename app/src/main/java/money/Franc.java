package money;

class Franc extends Money {
    Franc(int amount, String currnecy) {
        super(amount, currnecy);
    }
    Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
