import models.Airport;
import services.FileService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
       FileService fs = new FileService("airports.csv");
       fs.Search();
    }
}
