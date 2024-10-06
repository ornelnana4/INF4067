package factory;
import produit.*;


public class ProduitFactoryconcrete3 extends ProduitFactoryabstraite{

    protected ProduitA createProduitA() {
        return new ProduitA3();
    }
    
}
