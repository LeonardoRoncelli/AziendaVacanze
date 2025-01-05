public class DipendenteSuCommissione extends Dipendente {
    private double percentualeCommissione;
    private double vendite;
    public DipendenteSuCommissione(String nome, String cognome, String codiceFiscale, double percentualeCommissione, double vendite) {
        super(nome, cognome, codiceFiscale);
        this.percentualeCommissione = percentualeCommissione;
        this.vendite = vendite;
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
        return vendite * percentualeCommissione;
    }
    public String toString() {
        return "Dipendente Su Commissione: " + getNome() + " " + getCognome() + ", Vendite: " + vendite + ", Percentuale: " + percentualeCommissione;
    }
}