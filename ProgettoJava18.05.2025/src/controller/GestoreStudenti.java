package controller;
import static controller.Main.S;
import model.Studente;

public class GestoreStudenti {
    
        
   public void aggiungiStudente(Studente e){
    
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
  
}
