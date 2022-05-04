public class Applications {

    private int pk;
    private String nome;
    private String cognome;
    private Aereo volo;

    public Applications(int pk){
        //self.volo = Antonov()
        this.volo = new Antonov();

    }

    public static void main(String[] args){
        System.out.println("Partito");
    }

}