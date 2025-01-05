public class DipendenteCommissionePlusBase extends Dipendente {
    private double stipendioBase;
    private double percentualeCommissione;
    private double vendite;

    public DipendenteCommissionePlusBase(String nome, String cognome, String codiceFiscale, double stipendioBase, double percentualeCommissione, double vendite) {
        super(nome, cognome, codiceFiscale);
        this.stipendioBase = stipendioBase;
        this.percentualeCommissione = percentualeCommissione;
        this.vendite = vendite;
    }
    public double getStipendioBase() {
        return stipendioBase;
    }
    public void setStipendioBase(double stipendioBase) {
        this.stipendioBase = stipendioBase;
    }
    public double getPercentualeCommissione() {
        return percentualeCommissione;
    }
    public void setPercentualeCommissione(double percentualeCommissione) {
        this.percentualeCommissione = percentualeCommissione;
    }
    public double getVendite() {
        return vendite;
    }
    public void setVendite(double vendite) {
        this.vendite = vendite;
    }
    public double paga() {
        return stipendioBase + (vendite * percentualeCommissione);
    }
    public String toString() {
        return "Dipendente Commissione Plus Base: " + getNome() + " " + getCognome() + ", Stipendio Base: " + stipendioBase + ", Vendite: " + vendite + ", Percentuale: " + percentualeCommissione;
    }
}