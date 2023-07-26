import static Homework.service.Create.workerList;

public class Search implements SearchService {

    @Override
    public List<Worker> searchSurname() {
        Scanner sc = new Scanner(System.in);
        List<Worker> filterWorker = new ArrayList<>();
        System.out.println("Введите фамилию сотрудника: ");
        String search = sc.nextLine().toLowerCase();
        for (int i = 0; i < workerList.size(); i++) {
            if (workerList.get(i).getSurname().toLowerCase().equals(search)) {
                filterWorker.add(workerList.get(i));
            }
        }
        System.out.println("Список найденных сотрудников");
        return filterWorker;
    }

    @Override
    public List<Worker> searchId() {
        Scanner sc = new Scanner(System.in);
        List<Worker> filterWorker = new ArrayList<>();
        System.out.println("Введите id сотрудника: ");
        Integer search = sc.nextInt();
        for (int i = 0; i < workerList.size(); i++) {
            if (workerList.get(i).getId() == search) {
                filterWorker.add(workerList.get(i));
            }
        }
        System.out.println("Найденный сотрудник");
        return filterWorker;
    }
}
