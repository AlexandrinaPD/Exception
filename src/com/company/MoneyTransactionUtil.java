package com.company;

public class MoneyTransactionUtil {

    private MoneyTransactionUtil() {

    }

    protected static void sendTo(int fromCard, int toCard, int sum) throws AccountException, MoneyValueException {
        if (fromCard == toCard) {
            throw new AccountException("Перевод с карты на ту же карту невозможен");
        }
        if (sum <= 0 || sum > 100_000) {
            throw new MoneyValueException("Сумма для перевода не соответствует параметрам");
        }
        System.out.println("Сумма s, со счета n успешно переведена на счет m");
    }
}
