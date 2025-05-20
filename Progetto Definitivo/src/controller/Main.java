package controller;

import java.util.ArrayList;
import model.Appello;
import model.Corso;
import model.Disciplina;
import model.Docente;
import model.IscrizioneAppello;
import model.Studente;

public class Main {
    //ma che cazzoi significa che gli studenti possono iscriversi solo agli appelli delle discipline del corso??? mannaggia a santanna, eliminazione,scrittura file
    //funzione salva nel lettore ->> pulsante per max salva tutto (chiedere a manu) elinimazione nei gestori
    public static Lettore S = new Lettore(); //così è rudimentale, sarebbe meglio passare come parametro privato

    public static void main(String[] args) {

        //max in questo ordine senno scoppia tutto
        S.letturaCorso("corsi.csv");
        S.letturaDisciplina("discipline.csv");
        S.letturaDocenti("docenti.csv");
        S.letturaStudenti("studenti.csv");
        S.letturaAppello("appelli.csv");
        S.letturaIscAppello("iscrizioni_appelli.csv");

        //S.elencoStudenti;
       /* System.out.println(S.elencoStudenti);
        System.out.println("Docente: "+S.elencoDocenti.get(3)); //elemento preciso
        //posso recuperare il corso con l'indici System.out.println(corsi.get(3));
        // funzioni del gestore dei corsi, 
        GestoreCorsi gestore = new GestoreCorsi(); 1
        System.out.println(S.elencoCorsi);
        gestore.aggiungCorso(new Corso("test", "celiaco", 5)); 2
        System.out.println(S.elencoCorsi);
        //C004;Ginnastica;10
        gestore.modificaCorso("C004", new Corso("", "pane", 10)); // codice non modificabile ->> serve per identificare
        System.out.println(S.elencoCorsi);
        
        //questo è la stampa delle discipline per ogni corso
        for (Corso corso : S.elencoCorsi) {
            System.out.println("Discipline per corso " + corso.getNome() + ":" );
            System.out.println(corso.getDiscipline());
        }
        // ricerca per codice
        System.out.println("Discipline del corso C001:");
        for (Disciplina d : S.getDisciplinePerCorso("C001")) {
            System.out.println(d);
        }
        
        //modica di un docente, puoi anche aggiungerli
        System.out.println(S.elencoDocenti);
        GestoreDocenti d = new GestoreDocenti();
        d.modificaDocente("P01", new Docente ("gigi","spa","","D002"));
        System.out.println(S.elencoDocenti);
        
        for (Disciplina dI : S.elencoDiscipline) {
            System.out.println("Disciplina: " + dI.getNome());
            System.out.println("Docenti:");
            for (Docente doc : dI.getDocentiDiscipline()) {
                System.out.println(" - " + doc.getNome() + " " + doc.getCognome());
            }
            System.out.println();
        }
        
        S.stampaStudentiPerCorso(); //stampa per corso
        
        GestoreAppelli g = new GestoreAppelli();
        System.out.println(S.elencoAppelli);
        g.modificaAppello("A01", new Appello("","2000-07-11","D002"));
        System.out.println(S.elencoAppelli);
         
        for (Corso corso : S.elencoCorsi) {
            System.out.println("Discipline per corso " + corso.getNome() + ":");
            System.out.println(corso.getDiscipline());
        }
        S.stampaStudentiPerCorso();
        System.out.println(S.elencoDocenti.get(3)); //S.elencoDocenti.remove(3);  // Rimuove il docente all'indice 3
        //ti basta fare le funzione di delete nei gestori e chiedergli sono lindice NON lindice per codice il ciclo aumenta un temp e conil tmp togli dall 'elenco
        
        
        GestoreCorsi c = new GestoreCorsi();
        System.out.println(S.elencoCorsi);
        c.eliminaCorso("C003");
        System.out.println(S.elencoCorsi);
        
        GestoreStudenti cs = new GestoreStudenti();
        cs.aggiungiStudente(new Studente ("gigi","spano","S006","C001"));
        System.out.println(S.elencoStudenti);
        cs.eliminaStudente("S006");
        cs.eliminaStudente("S001");
        System.out.println(S.elencoStudenti);
       
        
        GestoreAppelli ca = new GestoreAppelli();
        ca.eliminaAppello("A02"); // questo può
        ca.eliminaAppello("A01"); //questo non può
        
        
        System.out.println( S.elencoDocenti);
        //c.eliminaDocente("P04"); //non può
        GestoreDocenti cd = new GestoreDocenti();
        System.out.println( S.elencoDocenti);
        cd.aggiungiDocente(new Docente("gigi","spano","P08","lll")); 
        cd.eliminaDocente("P08"); //può non ha discipline collegate
        S.salva();
        System.out.println(S.elencoDocenti);
        
        //max hai tutto qua commentato se ti serve*/
        System.out.println(S.elencoIscAppelli);
    }

}
