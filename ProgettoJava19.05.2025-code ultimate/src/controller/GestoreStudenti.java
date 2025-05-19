package controller;
import static controller.Main.S;
import java.util.ArrayList;
import model.Appello;
import model.Corso;
import model.Studente;

public class GestoreStudenti {

    public void aggiungiStudente(Studente e) {

        S.elencoStudenti.add(e);
    }

    public void modificaStudente(String Matrix, Studente nuovoStudente) {

        for (Studente i : S.elencoStudenti) {
            if (!i.getMatricola().equals(Matrix)) {
            } else {
                i.setNome(nuovoStudente.getNome());
                i.setCognome(nuovoStudente.getCognome());
                i.setCodice(nuovoStudente.getCodice());
                break;
            }
        }
    }

    public boolean eliminaStudente(String matricola) {

        // Trova lo studente
        Studente studenteDaEliminare = null;
        for (Studente s : S.elencoStudenti) {
            if (s.getMatricola().equals(matricola)) {
                studenteDaEliminare = s;
                break;
            }
        }

        if (studenteDaEliminare == null) {
            System.out.println("Studente non trovato.");
            return false;
        }

        // Controlla se è iscritto a qualche appello
        for (Appello a : S.elencoAppelli) {
            for (Studente iscr : a.getIscritti()) {
                if (iscr.getMatricola().equals(matricola)) {
                    System.out.println("Impossibile eliminare: studente iscritto ad almeno un appello (" + a.getIdAppello() + ").");
                    return false;
                }
            }
        }

        // Rimuovi studente dal corso
        for (Corso c : S.elencoCorsi) {
            ArrayList<Studente> studenti = c.getStudentiCorso();
            for (int i = 0; i < studenti.size(); i++) {
                if (studenti.get(i).getMatricola().equals(matricola)) {
                    studenti.remove(i);
                    break;
                }
            }
        }

        // Rimuovi dallo elenco studenti
        S.elencoStudenti.remove(studenteDaEliminare);
        System.out.println("Studente " + matricola + " eliminato con successo.");
        return true;
    }
}
