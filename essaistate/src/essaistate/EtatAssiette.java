package essaistate;

public abstract class EtatAssiette {
		
	void menoum(Assiette assiette,float nourriture) {};
	void laver(Assiette assiette) {};
	void jeter (Assiette assiette, float nourriture) {};
	void remplir(Assiette assiette, float nourriture) {};

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
