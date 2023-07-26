package Homework.service;

import Homework.model.Worker;

import java.util.List;
import java.util.Scanner;

public class Delete implements CreateDelService{

    public List<Worker> delWorker() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите id сотрудника, которого хотите удалить: ");
        Integer search = sc.nextInt();
        for (int i = 0; i < workerList.size(); i++) {
            if (workerList.get(i).getId() == search) {
                workerList.remove(i);
            }
        }
        System.out.println("Список сотрудников после удаления");
        return workerList;
    }
}