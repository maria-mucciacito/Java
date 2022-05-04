public class Aircraft {
    private int id = 0;
    private String code_aircraft = "";
    private String modello = "";
    private boolean stato = false;
    private int km_percorsi = 0;
    private int posti_primaclasse = 0;
    private int posti_secondaclasse = 0;
    private int posti_economy = 0;

    @Override
    public String toString() {
        return "Aircraft: " +
                " code_aircraft='" + getCode_aircraft() + '\'' +
                " modello='" + getModello() + '\'';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode_aircraft() {
        return code_aircraft;
    }

    public void setCode_aircraft(String code_aircraft) {
        this.code_aircraft = code_aircraft;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public boolean isStato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

    public int getKm_percorsi() {
        return km_percorsi;
    }

    public void setKm_percorsi(int km_percorsi) {
        this.km_percorsi = km_percorsi;
    }

    public int getPosti_primaclasse() {
        return posti_primaclasse;
    }

    public void setPosti_primaclasse(int posti_primaclasse) {
        this.posti_primaclasse = posti_primaclasse;
    }

    public int getPosti_secondaclasse() {
        return posti_secondaclasse;
    }

    public void setPosti_secondaclasse(int posti_secondaclasse) {
        this.posti_secondaclasse = posti_secondaclasse;
    }

    public int getPosti_economy() {
        return posti_economy;
    }

    public void setPosti_economy(int posti_economy) {
        this.posti_economy = posti_economy;
    }
}
