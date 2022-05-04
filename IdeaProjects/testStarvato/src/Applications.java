public class Applications {
    public static void main(String[] args) {
        Aircraft a = new Aircraft();
        a.setId(1);
        a.setCode_aircraft("AR2423");
        a.setModello("Antonov");
        a.setKm_percorsi(0);
        a.setStato(true);

        System.out.println(a);

    }
}
