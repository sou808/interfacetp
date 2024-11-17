package tpinter;

public class crimarque  implements critere {
	    private String marque;
public void Crimarque (String marque) {
	            this.marque = marque;
	        }
public boolean estSatisfaitPar(voiture v) {
	          return v.getMarque().equals(marque);
	        }
	    }

