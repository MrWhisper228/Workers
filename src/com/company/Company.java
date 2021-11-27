package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {

    final List<Worker> workers;

    public Company() {
        this.workers = new ArrayList<>();
    }

    public Company(int m) {
        this.workers = new ArrayList<>(m);
        this.fill(m);
    }

    /**
     * функция для добавление рабочего
     * @param worker рабочий для добавления
     */
    public void addWorker(Worker worker) {
        workers.add(worker);
        workers.get(workers.indexOf(worker)).setId(workers.size());
    }

    /**
     * функция для удаления рабочего
     * @param index индекс работника
     */
    public void removeWorker(int index) {
        workers.remove(index);
    }

    /**
     * генератор работников
     * @param m колл-во работников
     */
    public void fill(int m) {
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            this.addWorker(Math.random() > 0.5 ? new HourWorker(100 + random.nextInt(1500), Utils.getRandomName(),random.nextInt(1,21)) : new MonthlyWorker(6000 + random.nextInt(15000), Utils.getRandomName(),random.nextInt(1,21)));
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "workers=" + workers +
                '}';
    }
}
