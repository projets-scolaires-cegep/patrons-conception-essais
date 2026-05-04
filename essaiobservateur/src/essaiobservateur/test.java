package essaiobservateur;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		observable n1=new nombre(81);
		
		observateur special= new ProfDeMath("richard");
		observateur passpecial= new ProfDeMath("pasrichard");
		n1.inscrire(special);
		n1.inscrire(passpecial);
		
		((nombre) n1).carreparfait();
		
		((nombre) n1).setNombre(53);
		
		((nombre) n1).carreparfait();
	}

}
