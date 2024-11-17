package tpinter;

public class voiture {
    private String marque;
    private String modele;
    private int annee;
    private int prixloc;

    public voiture(String marque, String modele, int annee, int prixloc) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prixloc = prixloc;
    }
    public String toString() {
        return "Marque: " + marque + ", Modele: " + modele + ", Prix par jour: " + prixloc ;
    }
    
    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getAnnee() {
        return annee;
    }

    public int getPrixloc() {
        return prixloc;
    }

   
}






