package Homework.controller;

import Homework.model.Analyst;
import Homework.model.Manager;
import Homework.model.Worker;
import Homework.service.Create;
import Homework.service.Delete;
import Homework.service.Read;
import Homework.service.Search;
import Homework.view.View;

import java.util.List;

public class Controller {
    private final Create create = new Create();
    private final View view = new View();
    private final Read read = new Read();
    private final Search search = new Search();

    private final Delete delete = new Delete();

    /**
     * @param name    имя
     * @param surname фамилия
     * @param salary  зарплата
     * @apiNote создает аналитика, используется метод из Create
     */
    public void createAnalyst(String name, String surname, Integer salary) {
        create.createAnalyst(name, surname, salary);
    }

    /**
     * @param name    имя
     * @param surname фамилия
     * @param salary  зарплата
     * @apiNote создает менеджера, используется метод из Create
     */
    public void createManager(String name, String surname, Integer salary) {
        create.createManager(name, surname, salary);
    }

    /**
     * @apiNote показывает список всех сотрудников, используется метод из Read,
     * для отображения метод из view
     */
    public void read() {
        List<Worker> workerList = read.read();
        for (Worker worker : workerList) {
            view.printWorker(worker);
        }
    }

    /**
     * @apiNote показывает список аналитиков, используется метод из Read,
     * для отображения метод из view
     */
    public void readOnlyAnalyst() {
        List<Analyst> analystList = read.readOnlyAnalyst();
        for (Analyst analyst : analystList) {
            view.printAnalyst(analyst);
        }
    }

    /**
     * @apiNote показывает список менеджеров, используется метод из Read,
     * для отображения метод из view
     */
    public void readOnlyManager() {
        List<Manager> managerList = read.readOnlyManager();
        for (Manager manager : managerList) {
            view.printManager(manager);
        }
    }

    /**
     * @apiNote осуществляет поиск сотрудника по фамилии, используется метод из search,
     * для отображения метод из view
     */
    public void searchSurname() {
        List<Worker> filterWorker = search.searchSurname();
        for (Worker worker : filterWorker) {
            view.printWorker(worker);
        }
    }

    /**
     * @apiNote осуществляет поиск сотрудника по id, используется метод из search,
     * для отображения метод из view
     */
    public void searchId() {
        List<Worker> filterWorker = search.searchId();
        for (Worker worker : filterWorker) {
            view.printWorker(worker);
        }
    }

    /**
     * @apiNote осуществляет поиск сотрудника по id и его удаление, используется метод из Create,
     * для отображения метод из view
     */
    public void delWorker() {
        List<Worker> workerList = delete.delWorker();
        for (Worker worker : workerList) {
            view.printWorker(worker);
        }
    }
}