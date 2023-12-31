/*
ПРИНЦИП SINGLE RESPONSIBILITY
Разбила изначальный класс service на несколько классов отвечающих отдельно за методы создания,
поиска и чтения.
Для того, чтобы у каждого класса было свое назначение.

ПРИНЦИП OPEN CLOSED
Наследуются 2 класса (Create и Delete) от одного интерфейса CreateDelService, имплементируют только листы
и уже внутри своих классов реализуя методы.
Для того, чтобы закрыть класс CreateDelService от изменений и при этом оставить возможность расширять методы
засчет имплементирования интерфейса.

ПРИНЦИП INTERFACE SEGREGATION
Каждый класс, который имплементируют инткрфейс реализует его методы.
Для того, чтобы не было не используемых методов.
*/
package Homework.service;

import Homework.model.Analyst;
import Homework.model.Manager;
import Homework.model.Worker;

public class Create implements CreateDelService {

    public void createAnalyst(String name, String surname, Integer salary) {
        Integer id = getFreeId();
        Analyst analyst = new Analyst(name, surname, salary, id);
        workerList.add(analyst);
        analystList.add(analyst);
    }

    public void createManager(String name, String surname, Integer salary) {
        Integer id = getFreeId();
        Manager manager = new Manager(name, surname, salary, id);
        workerList.add(manager);
        managerList.add(manager);
    }

    public int getFreeId() {
        Integer lastId = 0;
        for (Worker worker : workerList) {
            lastId++;
        }
        return ++lastId;
    }
}
