package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DateFormatter;
import model.Appello;
import model.Corso;
import model.Disciplina;
import model.Docente;
import model.IscrizioneAppello;
import model.Studente; //altro package

public class Lettore {

    public ArrayList<Studente> elencoStudenti = new ArrayList();
    public ArrayList<Docente> elencoDocenti = new ArrayList();
    public ArrayList<Disciplina> elencoDiscipline = new ArrayList();
    public ArrayList<Corso> elencoCorsi = new ArrayList();
    public ArrayList<Appello> elencoAppelli = new ArrayList();
    public ArrayList<IscrizioneAppello> elencoIscAppelli = new ArrayList();

    public boolean letturaStudenti(String fn) {

        String linea;

        String ch = ";";
        try {
            File file = new File("cartellaCSV/" + fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while ((linea = br.readLine()) != null) {

                String[] data = linea.split(ch);

                String nome = data[1];
                String cognome = data[2];
                String matricola = data[0];
                String codice = data[3];

                Studente tmp = new Studente(nome, cognome, matricola, codice);
                elencoStudenti.add(tmp);
                for (Corso c : elencoCorsi) {
                    if (c.getCodiceCorso().equals(codice)) {
                        c.getStudentiCorso().add(tmp);
                        break;
                    }
                }

            }

        } catch (FileNotFoundException ex) { //ilaria e nicolo del futuro : aggiungiungete eccezioni personalizzate ->> fatelo negri di merda so che non lo vorrete fare
            System.err.println(ex);
            return false;
        } catch (IOException ex2) {
            System.err.println(ex2);
            return false;
        }

        return true;
    }

    public boolean letturaDocenti(String fn) {

        String linea;

        String ch = ";";
        try {
            File file = new File("cartellaCSV/" + fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while ((linea = br.readLine()) != null) {

                String[] data = linea.split(ch);

                String nome = data[1];
                String cognome = data[2];
                String matricola = data[0];
                String codice = data[3];

                Docente tmp = new Docente(nome, cognome, matricola, codice);
                elencoDocenti.add(tmp);

                for (Disciplina disc : elencoDiscipline) {
                    if (disc.getCodiceDisciplina().equals(codice)) {
                        disc.getDocentiDiscipline().add(tmp);
                        break; // se codice univoco, esci dal ciclo appena trovato
                    }
                }

            }

        } catch (FileNotFoundException ex) { //ilaria e nicolo del futuro : aggiungiungete eccezioni personalizzate ->> fatelo negri di merda so che non lo vorrete fare
            System.err.println(ex);
            return false;
        } catch (IOException ex2) {
            System.err.println(ex2);
            return false;
        }

        return true;
    }

    public boolean letturaCorso(String fn) {

        String linea;

        String ch = ";";
        try {
            File file = new File("cartellaCSV/" + fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while ((linea = br.readLine()) != null) {

                String[] data = linea.split(ch);

                String codice = data[0];
                String nome = data[1];
                int durata = Integer.parseInt(data[2]);

                elencoCorsi.add(new Corso(codice, nome, durata));
            }

        } catch (FileNotFoundException ex) { //ilaria e nicolo del futuro : aggiungiungete eccezioni personalizzate ->> fatelo negri di merda so che non lo vorrete fare
            System.err.println(ex);
            return false;
        } catch (IOException ex2) {
            System.err.println(ex2);
            return false;
        } catch (Exception e) {
            System.err.println("generica");
        }

        return true;
    }

    public boolean letturaDisciplina(String fn) {

        String linea;

        String ch = ";";
        try {
            File file = new File("cartellaCSV/" + fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while ((linea = br.readLine()) != null) {

                String[] data = linea.split(ch);

                String codiceD = data[0];
                String nome = data[1];
                int cfu = Integer.parseInt(data[2]);
                String codice = data[3];
                Disciplina tmp = new Disciplina(codiceD, nome, cfu, codice);
                elencoDiscipline.add(tmp);

                for (Corso i : elencoCorsi) {
                    if (i.getCodiceCorso().equals(codice)) {
                        i.addDisciplina(tmp);
                    }
                }
            }

        } catch (FileNotFoundException ex) { //ilaria e nicolo del futuro : aggiungiungete eccezioni personalizzate ->> fatelo negri di merda so che non lo vorrete fare
            System.err.println(ex);
            return false;
        } catch (IOException ex2) {
            System.err.println(ex2);
            return false;
        }

        return true;
    }

    public boolean letturaAppello(String fn) {

        String linea;

        String ch = ";";
        try {
            File file = new File("cartellaCSV/" + fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while ((linea = br.readLine()) != null) {

                String[] data = linea.split(ch);

                String IdAppello = data[0];
                String Data = data[1];
                String codicedisciplina = data[2];

                elencoAppelli.add(new Appello(IdAppello, Data, codicedisciplina));//ricorda che con data si impalla quindi Data con la maiuscola

            }

        } catch (FileNotFoundException ex) { //ilaria e nicolo del futuro : aggiungiungete eccezioni personalizzate ->> fatelo negri di merda so che non lo vorrete fare
            System.err.println(ex);
            return false;
        } catch (IOException ex2) {
            System.err.println(ex2);
            return false;
        }

        return true;
    }

    public boolean letturaIscAppello(String fn) {

        String linea;

        String ch = ";";
        try {
            File file = new File("cartellaCSV/" + fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while ((linea = br.readLine()) != null) {

                String[] data = linea.split(ch);

                String IdAppelloIsc = data[0];
                String Matr = data[1];

                elencoIscAppelli.add(new IscrizioneAppello(IdAppelloIsc, Matr));

            }

        } catch (FileNotFoundException ex) { //ilaria e nicolo del futuro : aggiungiungete eccezioni personalizzate ->> fatelo negri di merda so che non lo vorrete fare
            System.err.println(ex);
            return false;
        } catch (IOException ex2) {
            System.err.println(ex2);
            return false;
        }

        return true;
    }

    public String toStringStudente() {

        String tmp = "";

        for (Studente j : elencoStudenti) {

            tmp += j.getNome() + ";" + j.getCognome() + ";" + j.getMatricola() + ";" + j.getCodice() + "\n";
        }
        return tmp;
    }

    public String toStringDocente() {

        String tmp = "";

        for (Docente j : elencoDocenti) {

            tmp += j.getNome() + ";" + j.getCognome() + ";" + j.getMatricola() + ";" + j.getDisciplina() + "\n";
        }
        return tmp;
    }

    public String toStringDisciplina() {

        String tmp = "";

        for (Disciplina j : elencoDiscipline) {

            tmp += j.getCodiceDisciplina() + ";" + j.getNome() + ";" + j.getCfu() + ";" + j.getCodice() + "\n";
        }
        return tmp;
    }

    public String toStringCorso() {

        String tmp = "";

        for (Corso j : elencoCorsi) {

            tmp += j.getCodiceCorso() + ";" + j.getNome() + ";" + j.getDurata() + "\n";
        }
        return tmp;
    }

    public String toStringAppello() {

        String tmp = "";

        for (Appello j : elencoAppelli) {

            tmp += j.getIdAppello() + ";" + j.getData() + ";" + j.getCodiceDisciplina() + "\n";
        }
        return tmp;
    }

    public String toStringIscAppello() {

        String tmp = "";

        for (IscrizioneAppello j : elencoIscAppelli) {

            tmp += j.getIdAppelloIsc() + ";" + j.getMatricolaS() + "\n";
        }
        return tmp;
    }

    public ArrayList<Disciplina> getDisciplinePerCorso(String codiceCorso) {
        for (Corso c : elencoCorsi) {
            if (c.getCodiceCorso().equals(codiceCorso)) {
                return c.getDiscipline();
            }
        }
        return null; // oppure null se non c'è
    }

    public void stampaStudentiPerCorso() {
        for (Corso corso : elencoCorsi) {
            System.out.println("Corso: " + corso.getNome() + " (" + corso.getCodiceCorso() + ")");
            ArrayList<Studente> studenti = corso.getStudentiCorso();
            if (studenti.isEmpty()) {
                System.out.println("  Nessuno studente iscritto.");
            } else {
                for (Studente s : studenti) {
                    System.out.println("  - " + s.getNome() + " " + s.getCognome() + " (Matricola: " + s.getMatricola() + ")");
                }
            }
        }
    }
}
