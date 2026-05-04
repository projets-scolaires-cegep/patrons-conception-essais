package essaitemplate;

public abstract class mettreTable {
	
	private int nbpersonnes;

	private void placerTable() {System.out.println("Une table de taille normale placée");};
	abstract void placerNappe();
	abstract void placerCouvert(int personnes);
	abstract void placerUstensils(int personnes);
	
	void setnb(int nombre) {
		this.nbpersonnes=nombre;
	}
	
	final void mettreTabletemp() {
		
		placerTable();
		placerNappe();
		placerCouvert(this.nbpersonnes);
		placerUstensils(this.nbpersonnes);
		
	}
}
