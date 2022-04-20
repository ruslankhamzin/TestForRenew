package services;


public class OutputService {
    public static void RequestParam() {
        System.out.println("Введите столбец для индексации(если хотите взять по умолчанию,то пропустите): ");
    }

    public static void RequestString() {
        System.out.println("Введите строку: ");
    }

    public static void PrintAirports() {
        for (int i = 0; i < FileService.getAirports().size(); i++) {
            System.out.println(FileService.getAirports().get(i).toString());
        }
    }

    public static void PrintFinds() {
        System.out.println("Количество найденных строк: " + FileService.getCount());
    }

    public static void PrintTime() {
        System.out.println("Время, затраченное на поиск: " + FileService.getNeedTime() + ",мс");
    }
}
