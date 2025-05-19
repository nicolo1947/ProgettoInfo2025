package model;

public class Appello {
    private String IdAppello;
    private String data;
    private String codiceDisciplina;

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
    
     @Override
    public String toString() {
        return "IdAppello:" + IdAppello + "; " + "data:" + data + "; " + "codiceDisciplina:" + codiceDisciplina;
    }
}
