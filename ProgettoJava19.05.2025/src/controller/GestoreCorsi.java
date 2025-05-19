package controller;

import static controller.Main.S;
import model.Corso;
import model.Disciplina;
import model.Docente;
import model.Studente;

public class GestoreCorsi {

    public void aggiungCorso(Corso e) {

        S.elencoCorsi.add(e);
    }

    public void modificaCorso(String codice, Corso nuovoCorso) {

        for (Corso i : S.elencoCorsi) {
            if (!i.getCodiceCorso().equals(codice)) {
            } else {
                i.setNome(nuovoCorso.getNome());
                i.setDurata(nuovoCorso.getDurata());
                break;
            }
        }

    }

    public boolean eliminaCorso(String codiceCorso) {
        // Cerca il corso
        Corso corsoDaEliminare = null;
        for (Corso c : S.elencoCorsi) {
            if (c.getCodiceCorso().equals(codiceCorso)) {
                corsoDaEliminare = c;
                break;
            }
        }

        if (corsoDaEliminare == null) {
            System.out.println("Corso non trovato.");
            return false;
        }

        // Verifica vincoli: Studenti iscritti
        for (Studente s : S.elencoStudenti) {
            if (s.getCodice().equals(codiceCorso)) {
                System.out.println("Impossibile eliminare: ci sono studenti iscritti a questo corso.");
                return false;
            }
        }

        // Verifica vincoli: Discipline collegate
        for (Disciplina d : S.elencoDiscipline) {
            if (d.getCodice().equals(codiceCorso)) {
                System.out.println("Impossibile eliminare: ci sono discipline associate a questo corso.");
                return false;
            }
        }

        // Verifica vincoli: Docenti associati a discipline di questo corso
        for (Disciplina d : S.elencoDiscipline) {
            if (d.getCodice().equals(codiceCorso)) {
                for (Docente docente : S.elencoDocenti) {
                    if (docente.getDisciplina().equals(d.getCodice())) {
                        System.out.println("Impossibile eliminare: un docente è assegnato a una disciplina di questo corso.");
                        return false;
                    }
                }
            }
        }

        S.elencoCorsi.remove(corsoDaEliminare);
        System.out.println("Corso " + codiceCorso + " eliminato con successo.");
        return true;
    }

}
