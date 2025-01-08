import java.util.*;
public class LibroPaga {
    private List<Dipendente> dipendenti;
    public LibroPaga() {
        dipendenti = new ArrayList<>();
    }public void aggiungiDipendente(Dipendente dipendente) {
        dipendenti.add(dipendente);
    }
    public void stampaDipendenti() {
        for (Dipendente d : dipendenti) {
            System.out.println(d);
        }
    }
    public void stampaDipendentiOrdinati() {
        stampaDipendenti();
    }
    public void modificaStipendioBase() {
        for (Dipendente d : dipendenti) {
            if (d instanceof DipendenteCommissionePlusBase) {
                DipendenteCommissionePlusBase dcpb = (DipendenteCommissionePlusBase) d;
                dcpb.setStipendioBase(dcpb.getStipendioBase() * 1.1);
            }
        }
    }
}