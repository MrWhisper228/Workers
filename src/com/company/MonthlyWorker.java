package com.company;

public class MonthlyWorker extends Worker {
    public MonthlyWorker(int payment, String name, int days) {
        super(payment, name, days);
    }

    /**
     * функция расчета запралаты на месяц для постоянных работников
     * @return результат вычислений
     */
    @Override
    public double salaryCounter() {

        return getPayment() * getDays() / 20.8;
    }

}
