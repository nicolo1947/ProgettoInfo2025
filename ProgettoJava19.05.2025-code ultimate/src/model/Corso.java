package model;
import java.util.ArrayList;

public class Corso {

    private String codiceCorso;
    private String nome;
    private int durata;
    private ArrayList<Disciplina> disciplineCorso = new ArrayList();
    private ArrayList<Studente> studentiCorso = new ArrayList();

    public Corso(String codiceCorso, String nome, int durata) {
        this.codiceCorso = codiceCorso;
        this.nome = nome;
        this.durata = durata;
        this.disciplineCorso = new ArrayList<>();
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

    public void setCodiceCorso(String codiceCorso) {
        this.codiceCorso = codiceCorso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public ArrayList<Disciplina> getDiscipline() {
        return disciplineCorso;
    }

    public void setDiscipline(ArrayList<Disciplina> discipline) {
        this.disciplineCorso = discipline;
    }

    public void addDisciplina(Disciplina d) {
        this.disciplineCorso.add(d);
    }

    public ArrayList<Disciplina> getDisciplineCorso() {
        return disciplineCorso;
    }

    public ArrayList<Studente> getStudentiCorso() {
        return studentiCorso;
    }

    public void setDisciplineCorso(ArrayList<Disciplina> disciplineCorso) {
        this.disciplineCorso = disciplineCorso;
    }

    public void setStudentiCorso(ArrayList<Studente> studentiCorso) {
        this.studentiCorso = studentiCorso;
    }

    @Override
    public String toString() {
        return "codiceCorso:" + codiceCorso + "; " + "nome:" + nome + "; " + "durata:" + durata;
    }
}
