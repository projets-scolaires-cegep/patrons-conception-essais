package essaistate;

public class Propre extends EtatAssiette {

	@Override
	void menoum(Assiette assiette, float nourriture) {
		System.out.println("assiette vide");
	}

	@Override
	void laver(Assiette assiette) {
		System.out.println("assiette déjà propre");
	}

	@Override
	void jeter(Assiette assiette, float nourriture) {

		if (nourriture <= 0) {
			System.out.println("valeur invalide");
			return;
		}

		System.out.println("assiette vide");
	}

	@Override
	void remplir(Assiette assiette, float nourriture) {

		if (nourriture <= 0) {
			System.out.println("la nourriture negative n'existe pas");
			return;
		}

		assiette.nourriture += nourriture;
		assiette.setEtat(new AvecNourriture());

		System.out.println("remplissage de l'assiette");
	}
}