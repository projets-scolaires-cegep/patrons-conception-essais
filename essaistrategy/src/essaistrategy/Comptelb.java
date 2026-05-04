package essaistrategy;

import java.util.ArrayList;

public class Comptelb implements Compte{

	@Override
	public void calcul(ArrayList<Chose> choses) {
		// TODO Auto-generated method stub
		float sum = 0f;
		for(Chose c:choses) {
			sum+=(c.masse*2.205);
		}
		System.out.println("La masses du/des objet(s) est de "+String.valueOf(sum)+" kg");
	}

}
