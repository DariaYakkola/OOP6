package Homework.service;

import Homework.model.Analyst;
import Homework.model.Manager;
import Homework.model.Worker;

import java.util.ArrayList;
import java.util.List;

public interface CreateDelService {

    List<Worker> workerList = new ArrayList<>();
    List<Analyst> analystList = new ArrayList<>();
    List<Manager> managerList = new ArrayList<>();
}