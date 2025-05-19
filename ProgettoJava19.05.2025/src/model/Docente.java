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

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
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
        return "nome:"+nome+ "; " + "cognome:"+ cognome+"; " + "matricola:"+ matricola + "; " + "codice:" + disciplina;
    }
    
}
