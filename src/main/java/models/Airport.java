package models;


public class Airport {


    private String id;
    private String name;
    private String city;
    private String country;
    private String IATA;
    private String ICAO;
    private String latitude;
    private String longitude;
    private String altitude;
    private String timeZone;
    private String DST;
    private String tz;
    private String type;
    private String source;

    @Override
    public String toString() {
        return name + " " + city + " " + country + " " + IATA + " " + ICAO + " " + latitude + " " + longitude + " " + altitude + " "
                + timeZone + " " + DST + " " + tz + " " + type + " " + source;
    }

    public Airport() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIATA() {
        return IATA;
    }

    public void setIATA(String IATA) {
        this.IATA = IATA;
    }

    public String getICAO() {
        return ICAO;
    }

    public void setICAO(String ICAO) {
        this.ICAO = ICAO;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getDST() {
        return DST;
    }

    public void setDST(String DST) {
        this.DST = DST;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Airport(String id, String name, String city, String country, String IATA, String ICAO, String latitude, String longitude, String altitude, String timeZone, String DST, String tz, String type, String source) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country;
        this.IATA = IATA;
        this.ICAO = ICAO;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.timeZone = timeZone;
        this.DST = DST;
        this.tz = tz;
        this.type = type;
        this.source = source;
    }
}
