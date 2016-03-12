package minigame;



public class BrutEnigma extends Enigma {
	public BrutEnigma(String name) {
		switch(name) {
		case "Place Marcou":
			this.question="Des chevaliers cathares souhaitent organiser une réunion secrète. "
					+ "Pour éviter l'intrusion de traîtres, ils créent le mot de passe suivant : IRGHTDQIR."
					+ "Quel moyen ont-ils trouvé pour le mémoriser, et quel est la signification de ce code ?"
					+ "(Indice : dites le à haute voix)";
			this.answer="Hier, j’ai acheté des cuillères";
			break;
		case "Vieux Puits":
			this.question="La cité de Carcassonne posséde de très nombreuses tour, "
					+ "pour des usages très différents, certaines ont pu servir de citernes d’eau "
					+ "ou encore de caveaux pour les provisions. Mais connaissez vous le nombre exact de ces tours ? "
					+ "Si vous ne savez pas, pourquoi n'iriez vous pas sur la place Marcou, demander aux troubadours si ils savent ?";
			this.answer="52";
			break;
		case "Chateau Comtal":
			this.question="Quel est le nom de la plus haute tour du chateau et l’une des rares tours carrées. "
					+ "C'est un symbole de la puissance seigneuriale, qui dominant le pays, "
					+ "permet d'assurer la surveillance des environs.?";
			this.answer="La tour pinte";
			break;
		case "Porte Narbonaise":
			this.question="Une légende raconte que lors d’un siège de Carcassonne, les habitants n’ayant plus de vivres, "
					+ "une personne a décidé de piéger les assiégeants en gavant un cochon et "
					+ "en l’envoyer dans le camp des assiégeants. "
					+ "Croyant que la cité avait encore de la nourriture à profusion ils abandonnent le siége. "
					+ "Quel est le nom de cette personne emblématique qui a donné son nom à la cité ? ";
			this.answer="Dame Carcas";
			break;
		case "Basilique":
			this.question="Combien y a t’il d’épitaphes gravés dans la basilique St-Nazaire ?"
					+ "(Un épitaphe gravé est généralement placé sur une tombe scellée)";
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
