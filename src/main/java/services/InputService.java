package services;



import org.springframework.beans.factory.annotation.Value;

import java.util.Scanner;

public class InputService {
    @Value("${InputService.value}")
    private String value;
    public void printFindAirports(){
        Scanner scanner = new Scanner(System.in);
        String reg = scanner.next();
        if(scanner.hasNextInt()){

        }
        FileService fs = new FileService("airports.csv");
        fs.Search();
    }
}
