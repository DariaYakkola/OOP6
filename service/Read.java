package Homework.service;

import Homework.model.Analyst;
import Homework.model.Manager;
import Homework.model.Worker;

import java.util.List;

import static Homework.service.Create.*;

public class Read implements ReadService {

    @Override
    public List<Worker> read() {
        System.out.println("Список всех сотрудников");
        return workerList;
    }

    @Override
    public List<Analyst> readOnlyAnalyst() {
        System.out.println("Список аналитиков");
        return analystList;
    }

    @Override
    public List<Manager> readOnlyManager() {
        System.out.println("Список менеджеров");
        return managerList;
    }
}
