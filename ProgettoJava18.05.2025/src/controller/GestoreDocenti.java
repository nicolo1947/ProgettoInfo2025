package controller;

import static controller.Main.S;
import model.Docente;

public class GestoreDocenti {

    public void aggiungiDocente(Docente e) {

        S.elencoDocenti.add(e);
    }

    public void modificaDocente(String Matrix, Docente nuovoDocente) {

        for (Docente i : S.elencoDocenti) {
            if (!i.getMatricola().equals(Matrix)) {
            } else {
                i.setNome(nuovoDocente.getNome());
                i.setCognome(nuovoDocente.getCognome());
                i.setDisciplina(nuovoDocente.getDisciplina());
                
                break;
            }
        }

    }

}
