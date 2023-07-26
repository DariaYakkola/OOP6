package Homework.service;

import Homework.model.Analyst;
import Homework.model.Manager;
import Homework.model.Worker;

import java.util.List;

public interface ReadService {

    List<Worker> read();

    List<Analyst> readOnlyAnalyst();

    List<Manager> readOnlyManager();
}