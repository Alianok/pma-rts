package jeu;

import madkit.kernel.AbstractAgent;

/**
* Cette classe definis les caracteristiques globale des Objets place sur la carte
* (Cordonnee x,y , vie , resistance ...)
*
* @author fayej, powlpy
* @version 1.0
*/


public class ObjectMap extends AbstractAgent { 
	
	protected Coord coord;
	protected Environnement env;
	public Alignement al;
    
    /**
     * getter de coord
     * @return coord
     */
    public Coord getCoord (){
            return this.coord;
    }
    
    
    public void activationgeneral(){
    	requestRole(Societe.SOCIETE , Societe.SIMU , Societe.OBJECTMAP);
    }

}