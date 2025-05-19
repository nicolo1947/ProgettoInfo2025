package model;

public class Disciplina {
    
    private String codiceDisciplina;
    private String nome;
    private int cfu;
    private String codice;

    public Disciplina(String codiceDisciplina, String nome, int cfu, String codice) {
        this.codiceDisciplina = codiceDisciplina;
        this.nome = nome;
        this.cfu = cfu;
        this.codice = codice;
    }

    public String getCodiceDisciplina() {
        return codiceDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public int getCfu() {
        return cfu;
    }

    public String getCodice() {
        return codice;
    }
    
    @Override
    public String toString() {
        return "codice:"+codiceDisciplina+ "; " + "nome:"+ nome+"; " + "cfu:"+ cfu + "; " + "codice:" + codice;
    }
    
}
