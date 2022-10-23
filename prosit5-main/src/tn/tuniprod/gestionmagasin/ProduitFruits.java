/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin;

/**
 *
 * @author Mon Pc
 */
public class ProduitFruits extends ProduitAgricole{
    
    public ProduitFruits(float quantite, String saison, int identifiant, String libelle, String marque, float prix) {
        super(quantite, saison, identifiant, libelle, marque, prix);
    }

    @Override
    public boolean estFrais(String saison) {
        return this.saison.equals(saison);
    }
    
}
