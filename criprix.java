package tpinter;

public class criprix  implements critere {
	    private int prixloc;
public  criprix (int prixloc) {
	            this.prixloc = prixloc;
	        }
public boolean estSatisfaitPar(voiture v) {
	          return v.getPrixloc()<(prixloc);
	        }
	    }

