package essaiobservateur;

public interface observable {

	void notifyevery();
	void inscrire(observateur o);
	void desinscrire(observateur o);
}
