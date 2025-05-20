package controller;
import static controller.Main.S;
import model.Disciplina;
import model.Docente;
import model.Studente;

public class GestoreDocenti {

    public void aggiungiDocente(Docente e) {

        S.elencoDocenti.add(e);
    }

    public void modificaDocente(Studente nuovoDocente) {

        for (Docente docenteEsistente : S.elencoDocenti) {
        if (docenteEsistente.getMatricola().equals(nuovoDocente.getMatricola())) {
            docenteEsistente.setNome(nuovoDocente.getNome());
            docenteEsistente.setCognome(nuovoDocente.getCognome());
           // docenteEsistente.setDisciplina(nuovoDocente.getDisciplina());
            break;
        
        }
    }
}
    public boolean eliminaDocente(String matricolaDocente) {
        // Trova il docente da eliminare
        Docente docenteDaEliminare = null;
        for (Docente d : S.elencoDocenti) {
            if (d.getMatricola().equals(matricolaDocente)) {
                docenteDaEliminare = d;
                break;
            }
        }

        if (docenteDaEliminare == null) {
            System.out.println("Docente con matricola " + matricolaDocente + " non trovato.");
            return false;
        }

        // Controlla se il docente è collegato a qualche disciplina
        for (Disciplina disc : S.elencoDiscipline) {
            if (disc.getDocentiDiscipline().contains(docenteDaEliminare)) {
                System.out.println("Impossibile eliminare docente: è collegato alla disciplina " + disc.getNome());
                return false;
            }
        }

        // Se nessuna disciplina è collegata, elimina il docente
        S.elencoDocenti.remove(docenteDaEliminare);
        System.out.println("Docente con matricola " + matricolaDocente + " eliminato con successo.");
        return true;
    }
}
