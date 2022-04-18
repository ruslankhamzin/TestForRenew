package services;

import models.Airport;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    private final List<Airport> airports = new ArrayList<>();
    private String filename;

    public FileService(String filename) {
        this.filename = filename;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void Search(){
        String line="";
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.filename));
            while ((line=br.readLine())!=null){
                String[] values = line.split(",");
                Airport airport = new Airport();
                airport.setId(values[0]);
                airport.setName(values[1]);
                airport.setCity(values[2]);
                airport.setCountry(values[3]);
                airport.setIATA(values[4]);
                airport.setICAO(values[5]);
                airport.setLatitude(values[6]);
                airport.setLongitude(values[7]);
                airport.setAltitude(values[8]);
                airport.setTimeZone(values[9]);
                airport.setDST(values[10]);
                airport.setTz(values[11]);
                airport.setType(values[12]);
                airport.setSource(values[13]);
                System.out.println(airport.getId()+" "+airport.getCity());
                airports.add(airport);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
