package essaistrategy;

import java.util.ArrayList;

public class affichage {

	private Compte compte;
	
	void setCompte(Compte compte) {
		this.compte=compte;
	}
	
	void afficherTotal(ArrayList<Chose> choses) {
		compte.calcul(choses);
	}
}
