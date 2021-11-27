package com.company;

import java.util.Comparator;

public abstract class Worker implements IWorker {
    // компараторы для поисков и сортировок
    public static final Comparator byNameASC = Comparator.comparing(o -> ((Worker) o).getName());
    public static Comparator byNameDESC = (o1, o2) -> ((Worker) o2).getName().compareTo(((Worker) o1).getName());
    public static Comparator byIdASC = Comparator.comparing(o -> ((Worker) o).getId());
    public static final Comparator byIdDESC = (o1, o2) -> (((Worker) o2).getId() - ((Worker) o1).getId());
    public static final Comparator bySalaryDESC = (o1, o2) -> (((IWorker) o2).salaryCounter() > ((IWorker) o1).salaryCounter()) ? 1 : 0;
    private int payment;
    private int id;
    private String name;
    private int days;

    public Worker(int payment, String name, int days) {
        this.setPayment(payment);
        this.setName(name);
        this.setDays(days);
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days > 0 && days < 21 ? days : 0;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment > 0 ? payment : -1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id > 0 ? id : -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name.strip();
        this.name = (Character.toUpperCase(name.charAt(0))) + name.substring(1);
    }

    @Override
    public String toString() {
        return '\n' + "Worker{" +
                "payment=" + payment +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", days='" + days + '\'' +
                ", salary=" + String.format("%10.2f", this.salaryCounter()) + ", " + this.getClass().getSimpleName() + "}";
    }
}
