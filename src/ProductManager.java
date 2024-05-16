// İş kuralları classı
public class ProductManager {
    private boolean checkProduct(Product product){
        if (product.getStock()<0){
            System.out.println("Ürünün stok değeri 0 dan küçük olamaz");
            return false;
        }

        if (product.getPrice()<0){
            System.out.println("Ürünün değeri 0 dan küçük olamaz");
            return false;
        }

        return true;
    }


    public void add(Product product){
        if (checkProduct(product)==false){
            System.out.println("veri tabanına ürün eklenemdi.");
        }
        else {
            System.out.println("veri tabanına ürün eklendi "+product);
        }
    }

    public void delete(Product product){
        System.out.println("ürün silindi. "+product.getProductName());
    }
}
