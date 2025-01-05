public class DipendentePagatoAOre extends Dipendente {
    private double tariffaOraria;
    private int oreLavorate;
    public DipendentePagatoAOre(String nome, String cognome, String codiceFiscale, double tariffaOraria, int oreLavorate) {
        super(nome, cognome, codiceFiscale);
        this.tariffaOraria = tariffaOraria;
        this.oreLavorate = oreLavorate;
    }
    public double getTariffaOraria() {
        return tariffaOraria;
    }
    public void setTariffaOraria(double tariffaOraria) {
        this.tariffaOraria = tariffaOraria;
    }
    public int getOreLavorate() {
        return oreLavorate;
    }
    public void setOreLavorate(int oreLavorate) {
        this.oreLavorate = oreLavorate;
    }
    public double paga() {
        if (oreLavorate > 40) {
            return (40 * tariffaOraria) + ((oreLavorate - 40) * tariffaOraria * 1.5);
        } else {
            return oreLavorate * tariffaOraria;
        }
    }
    public String toString() {
        return "Dipendente Pagato a Ore: " + getNome() + " " + getCognome() + ", Ore Lavorate: " + oreLavorate + ", Tariffa Oraria: " + tariffaOraria;
    }
}