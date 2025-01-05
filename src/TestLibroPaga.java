public class TestLibroPaga {
    public static void main(String[] args) {
        LibroPaga libroPaga = new LibroPaga();
        libroPaga.aggiungiDipendente(new DipendenteStipendiato("Mario", "Rossi", "RSSMRA80A01H501Z", 1000));
        libroPaga.aggiungiDipendente(new DipendentePagatoAOre("Giovanni", "Bianchi", "BNCGNN85M01Z404V", 20, 45));
        libroPaga.aggiungiDipendente(new DipendenteSuCommissione("Anna", "Verdi", "VRDANN78S45J320R", 0.05, 5000));
        libroPaga.aggiungiDipendente(new DipendenteCommissionePlusBase("Lucia", "Neri", "NRLLCU72V60C351Z", 800, 0.03, 2000));
        System.out.println("Dipendenti:");
        libroPaga.stampaDipendenti();
        System.out.println("\nDipendenti Ordinati per Stipendio:");
        libroPaga.stampaDipendentiOrdinati();
        libroPaga.modificaStipendioBase();
        System.out.println("\nDipendenti dopo modifica stipendio base:");
        libroPaga.stampaDipendenti();
    }
}