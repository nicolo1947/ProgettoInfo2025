package model;

public class Corso {
    
    private String codiceCorso;
    private String nome;
    private int durata;

    public Corso(String codiceCorso, String nome, int durata) {
        this.codiceCorso = codiceCorso;
        this.nome = nome;
        this.durata = durata;
    }

    public String getCodiceCorso() {
        return codiceCorso;
    }

    public String getNome() {
        return nome;
    }

    public int getDurata() {
        return durata;
    }
    
    @Override
    public String toString() {
        return "codiceCorso:"+codiceCorso+ "; " + "nome:"+ nome+"; " + "durata:"+ durata;
    }
}
