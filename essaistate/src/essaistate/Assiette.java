package essaistate;

public class Assiette {

	int nourriture;
	private EtatAssiette etat;

	public Assiette(int nourriture, EtatAssiette etat) {
		this.nourriture = nourriture;
		this.etat = etat;
	}

	void setEtat(EtatAssiette etat) {
		this.etat = etat;
	}

	EtatAssiette getEtat() {
		return this.etat;
	}

	void menoum(float nourriture) {
		if (etat != null) {
			etat.menoum(this, nourriture);
		}
	}

	void laver() {
		if (etat != null) {
			etat.laver(this);
		}
	}

	void jeter(float nourriture) {
		if (etat != null) {
			etat.jeter(this, nourriture);
		}
	}

	void remplir(float nourriture) {
		if (etat != null) {
			etat.remplir(this, nourriture);
		}
	}
}