package essaiobservateur;

import java.util.ArrayList;

public class nombre implements observable{

	float nombre;
	ArrayList<observateur> obs;
	String heyoh;
	
	public nombre(float nombre) {
		super();
		this.nombre = nombre;
		this.obs = new ArrayList<observateur>();
	}
	
	void setNombre(float nombre) {this.nombre=nombre;}

	@Override
	public void notifyevery() {
		// TODO Auto-generated method stub
		for (observateur o:this.obs)
			o.notifyme(heyoh);
	}

	@Override
	public void inscrire(observateur o) {
		// TODO Auto-generated method stub
		this.obs.add(o);
		
	}

	@Override
	public void desinscrire(observateur o) {
		// TODO Auto-generated method stub
		for(observateur des:this.obs)
			if(des.equals(o))
				this.obs.remove(o);
	}
	
	void carreparfait() {
		float verif=(float) (Math.sqrt(this.nombre)%1);
		if (verif==0) {
			this.heyoh=this.nombre+" est un carré parfait! Yahoo!";
			this.notifyevery();
		}else {
			this.heyoh=this.nombre+" n'est pas un carré parfait! :(";
			this.notifyevery();
		}
				
		
	}
	
	
}
