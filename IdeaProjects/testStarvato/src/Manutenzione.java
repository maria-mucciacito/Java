public class Manutenzione {
    private int id = 0;
    private String ultima_manutenzione = "";
    private int manutenzione_km = 0;
    private int manutenzione_giorni = 0;
    private int km_restanti = 0;
    private Aircraft aircraft = null;

    @Override
    public String toString() {
        return "Prenotazione: " +
                " ultima_manutenzione='" + getUltima_manutenzione() + '\'' +
                " km_restanti=" + getKm_restanti() + '\'' +
                " Aircraft=" + getAircraft();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUltima_manutenzione() {
        return ultima_manutenzione;
    }

    public void setUltima_manutenzione(String ultima_manutenzione) {
        this.ultima_manutenzione = ultima_manutenzione;
    }

    public int getManutenzione_km() {
        return manutenzione_km;
    }

    public void setManutenzione_km(int manutenzione_km) {
        this.manutenzione_km = manutenzione_km;
    }

    public int getManutenzione_giorni() {
        return manutenzione_giorni;
    }

    public void setManutenzione_giorni(int manutenzione_giorni) {
        this.manutenzione_giorni = manutenzione_giorni;
    }

    public int getKm_restanti() {
        return km_restanti;
    }

    public void setKm_restanti(int km_restanti) {
        this.km_restanti = km_restanti;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }
}
