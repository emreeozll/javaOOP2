package classesWithAttributes;

public class Product {
	
	
	private int id;
	private String name;
	private String description;
	private int price;
	private int stockAmount;
	private String productCode;
	
	
	// sabit bir nesne olusuturuyor, new yazmak yerine otomatik uretıyor. Bu arada new'lemek pahalidir!!!
	public Product() {
		
		super();
	}
	
	// Constructor - Kurucu Metod
	public Product(int id,String name, String description, int price, int stockAmount) {
		
		System.out.println("Yapici Blok Calisti\n");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount= stockAmount;
		
	}
	
	public int getId() {
		
		return id;
	}
	
	public void setId(int id) {
		
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStockDiscount() {
		return stockAmount;
	}

	public void setStockDiscount(int stockDiscount) {
		this.stockAmount = stockDiscount;
	}
//Degeri sadece okuyacagız ama set duzenleme yapamacagız
	public String getProductCode() {
		return this.name.substring(0,1)+ id ;
	}

	
	
	

}
