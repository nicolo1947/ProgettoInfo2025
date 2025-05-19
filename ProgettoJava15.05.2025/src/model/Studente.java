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

    @Override
    public String toString() {
        return "nome:" + nome + "; " + "cognome:" + cognome + "; " + "matricola:" + matricola + "; " + "codice:" + codice;
    }
}

//// funzione (e ){

 //   arrailist.add(e);
//e:aggiungi disciplina(this) // chiama la setssa cosa 
//}
