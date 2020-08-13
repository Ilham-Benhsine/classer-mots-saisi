import java.util.Scanner;

public class triMots {

	public static void main(String[] args) {
		// Faire un algorithme qui demande de saisir trois mots à l’utilisateur et qui
		// les affiche ensuite dans l’ordre alphabétique

		Scanner sc = new Scanner(System.in);
		
		// Définir taille de la liste des mots à classer, ici 3
		String mots[] = new String[3];
		boolean melanger = true;
		
		// Saisi des mots à classer
		for (int i = 0; i <= 2; i++) {
			System.out.println("Veuillez saisir votre mots\n");
			mots[i] = sc.next();
		}

		// Trier les mots
		while (melanger) {
			for (int i = 0; i < mots.length - 1; i++) {
				int test = mots[i].compareTo(mots[i + 1]);
				if (test > 0) {
					String mot = mots[i];
					mots[i] = mots[i + 1];
					mots[i + 1] = mot;
					melanger = true;
				} else {
					melanger = false;
				}
			}
		}

		System.out.println("afficher tableau /n");
		for (int i = 0; i < mots.length; i++) {

			System.out.println(mots[i]);
		}
	}
}