import produit.*;
import factory.*;

public class Client {
    public static void main(String[] args) {
        ProduitFactoryabstraite produitFactoryabstraite1 = new ProduitFactoryconcrete1();
        ProduitFactoryabstraite produitFactoryabstraite2 = new ProduitFactoryconcrete2();
        ProduitFactoryabstraite produitFactoryabstraite3 = new ProduitFactoryconcrete3();

        ProduitA produitA = null;

        System.out.println("Utilisation de la première fabrique");
        produitA = produitFactoryabstraite1.getProduitA();
        produitA.methodeA();

        System.out.println("Utilisation de la deuxième fabrique");
        produitA = produitFactoryabstraite2.getProduitA();
        produitA.methodeA();

        System.out.println("Utilisation de la troisième fabrique");
        produitA = produitFactoryabstraite3.getProduitA();
        produitA.methodeA();
    }
}
