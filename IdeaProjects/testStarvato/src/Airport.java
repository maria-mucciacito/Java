public class Airport {
    private int id = 0;
    private String identification = "";
    private String type_airport = "";
    private String name = "";
    private String latitude_deg = "";
    private String longitude_deg = "";
    private int elevation_ft = 0;
    private String continent = "";
    private String iso_country = "";
    private String iso_region = "";
    private String municipality = "";
    private int gps_code = 0;
    private String iata_code = "";
    private String local_code = "";
    private int cap = 0;
    private String country = "";
    private String city = "";
    private String address_line_1 = "";
    private String address_line_2 = "";
    private String address_line_3 = "";

    @Override
    public String toString() {
        return "Airport:" +
                " identification='" + getIdentification() + '\'' +
                " name='" + getName() + '\'' +
                " cap=" + getCap() +
                " country='" + getCountry() + '\'' +
                " city='" + getCity() + '\'' +
                " address_line_1='" + getAddress_line_1() + '\'' +
                " address_line_2='" + getAddress_line_2() + '\'' +
                " address_line_3='" + getAddress_line_3();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getType_airport() {
        return type_airport;
    }

    public void setType_airport(String type_airport) {
        this.type_airport = type_airport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatitude_deg() {
        return latitude_deg;
    }

    public void setLatitude_deg(String latitude_deg) {
        this.latitude_deg = latitude_deg;
    }

    public String getLongitude_deg() {
        return longitude_deg;
    }

    public void setLongitude_deg(String longitude_deg) {
        this.longitude_deg = longitude_deg;
    }

    public int getElevation_ft() {
        return elevation_ft;
    }

    public void setElevation_ft(int elevation_ft) {
        this.elevation_ft = elevation_ft;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getIso_country() {
        return iso_country;
    }

    public void setIso_country(String iso_country) {
        this.iso_country = iso_country;
    }

    public String getIso_region() {
        return iso_region;
    }

    public void setIso_region(String iso_region) {
        this.iso_region = iso_region;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public int getGps_code() {
        return gps_code;
    }

    public void setGps_code(int gps_code) {
        this.gps_code = gps_code;
    }

    public String getIata_code() {
        return iata_code;
    }

    public void setIata_code(String iata_code) {
        this.iata_code = iata_code;
    }

    public String getLocal_code() {
        return local_code;
    }

    public void setLocal_code(String local_code) {
        this.local_code = local_code;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress_line_1() {
        return address_line_1;
    }

    public void setAddress_line_1(String address_line_1) {
        this.address_line_1 = address_line_1;
    }

    public String getAddress_line_2() {
        return address_line_2;
    }

    public void setAddress_line_2(String address_line_2) {
        this.address_line_2 = address_line_2;
    }

    public String getAddress_line_3() {
        return address_line_3;
    }

    public void setAddress_line_3(String address_line_3) {
        this.address_line_3 = address_line_3;
    }
}
