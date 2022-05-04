public class Fly {
    private int id = 0;
    private String code_volo = "";
    private int distanza_percorsa = 0;
    private String ora_partenza = "";
    private String ora_arrivo = "";
    private String data_partenza = "";
    private int post_prenotati = 0;
    private Airport aeroporto_partenza = null;
    private Airport aeroporto_arrivo = null;
    private Aircraft aircraft = null;

    @Override
    public String toString() {
        return "Fly: " +
                " code_volo='" + getCode_volo() + '\'' +
                " data_partenza='" + getData_partenza() + '\'' +
                " Aeroporto di Partenza=" + getAeroporto_partenza() +
                " Aeroporto di Arrivo=" + getAeroporto_arrivo() +
                " Aircraft=" + getAircraft();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode_volo() {
        return code_volo;
    }

    public void setCode_volo(String code_volo) {
        this.code_volo = code_volo;
    }

    public int getDistanza_percorsa() {
        return distanza_percorsa;
    }

    public void setDistanza_percorsa(int distanza_percorsa) {
        this.distanza_percorsa = distanza_percorsa;
    }

    public String getOra_partenza() {
        return ora_partenza;
    }

    public void setOra_partenza(String ora_partenza) {
        this.ora_partenza = ora_partenza;
    }

    public String getOra_arrivo() {
        return ora_arrivo;
    }

    public void setOra_arrivo(String ora_arrivo) {
        this.ora_arrivo = ora_arrivo;
    }

    public String getData_partenza() {
        return data_partenza;
    }

    public void setData_partenza(String data_partenza) {
        this.data_partenza = data_partenza;
    }

    public int getPost_prenotati() {
        return post_prenotati;
    }

    public void setPost_prenotati(int post_prenotati) {
        this.post_prenotati = post_prenotati;
    }

    public Airport getAeroporto_partenza() {
        return aeroporto_partenza;
    }

    public void setAeroporto_partenza(Airport aeroporto_partenza) {
        this.aeroporto_partenza = aeroporto_partenza;
    }

    public Airport getAeroporto_arrivo() {
        return aeroporto_arrivo;
    }

    public void setAeroporto_arrivo(Airport aeroporto_arrivo) {
        this.aeroporto_arrivo = aeroporto_arrivo;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }
}
