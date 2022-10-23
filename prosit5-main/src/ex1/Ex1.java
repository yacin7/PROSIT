/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import tn.tuniprod.gestionmagasin.Caissier;
import tn.tuniprod.gestionmagasin.Magasin;
import tn.tuniprod.gestionmagasin.Responsable;
import tn.tuniprod.gestionmagasin.Vendeur;
import tn.tuniprod.gestionmagasin.Employe;
import tn.tuniprod.gestionmagasin.ProduitFruits;
import tn.tuniprod.gestionmagasin.ProduitLegumes;

/**
 *
 * @author Mon Pc
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     *///1
    public static void main(String[] args) {
       Produit p =new Produit();
       Produit p1 =new Produit(1021,"lait","delice");
       Produit p2 =new Produit(2510,"yaourt","vitalait");
       Produit p3 =new Produit(3250,"tomate","sicam",1.2f);
       
       p1.prix=0.7f;
       p.afficher();
          System.out.println("**********************************");
       p3.afficher();
           System.out.println("**********************************");
       p1.afficher();
           System.out.println("**********************************");
       p2.afficher();
       
       
           System.out.println("**********************************");
           System.out.println(p1.toString());
           p.date_expiration=new Date();
           p1.date_expiration=new Date(122,5,6);
           p2.date_expiration=new Date(122,3,2);
           
        SimpleDateFormat x = new SimpleDateFormat("dd/MM/yyyy")
           ;
        try{
            Date exp = x.parse("02/04/2022");
            System.out.println("********************");
            System.out.println(exp);
            System.out.println("********************");
            
        }catch (ParseException e){
           
    }
        Magasin aziza =  new Magasin(1,"Esprit");
        aziza.ajouterProduit(p);
        aziza.ajouterProduit(p2);
        aziza.ajouterProduit(p3);
        aziza.ajouterProduit(p1);
      
        
 p1.comparer(p3);
 aziza.comparer(p, p1);
 
 //
//        //---------------------------
        Magasin carrefour = new Magasin(1, "Carrefour", "Centre-ville");
        Magasin monoprix = new Magasin(2, "Monoprix", "Menzah6");


//magasin 1 
      /*  Caissier caissierC1 = new Caissier(5, 123456, "Ariana", "Mahamed", 36);
        Caissier caissierC2 = new Caissier(2, 894679, "Tunis", "Ali", 40);
        Vendeur vendeurC1 = new Vendeur(10, 849895, "Charguia", "Nihel", 50);
        Responsable responsableC1 = new Responsable(500, 6889566, "Raoued", "taheni", 52);

//magasin 2 
        Caissier caissierM1 = new Caissier(9, 48912, "Tunis", "Kais", 42);
        Vendeur vendeurM1 = new Vendeur(15, 9485632, "Bizerte", "Ahmed", 15);
        Vendeur vendeurM2 = new Vendeur(20, 2584122, "Ariana", "Mohamed", 33);
        Vendeur vendeurM3 = new Vendeur(55, 2002558, "Manouba", "Firas", 22);
        Responsable responsableM1 = new Responsable(1500, 9821421, "Ghazela", "Mouhaned", 170);
        System.out.println("SALAIRE :"+responsableM1.getSalaireEmploye());

//ajout dans magasin 1 
        carrefour.ajouterEmploye(caissierC1);
        carrefour.ajouterEmploye(caissierC2);
        carrefour.ajouterEmploye(vendeurC1);
        carrefour.ajouterEmploye(responsableC1);

//ajout dans magasin 2

        monoprix.ajouterEmploye(caissierM1);
        monoprix.ajouterEmploye(vendeurM1);
        monoprix.ajouterEmploye(vendeurM2);
        monoprix.ajouterEmploye(vendeurM3);
        monoprix.ajouterEmploye(responsableM1);
//        System.out.println("-------------");
        monoprix.afficherEmployes();
//        System.out.println("-------------");
        carrefour.afficherEmployes();

        monoprix.ajouterProduit(produit2);
        monoprix.ajouterProduit(produit3);
        carrefour.ajouterProduit(produit3);
        carrefour.ajouterProduit(produit4);
        System.out.println("-------------");
        System.out.println(monoprix);
        System.out.println("-------------");
        System.out.println(carrefour);*/

// fruits et legumes
        ProduitFruits prod1 = new ProduitFruits(12.3f, "mars", 1254, "Fraise", "", 0);
        ProduitFruits prod2 = new ProduitFruits(50f, "juin", 1224, "Pastèque", "", 0);
        ProduitFruits prod3 = new ProduitFruits(25.6f, "décembre", 7896, "Mandarine", "", 0);
        ProduitLegumes prod4 = new ProduitLegumes(14f, "janvier", 8521, "Artichauts", "", 0);

        carrefour.ajouterProduit(prod1);
        carrefour.ajouterProduit(prod2);
        carrefour.ajouterProduit(prod3);
        carrefour.ajouterProduit(prod4);
        
        System.out.println("LE PRODUIT EST FRAIS : "+prod4.estFrais("février"));
        

        System.out.println("LE TOTAL DES FRUITS :" + carrefour.calculStock());

    }

}