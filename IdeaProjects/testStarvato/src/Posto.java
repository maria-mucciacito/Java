public class Posto {
    private int id = 0;
    private String fila = "A";
    private int numero = 0;
    private String classe = "Economy";

    @Override
    public String toString() {
        return "Posto:" +
                " fila='" + getFila() + '\'' +
                " numero=" + getNumero();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
