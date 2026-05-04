package essaitemplate;

public class MangerSoupe extends mettreTable{

	@Override
	void placerNappe() {
		// TODO Auto-generated method stub
		System.out.println("Nappe absorbante à soupe placée");
	}

	@Override
	void placerCouvert(int personnes) {
		// TODO Auto-generated method stub
		System.out.println(personnes+" bols à soupes placés");
		
	}

	@Override
	void placerUstensils(int personnes) {
		// TODO Auto-generated method stub
		System.out.println(personnes+" cuillères à soupes placés");
		
	}

}
