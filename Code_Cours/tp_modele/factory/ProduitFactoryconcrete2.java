package factory;
import produit.*;

public class ProduitFactoryconcrete2 extends ProduitFactoryabstraite{

    protected ProduitA createProduitA() {
        return new ProduitA2();
    }
}
