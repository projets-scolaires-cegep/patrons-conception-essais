package essaiobservateur;

public class ProfDeMath implements observateur{

	String nom;

	public ProfDeMath(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public void notifyme(String message) {
		// TODO Auto-generated method stub
		System.out.println("ProfDeMath du nom de "+String.valueOf(this.nom)+", "+message);
	}
	
	
}
