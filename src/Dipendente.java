import java.util.*;
public abstract class Dipendente implements Dipendente{
    private String nome;
    private String cognome;
    private String codiceFiscale;
    public Dipendente(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }
    public abstract double paga();
    public abstract String toString();
    public int compareTo(Dipendente altro) {
        return Double.compare(this.paga(), altro.paga());
    }
}