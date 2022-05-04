public class Prenotazione {
    private int id = 0;
    private String code_prenotazione = "";
    private Utente utente = null;
    private Fly volo = null;
    private Posto posto = null;

    @Override
    public String toString() {
        return "Prenotazione: " +
                " code_prenotazione='" + getCode_prenotazione() + '\'' +
                " utente=" + getUtente() +
                " volo=" + getVolo() +
                " posto=" + getPosto();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode_prenotazione() {
        return code_prenotazione;
    }

    public void setCode_prenotazione(String code_prenotazione) {
        this.code_prenotazione = code_prenotazione;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Fly getVolo() {
        return volo;
    }

    public void setVolo(Fly volo) {
        this.volo = volo;
    }

    public Posto getPosto() {
        return posto;
    }

    public void setPosto(Posto posto) {
        this.posto = posto;
    }
}
