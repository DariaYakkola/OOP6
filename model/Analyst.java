/*
ПРИНЦИП LISKOVS SUBSTITUTION
Класс Analyst и Manager наследуются от класса Worker и являются взаимозаменяемымию
Для того, чтобы классы были взаимозаменяемыми.

ПРИНЦИП DEPENDENCY INVERSION
Используется интерфейс WorkerService, где опеределяются методы, абстрактный класс Worker, где описываются
свойства объектов, имплементирует WorkerService, наследники класса Worker (Analyst и Manager) реализуют в себе
методы интерфейса и наследуют свойства от класса Worker.
Для того, чтобы интерфейс был привязан к абстрактному классу и реализовывал его общие методы, а уже потомки
абстрактного реализовывали конкретные.
 */

package Homework.model;

public class Analyst extends Worker {

    public Analyst(String name, String surname, Integer salary, Integer id) {
        super(name, surname, salary, id);
    }

    public Analyst() {
    }

    @Override
    public String info() {
        return "Аналитик {" +
                "Имя: '" + name + '\'' +
                ", Фамилия: '" + surname + '\'' +
                ", Зарплата: " + salary +
                ", ID сотрудника: " + id +
                '}';
    }
}
