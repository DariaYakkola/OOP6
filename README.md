Урок 6. ООП Дизайн и Solid\
\
1.**ПРИНЦИП SINGLE RESPONSIBILITY**\
Разбила изначальный класс service на несколько классов отвечающих отдельно за методы создания,
поиска и чтения.\
Для того, чтобы у каждого класса было свое назначение.
***
2.**ПРИНЦИП OPEN CLOSED**\
Наследуются 2 класса (Create и Delete) от одного интерфейса CreateDelService, имплементируют только листы
и уже внутри своих классов реализуя методы.\
Для того, чтобы закрыть класс CreateDelService от изменений и при этом оставить возможность расширять методы засчет 
имплементирования интерфейса.
***
3.**ПРИНЦИП LISKOVS SUBSTITUTION**\
Класс Analyst и Manager наследуются от класса Worker.\
Для того, чтобы классы были взаимозаменяемыми.
***
4.**ПРИНЦИП INTERFACE SEGREGATION**\
Каждый класс, который имплементируют инткрфейс реализует его методы.\
Для того, чтобы не было не используемых методов.
***
5.**ПРИНЦИП DEPENDENCY INVERSION**\
Используется интерфейс WorkerService, где опеределяются методы, абстрактный класс Worker, где описываются
свойства объектов, имплементирует WorkerService, наследники класса Worker (Analyst и Manager) реализуют в себе
методы интерфейса и наследуют свойства от класса Worker.\
Для того, чтобы интерфейс был привязан к абстрактному классу и реализовывал его общие методы, а уже потомки абстрактного 
реализовывали конкретные.
