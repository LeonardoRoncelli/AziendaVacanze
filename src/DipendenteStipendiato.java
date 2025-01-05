public class DipendenteStipendiato extends Dipendente {
    private double stipendioSettimanale;
    public DipendenteStipendiato(String nome, String cognome, String codiceFiscale, double stipendioSettimanale) {
        super(nome, cognome, codiceFiscale);
        this.stipendioSettimanale = stipendioSettimanale;
    }
    public double getStipendioSettimanale() {
        return stipendioSettimanale;
    }
    public void setStipendioSettimanale(double stipendioSettimanale) {
        this.stipendioSettimanale = stipendioSettimanale;
    }public double paga() {
        return stipendioSettimanale;
    }
    public String toString() {
        return "Dipendente Stipendiato: " + getNome() + " " + getCognome() + ", Stipendio: " + stipendioSettimanale;
    }
}