
package controller;

import static controller.Main.S;
import model.Corso;

public class GestoreCorsi {
   public void aggiungCorso(Corso e){
    
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
}
