package com.company;

public class Main {

    public static void main(String[] args) {
        // продемострированны все функции сортировки и выполнены все задания
        Company company = new Company(10);
        System.out.println(company);
        company.workers.sort(Worker.byNameASC);
        System.out.println();
        System.out.println(company);
        company.workers.sort(Worker.byIdDESC);
        System.out.println();
        System.out.println(company);
        company.workers.sort(Worker.bySalaryDESC);
        System.out.println("Task 1");
        System.out.println(company);
        System.out.println("Task 2 : top 5 for salary");
        for (int i = 0; i <5 ; i++) {
            System.out.println(company.workers.get(i));
        }
        System.out.println("Task 3 : last 3 for salary");
        for (int i = company.workers.size()-1; i>=company.workers.size()-3 ; i--) {
            System.out.println(company.workers.get(i));
        }
    }
}
