package essaistrategy;

import java.util.ArrayList;

public class test {
	
	public static void main(String[] args) {
	Chose tel=new Chose("telephone",5f);
	Chose or=new Chose("oreiller",20f);
	
	ArrayList<Chose> liste= new ArrayList<Chose>();
	liste.add(tel);
	liste.add(or);
	
	affichage a=new affichage();
	
	a.setCompte(new Comptekg());
	a.afficherTotal(liste);
	
	a.setCompte(new Comptelb());
	a.afficherTotal(liste);
	}
}
