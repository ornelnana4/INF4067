package factory;

import produit.ProduitA1;
import produit.ProduitA;

public class ProduitFactoryconcrete1 extends ProduitFactoryabstraite {

    protected ProduitA createProduitA() {
        return new ProduitA1();
    }
}
