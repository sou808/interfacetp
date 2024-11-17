package tpinter;

public class agence {
	 private voiture[] voitures;
	    private static int nbrV = 0;
	

	    public agence(int max) {
	        voitures=(new voiture[max]);
	    }


public void afficheSelection(critere c) {
	  for (int i = 0; i < nbrV; i++) {
	        if (c.estSatisfaitPar(voitures[i])) {
	            System.out.println(voitures[i]);
	        }
	    }
	}
public void ajout(voiture voiture) {
    if (nbrV < voitures.length) {
        voitures[nbrV] = voiture;
        nbrV++;
    } else {
        System.out.println("stockage insuffisant");
    }}}


