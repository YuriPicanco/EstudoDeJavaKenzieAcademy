package src.products;

import java.util.List;
import java.util.ArrayList;

import src.exceptions.negativePriceException;
import src.exceptions.notFoundException;


public class ProductController {

    private List<ProductModel> products = new ArrayList<>() ;

    public List<ProductModel> read() {
        products.forEach(System.out::println);
        return products;
    }

    public Integer retrievePrice(String barCode) throws notFoundException{        
        for(ProductModel product: products){
            if(product.getBarCode().equals(barCode))
                return product.getPriceInCents();
        }

        throw new notFoundException("Product '"+barCode+"' not found");
    }

    public String create(ProductModel payload) {
        try{
            if(payload.getPriceInCents() < 0) {
                throw new negativePriceException();
            }
            products.add(payload);
            return "Produto '"+payload.getName()+"' criado";
        }catch(negativePriceException e){
            System.out.println("Erro ao criar produto: "+e.getMessage());
        }
        return null;
    }
}
