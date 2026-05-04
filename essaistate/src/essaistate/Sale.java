package essaistate;

public class Sale extends EtatAssiette {

	@Override
	void menoum(Assiette assiette, float nourriture) {
		System.out.println("Ark. assiette sale.");
	}

	@Override
	void laver(Assiette assiette) {
		System.out.println("assiette lavée");
		assiette.setEtat(new Propre());
	}

	@Override
	void jeter(Assiette assiette, float nourriture) {

		if (nourriture <= 0) {
			System.out.println("rien à jeter");
			return;
		}

		System.out.println("il n'y a rien à jeter");
	}

	@Override
	void remplir(Assiette assiette, float nourriture) {
		System.out.println("impossible, assiette sale");
	}
}