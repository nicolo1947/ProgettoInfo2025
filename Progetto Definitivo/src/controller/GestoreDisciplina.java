package controller;
import static controller.Main.S;
import model.Disciplina;
import model.Studente;

public class GestoreDisciplina {
    
    public void aggiungiDisciplina(Disciplina d) {
        S.elencoDiscipline.add(d);
    }
    public void modificaDisciplina(Disciplina nuovaDisciplina) {

        for (Disciplina disciplinaEsistente : S.elencoDiscipline) {
        if (disciplinaEsistente.getCodiceDisciplina().equals(nuovaDisciplina.getCodiceDisciplina())) {
            disciplinaEsistente.setNome(nuovaDisciplina.getNome());
            disciplinaEsistente.setCfu(nuovaDisciplina.getCfu());
            disciplinaEsistente.setCodice(nuovaDisciplina.getCodice());
            break;
            }
        }
    }
     public boolean eliminaDisciplina(String codiceDisciplina) {
        Disciplina daEliminare = null;
        for (Disciplina d : S.elencoDiscipline) {
            if (d.getCodiceDisciplina().equals(codiceDisciplina)) {
                if (!d.getDocentiDiscipline().isEmpty()) {
                    System.out.println("Impossibile eliminare la disciplina: sono presenti docenti associati.");
                    return false;
                }
                daEliminare = d;
                break;
            }
        }

        if (daEliminare != null) {
            S.elencoDiscipline.remove(daEliminare);
            System.out.println("Disciplina con codice " + codiceDisciplina + " eliminata con successo.");
            return true;
        } else {
            System.out.println("Disciplina con codice " + codiceDisciplina + " non trovata.");
            return false;
        }
    }

    public Disciplina cercaDisciplina(String codice) {
        for (Disciplina d : S.elencoDiscipline) {
            if (d.getCodiceDisciplina().equals(codice)) {
                return d;
            }
        }
        System.out.println("Disciplina con codice " + codice + " non trovata.");
        return null;
    }

}