package com.company;

public class HourWorker extends Worker {
    public HourWorker(int payment, String name, int days) {
        super(payment, name, days);
    }

    /**
     * функция для расчета зарплаты для почасовых
     * @return результат вычисления
     */
    @Override
    public double salaryCounter() {
        return 8 * getPayment() * getDays() / 20.8;
    }

}