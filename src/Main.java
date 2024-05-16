public  class Main {

    // OOP -> Object oriented Programming
    // Erişim bildirgeçleri

    // public , private , static
    // public: her yerden erişilebilir
    // private : sadece class içerisinde kullanılan bir erişim bildirgeçidir.
    // static : bir özellik ya da bir metodun sınıftan bağımsız olarak çalışmasını sağlar.
    public static void main(String[] args) {
/*      Product product = new Product("Monster Abra",25000,36,"Bilgisayar");
      Product product1 = new Product("Samsung s22",35000,36,"Telefon");
      Product product2 = new Product("İphone 14",45000,36,"Telefon");*/
      Product product3 = new Product();
      product3.setProductName("Monster Pusat Business Pro");
      product3.setStock(250);
      product3.setPrice(2000);
      product3.setCategory("Klavye");

      ProductManager manager = new ProductManager();
      manager.add(product3);
      manager.delete(product3);

/*      product.productName = "Msi Bravo 15";
      product.price = 37000;
      product.stock = 254;
      product.category = "Bilgisayar";*/
     // product.ekranaYazdir();

      //Product.merhabaDe();

      //1. Yöntem
      //  System.out.println(product);


        // constructor : bir sınıf bellekte oluşturulur oluşturulmaz ilk çalışan kod bloğudur.
        // encapsulation : kapsulleme
    }

}


