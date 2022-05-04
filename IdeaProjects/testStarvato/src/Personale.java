public class Personale {
    private int id = 0;
    private String code_personale = "";
    private String name = "";
    private String lastname = "";
    private String mansione = "";
    private String ruolo = "";
    private String email = "";
    private String telefono = "";
    private Aircraft aircraft = null;

    @Override
    public String toString() {
        return "Personale: " +
                " code_personale='" + getCode_personale() + '\'' +
                " name='" + getName() + '\'' +
                " lastname='" + getLastname() + '\'' +
                " mansione='" + getMansione() + '\'' +
                " Aircraft=" + getAircraft() ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode_personale() {
        return code_personale;
    }

    public void setCode_personale(String code_personale) {
        this.code_personale = code_personale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMansione() {
        return mansione;
    }

    public void setMansione(String mansione) {
        this.mansione = mansione;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }
}
