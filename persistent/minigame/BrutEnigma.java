package minigame;



public class BrutEnigma extends Enigma {
	public BrutEnigma(String name) {
		switch(name) {
		case "Place Marcou":
			this.question="Des chevaliers cathares souhaitent organiser une r�union secr�te. "
					+ "Pour �viter l'intrusion de tra�tres, ils cr�ent le mot de passe suivant : IRGHTDQIR."
					+ "Quel moyen ont-ils trouv� pour le m�moriser, et quel est la signification de ce code ?"
					+ "(Indice : dites le � haute voix)";
			this.answer="Hier, j�ai achet� des cuill�res";
			break;
		case "Vieux Puits":
			this.question="La cit� de Carcassonne poss�de de tr�s nombreuses tour, "
					+ "pour des usages tr�s diff�rents, certaines ont pu servir de citernes d�eau "
					+ "ou encore de caveaux pour les provisions. Mais connaissez vous le nombre exact de ces tours ? "
					+ "Si vous ne savez pas, pourquoi n'iriez vous pas sur la place Marcou, demander aux troubadours si ils savent ?";
			this.answer="52";
			break;
		case "Chateau Comtal":
			this.question="Quel est le nom de la plus haute tour du chateau et l�une des rares tours carr�es. "
					+ "C'est un symbole de la puissance seigneuriale, qui dominant le pays, "
					+ "permet d'assurer la surveillance des environs.?";
			this.answer="La tour pinte";
			break;
		case "Porte Narbonaise":
			this.question="Une l�gende raconte que lors d�un si�ge de Carcassonne, les habitants n�ayant plus de vivres, "
					+ "une personne a d�cid� de pi�ger les assi�geants en gavant un cochon et "
					+ "en l�envoyer dans le camp des assi�geants. "
					+ "Croyant que la cit� avait encore de la nourriture � profusion ils abandonnent le si�ge. "
					+ "Quel est le nom de cette personne embl�matique qui a donn� son nom � la cit� ? ";
			this.answer="Dame Carcas";
			break;
		case "Basilique":
			this.question="Combien y a t�il d��pitaphes grav�s dans la basilique St-Nazaire ?"
					+ "(Un �pitaphe grav� est g�n�ralement plac� sur une tombe scell�e)";
			this.answer="4";
			break;
		default:
			break;
		}
	}
	
	@Override
	public String getQuestion() {
		return this.question;
	}

	@Override
	public String getAnswer() {
		return this.answer;
	}

}
