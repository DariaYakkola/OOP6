package Homework.view;

import Homework.model.Analyst;
import Homework.model.Manager;
import Homework.model.Worker;

public class View {
    public void printWorker(Worker worker) {
        System.out.println(worker.info());
    }

    public void printAnalyst(Analyst analyst) {
        System.out.println(analyst.info());
    }

    public void printManager(Manager manager) {
        System.out.println(manager.info());
    }
}