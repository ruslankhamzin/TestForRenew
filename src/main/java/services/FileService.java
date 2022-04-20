package services;

import models.Airport;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FileService {
    private static final List<Airport> airports = new ArrayList<>();
    private String filename;
    private static long NeedTime;
    private static int count = 0;
    private int value;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        FileService.count = count;
    }

    public FileService(String filename, int value) {
        this.filename = filename;
        this.value = value;
    }

    public static long getNeedTime() {
        return NeedTime;
    }

    public static void setNeedTime(long needTime) {
        NeedTime = needTime;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public FileService(String filename) {
        this.filename = filename;
    }

    public static List<Airport> getAirports() {
        return airports;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void Search(String reg) {
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.filename));
            long start = System.currentTimeMillis();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values[value - 1].startsWith(reg) || values[value - 1].startsWith('"' + reg)) {
                    count++;
                    airports.add(new Airport(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9], values[10], values[11], values[12], values[13]));
                }
            }
            long finish = System.currentTimeMillis();
            setNeedTime(finish - start);
            Sort(airports);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }

    }

    public void Sort(List<Airport> airports) {
        switch (value) {
            case 1:
                airports.sort(Comparator.comparing(Airport::getId));
                break;
            case 2:
                airports.sort(Comparator.comparing(Airport::getName));
                break;
            case 3:
                airports.sort(Comparator.comparing(Airport::getCity));
                break;
            case 4:
                airports.sort(Comparator.comparing(Airport::getCountry));
                break;
            case 5:
                airports.sort(Comparator.comparing(Airport::getIATA));
                break;
            case 6:
                airports.sort(Comparator.comparing(Airport::getICAO));
                break;
            case 7:
                airports.sort(Comparator.comparing(Airport::getLatitude));
                break;
            case 8:
                airports.sort(Comparator.comparing(Airport::getLongitude));
                break;
            case 9:
                airports.sort(Comparator.comparing(Airport::getAltitude));
                break;
            case 10:
                airports.sort(Comparator.comparing(Airport::getTimeZone));
                break;
            case 11:
                airports.sort(Comparator.comparing(Airport::getDST));
                break;
            case 12:
                airports.sort(Comparator.comparing(Airport::getTz));
                break;
            case 13:
                airports.sort(Comparator.comparing(Airport::getType));
                break;
            case 14:
                airports.sort(Comparator.comparing(Airport::getSource));
                break;
        }


    }
}
