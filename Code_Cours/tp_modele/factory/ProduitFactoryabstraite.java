//fabrique abstraite;
package factory;

import produit.ProduitA;

public abstract class ProduitFactoryabstraite {

    public ProduitA getProduitA() {
        return createProduitA();
    }

    protected abstract ProduitA createProduitA();
}