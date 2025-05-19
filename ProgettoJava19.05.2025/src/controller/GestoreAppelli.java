package controller;

import static controller.Main.S;
import model.Appello;

public class GestoreAppelli {

    public void aggiungiAppelli(Appello e) {

        S.elencoAppelli.add(e);
    }

    public void modificaAppello(String id, Appello nuovoAppello) {

        for (Appello i : S.elencoAppelli) {
            if (!i.getIdAppello().equals(id)) {
            } else {
                i.setData(nuovoAppello.getData());
                i.setCodiceDisciplina(nuovoAppello.getCodiceDisciplina());
                break;
            }
        }
    }

    public boolean eliminaAppello(String idAppello) {
        Appello appelloDaEliminare = null;

        // Trova l'appello con quell'id
        for (Appello a : S.elencoAppelli) {
            if (a.getIdAppello().equals(idAppello)) {
                appelloDaEliminare = a;
                break;
            }
        }

        if (appelloDaEliminare == null) {
            System.out.println("Appello non trovato.");
            return false;
        }

        // Controlla se ci sono studenti iscritti
        if (!appelloDaEliminare.getIscritti().isEmpty()) {
            System.out.println("Impossibile eliminare: ci sono studenti iscritti all'appello.");
            return false;
        }

        // Rimuovi l'appello dalla lista
        S.elencoAppelli.remove(appelloDaEliminare);
        System.out.println("Appello " + idAppello + " eliminato con successo.");
        return true;
    }
}
