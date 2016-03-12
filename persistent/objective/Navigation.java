package objective;

/**
 * Classe Navigation utilisée par ObjectiveFacade dans la méthode isNear(Objective,Knight)
 * on la définit ici
 * @author Laure
 *
 */

//TO DO :
// méthode isNear(Objective,Knight)

public class Navigation {

    /**
     * constructeur
     */
    public Navigation(){
    }

    /**
     * méthode isNear qui calcule la distance entre la position du knight et la position de l'objective
     * et indique si elle est inférieure à 3 mètres
     * @param obj
     * @param knight
     * @return Boolean
     */
    public boolean isNear(Objective obj, float knightLatitude, float knightLongitude){
        float objLatitude = obj.getPlaceLatitude();
        float objLongitude = obj.getPlaceLongitude();
        double distObjKnight = Math.acos(Math.sin(objLatitude)*Math.sin(knightLatitude) + Math.cos(objLatitude)*Math.cos(knightLatitude)*Math.cos(knightLongitude-objLongitude));
        return (distObjKnight<=3.0);
    }
}