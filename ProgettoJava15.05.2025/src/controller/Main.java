package controller;


import java.util.ArrayList;
import model.Appello;
import model.Corso;
import model.Disciplina;
import model.Docente;
import model.IscrizioneAppello;
import model.Studente;

public class Main {

    public static Lettore S = new Lettore(); //così è rudimentale, sarebbe meglio passare come parametro privato
    
    public static void main(String[] args) {
    
        S.letturaStudenti("studenti.csv");
        S.letturaDocenti("docenti.csv");
        S.letturaDisciplina("discipline.csv");
        S.letturaCorso("corsi.csv");
        S.letturaAppello("appelli.csv");
        S.letturaIscAppello("iscrizioni_appelli.csv");
        
        
        //S.elencoStudenti;
        
        System.out.println(S.elencoStudenti);
        //System.out.println(S.elencoDocenti.get(3));
        //posso recuperare il corso con l'indici System.out.println(corsi.get(3));
        
        GestoreCorsi gestore = new GestoreCorsi();
        System.out.println(S.elencoCorsi);
        gestore.aggiungCorso(new Corso("test", "celiaco",5));
        System.out.println(S.elencoCorsi);
        //C004;Ginnastica;10
        gestore.modificaCorso("C004", new Corso("","cane",10)); // codice non modificabile ->> serve per identificare
        System.out.println(S.elencoCorsi);
        System.out.println(S);//problemi con la stampa ma in teorico funziona
        
        
    }
    
}
