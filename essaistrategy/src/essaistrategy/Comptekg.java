package essaistrategy;

import java.util.ArrayList;

public class Comptekg implements Compte{

	@Override
	public void calcul(ArrayList<Chose> choses) {
		// TODO Auto-generated method stub
		float sum = 0f;
		for(Chose c:choses) {
			sum+=c.masse;
		}
		System.out.println("La masses du/des objet(s) est de "+String.valueOf(sum)+" kg");
	}

}
