package services;

import java.io.*;


public class InputService {

    private int value;


    public InputService() {
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int CheckValue() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String next = null;
        try {
            next = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (next.isEmpty()) {
            setDefaultValue();
            return value;
        }
        int next1 = Integer.parseInt(next);
        if (next1 < 0 || next1 > 14) {
            System.out.println("Введено неправильное значение,установлена индексация по умолчанию");
            setDefaultValue();
        } else {
            setValue(next1);
        }
        return value;

    }

    public void setDefaultValue() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("application.yml"));
            int defaultValue = Integer.parseInt(br.readLine());
            if (defaultValue < 1 || defaultValue > 14) {
                System.out.println("Недопустимое значение в файле конфигурации");
            } else {
                this.value = defaultValue;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл конфигурации не найден");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }

    }

    public void SearchAirports() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String reg = null;
        try {
            reg = reader.readLine();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
        FileService fs = new FileService("airports.csv", value);
        fs.Search(reg);

    }
}
