package com.company;

public class UserBank {
    public static void main(String[] args) {

        try {
            MoneyTransactionUtil.sendTo(1111111111, 222222222, 5552458);
        } catch (AccountException e) {
            System.out.println("Ошибка с реквизитами банка. Возможно, номер карты отправителя и получателя совпадают.");
        } catch (MoneyValueException e) {
            System.out.println("Ошибка с суммой отправки. Сумма должна быть больше 0. Сумма не должна" +
                    " превышать лимит в 100_000");
        }

    }
}
