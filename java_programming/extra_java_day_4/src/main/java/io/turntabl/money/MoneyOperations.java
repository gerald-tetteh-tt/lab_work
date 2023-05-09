package io.turntabl.money;

public class MoneyOperations {

    public static Money add(Money money, Money otherMoney) throws MoneyNotValidException {
        if(!isValid(money) || !isValid(otherMoney)) {
            throw new MoneyNotValidException("Money not valid");
        }
        double result = money.getQuantity() + otherMoney.getQuantity();
        Money addedMoney = new Money(result, money.getCurrency());
        return addedMoney;
    }

    public static Money multiply(Money money, int multiplier) {
        if(!isValid(money)) {
            // throw error
        }
        double multiplied = money.getQuantity() * multiplier;
        Money multipliedMoney = new Money(multiplied, money.getCurrency());
        return multipliedMoney;
    }

    public static Money subtract(Money money, Money otherMoney) {
        if(!isValid(money) && !isValid(otherMoney)) {
            // throw error
        }
        double subtracted = money.getQuantity() - otherMoney.getQuantity();
        Money subtractedMoney = new Money(subtracted, money.getCurrency());
        return subtractedMoney;
    }

    private static boolean isValid(Money money) {
        return money.getQuantity() >= 0;
    }

}
