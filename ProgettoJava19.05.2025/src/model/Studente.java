package model;

public class Studente extends Persona {

    private String codice;

    public Studente(String nome, String cognome, String matricola, String codice) {
        super(nome, cognome, matricola);
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
    

    @Override
    public String toString() {
        return "nome:" + nome + "; " + "cognome:" + cognome + "; " + "matricola:" + matricola + "; " + "codice:" + codice;
    }
}

