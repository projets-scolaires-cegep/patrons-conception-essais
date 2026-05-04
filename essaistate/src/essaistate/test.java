package essaistate;

public class test {

	static void check(Assiette a) {
		System.out.println("Nourriture = " + a.nourriture);
		System.out.println("Etat = " + a.getEtat());
		System.out.println("----------");
	}

	public static void main(String[] args) {

		Assiette cool = new Assiette(0, new Propre());

		System.out.println("Etat initial");
		check(cool);

		System.out.println("Remplir assiette propre");
		cool.remplir(50);
		check(cool);

		System.out.println("Manger une partie");
		cool.menoum(20);
		check(cool);

		System.out.println("Jeter un peu");
		cool.jeter(10);
		check(cool);

		System.out.println("Finir toute la nourriture");
		cool.menoum(40);
		check(cool);

		System.out.println("Essayer manger sur sale");
		cool.menoum(5);
		check(cool);

		System.out.println("Essayer remplir sale");
		cool.remplir(30);
		check(cool);

		System.out.println("Laver assiette");
		cool.laver();
		check(cool);

		System.out.println("Remplir après lavage");
		cool.remplir(100);
		check(cool);

		System.out.println("Jeter trop");
		cool.jeter(150);
		check(cool);

		System.out.println("Menoum négatif");
		cool.menoum(-10);
		check(cool);

	}
}