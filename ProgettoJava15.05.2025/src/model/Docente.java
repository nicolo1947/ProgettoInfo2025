package model;

public class Docente extends Persona {

    private String disciplina;

    public Docente(String nome, String cognome, String matricola, String disciplina) {
        super(nome, cognome, matricola);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
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
        return "nome:"+nome+ "; " + "cognome:"+ cognome+"; " + "matricola:"+ matricola + "; " + "codice:" + disciplina;
    }
    
}
