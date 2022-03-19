package pl.pjatk.javamarkt;

public class CartService {
    public Product getCheapestOne(Product[] products){
        Product temporaryProduct = new Product();
        temporaryProduct.setPrice(9999);
        for (Product product : products){
            if(product.getPrice() <= temporaryProduct.getPrice()){
                temporaryProduct = product;
            }
        }
        return temporaryProduct;
    }
    public Product getExprensiveOne(Product[] products){

    }
    public Product[] sortProductsByName(Product[] products){

    }
    public Product[] sortProductsByPrice(Product[] products){

    }
    public Double getSumOfCart(Cart cart){

    }
}
