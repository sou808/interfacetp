package tpinter;

public class critereMarque implements critere {
    private String marque;

    public CritereMarque(String marque) {
        this.marque = marque;
    }

    public boolean estSatisfaitPar(voiture v) {
        return v.getMarque().equalsIgnoreCase(marque);
    }
}
