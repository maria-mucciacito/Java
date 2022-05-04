public class Utente {
    private int id = 0;
    private String name = "";
    private String lastname = "";
    private String email = "";
    private String telefono = "";

    @Override
    public String toString() {
        return "Utente: " +
                " name='" + getName() + '\'' +
                " lastname='" + getLastname() + '\'';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
