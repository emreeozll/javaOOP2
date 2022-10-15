package classesWithAttributes;

 

public class Main {

	public static void main(String[] args) {

		Product product = new Product(1,"Asus Laptop","8gb ram - 512 gb ssd - ryzen7",10000,45);

//		product.setId(1);
//		product.setName("Lenovo Laptop");
//		product.setDescription("8gb ram - 512 gb ssd - ryzen7");
//		product.setPrice(10000);
//		product.setStockAmount(45);


		
		
		
		ProductManager manager = new ProductManager();
		manager.add(product);
		
		System.out.println(product.getProductCode());

		
		
  }

}