package model;

import java.util.ArrayList;

public class Disciplina {
    
    private String codiceDisciplina;
    private String nome;
    private int cfu;
    private String codice;
    private ArrayList <Docente> docentiDiscipline = new ArrayList();

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

    public ArrayList<Docente> getDocentiDiscipline() {
        return docentiDiscipline;
    }

    public void setCodiceDisciplina(String codiceDisciplina) {
        this.codiceDisciplina = codiceDisciplina;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCfu(int cfu) {
        this.cfu = cfu;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setDocentiDiscipline(ArrayList<Docente> docentiDiscipline) {
        this.docentiDiscipline = docentiDiscipline;
    }
    
    @Override
    public String toString() {
        return "codice:"+codiceDisciplina+ "; " + "nome:"+ nome+"; " + "cfu:"+ cfu + "; " + "codice:" + codice;
    }
    
}
