package controller;

import static controller.Main.S;
import model.Appello;

public class GestoreAppelli {
    
    public void aggiungiAppelli(Appello e){
    
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
}
