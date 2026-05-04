package essaistate;

public class AvecNourriture extends EtatAssiette {

	@Override
	void menoum(Assiette assiette, float nourriture) {

		if (nourriture <= 0) {
			System.out.println("la nourriture negative n'existe pas");
			return;
		}

		if (assiette.nourriture <= 0) {
			assiette.nourriture = 0;
			System.out.println("assiette vide");
			assiette.setEtat(new Sale());
			return;
		}

		assiette.nourriture -= nourriture;

		if (assiette.nourriture <= 0) {
			assiette.nourriture = 0;
			assiette.setEtat(new Sale());
			System.out.println("miam, assiette finie");
		} else {
			System.out.println("miam");
		}
	}

	@Override
	void laver(Assiette assiette) {

		if (assiette.nourriture > 0) {
			System.out.println("il y a encore de la nourriture");
		} else {
			System.out.println("assiette sale");
			assiette.setEtat(new Sale());
		}
	}

	@Override
	void jeter(Assiette assiette, float nourriture) {

		if (nourriture <= 0) {
			System.out.println("la nourriture negative n'existe pas");
			return;
		}

		if (assiette.nourriture <= 0) {
			System.out.println("il n'y a rien à jeter");
			return;
		}

		assiette.nourriture -= nourriture;

		if (assiette.nourriture <= 0) {
			assiette.nourriture = 0;
			assiette.setEtat(new Sale());
		}

		System.out.println("gaspilleur de nourriture");
	}

	@Override
	void remplir(Assiette assiette, float nourriture) {

		if (nourriture <= 0) {
			System.out.println("la nourriture negative n'existe pas");
			return;
		}

		if (assiette.getEtat() instanceof Sale) {
			System.out.println("impossible, assiette sale");
			return;
		}

		assiette.nourriture += nourriture;
		System.out.println("remplissage de l'assiette");

		if (assiette.nourriture > 0) {
			assiette.setEtat(new AvecNourriture());
		}
	}
}