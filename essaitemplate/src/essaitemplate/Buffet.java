package essaitemplate;

public class Buffet extends mettreTable{

	@Override
	void placerNappe() {
		// TODO Auto-generated method stub
		System.out.println("Nappe de fiesta placée");
	}

	@Override
	void placerCouvert(int personnes) {
		// TODO Auto-generated method stub
		System.out.println(personnes+" bols et assiettes placés");	}

	@Override
	void placerUstensils(int personnes) {
		// TODO Auto-generated method stub
		System.out.println(personnes+" cuillères, fourchettes, couteaux et baguettes placés");
	}

}
