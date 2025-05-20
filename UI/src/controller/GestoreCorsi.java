package controller;
import static controller.Main.S;
import java.util.ArrayList;
import model.Corso;
import model.Disciplina;
import model.Docente;
import model.Studente;

public class GestoreCorsi {

    public void aggiungCorso(Corso e) {

        S.elencoCorsi.add(e);
    }

    public void modificaCorso(Corso nuovoCorso) {

        for (Corso corsoEsistente : S.elencoCorsi) {
        if (corsoEsistente.getCodiceCorso().equals(nuovoCorso.getCodiceCorso())) {
            corsoEsistente.setNome(nuovoCorso.getNome());
            corsoEsistente.setDurata(nuovoCorso.getDurata());
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

        // controllo i vincoli vincoli degli Studenti iscritti
        for (Studente s : S.elencoStudenti) {
            if (s.getCodice().equals(codiceCorso)) {
                System.out.println("Impossibile eliminare: ci sono studenti iscritti a questo corso.");
                return false;
            }
        }

        //Discipline collegate
        for (Disciplina d : S.elencoDiscipline) {
            if (d.getCodice().equals(codiceCorso)) {
                System.out.println("Impossibile eliminare: ci sono discipline associate a questo corso.");
                return false;
            }
        }

        // controllo Docenti associati a discipline di questo corso
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

        S.elencoCorsi.remove(corsoDaEliminare); //uso l'oggetto
        System.out.println("Corso " + codiceCorso + " eliminato con successo.");
        return true;
    }
    private ArrayList<Corso> corsi = new ArrayList<>();
    public Iterable<Corso> getCorsi() {
        return corsi; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
