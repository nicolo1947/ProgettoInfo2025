
package model;


public class IscrizioneAppello {

    private String idAppelloIsc;
    private String matricolaS;

    public IscrizioneAppello(String idAppelloIsc, String matricolaS) {
        this.idAppelloIsc = idAppelloIsc;
        this.matricolaS = matricolaS;
    }

    public String getIdAppelloIsc() {
        return idAppelloIsc;
    }

    public String getMatricolaS() {
        return matricolaS;
    }
    
    @Override
    public String toString() {
        return "idAppelloIsc:"+idAppelloIsc+ "; " + "matricolaS:"+ matricolaS;
    }
}
