package objective;

/**
 * Classe Navigation utilis�e par ObjectiveFacade dans la m�thode isNear(Objective,Knight)
 * on la d�finit ici
 * @author Laure
 *
 */

//TO DO :
// m�thode isNear(Objective,Knight) 

public class Navigation {
	
	/**
	 * constructeur
	 */
	public Navigation(){
	}

	/**
	 * m�thode isNear qui calcule la distance entre la position du knight et la position de l'objective 
	 * et indique si elle est inf�rieure � 3 m�tres
	 * @param obj
	 * @param knight
	 * @return Boolean
	 */
	public boolean isNear(Objective obj,Knight knight){
		float objLatitude = obj.getLatitude();
		float objLongitude = obj.getLongitude();
		float knightLatitude = knight.getLatitude();
		float knightLongitude = knight.getLongitude();
		double distObjKnight = Math.acos(Math.sin(objLatitude)*Math.sin(knightLatitude) + Math.cos(objLatitude)*Math.cos(knightLatitude)*Math.cos(knightLongitude-objLongitude));
		return (distObjKnight<=3.0);
	}
}
