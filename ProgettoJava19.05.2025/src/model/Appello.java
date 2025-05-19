package model;

import java.util.ArrayList;

public class Appello {
    private String IdAppello;
    private String data;
    private String codiceDisciplina;
    private ArrayList <Studente> iscritti = new ArrayList();
    
    
    public Appello(String IdAppello, String data, String codiceDisciplina) {
        this.IdAppello = IdAppello;
        this.data = data;
        this.codiceDisciplina = codiceDisciplina;
    }

    public String getIdAppello() {
        return IdAppello;
    }

    public String getData() {
        return data;
    }

    public String getCodiceDisciplina() {
        return codiceDisciplina;
    }

    public void setIdAppello(String IdAppello) {
        this.IdAppello = IdAppello;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setCodiceDisciplina(String codiceDisciplina) {
        this.codiceDisciplina = codiceDisciplina;
    }

    public ArrayList<Studente> getIscritti() {
        return iscritti;
    }
    
    
     @Override
    public String toString() {
        return "IdAppello:" + IdAppello + "; " + "data:" + data + "; " + "codiceDisciplina:" + codiceDisciplina;
    }
}
