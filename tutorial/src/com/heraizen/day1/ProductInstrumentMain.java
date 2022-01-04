package com.heraizen.day1;

public class ProductInstrumentMain {

	public static void main(String[] args) {
		
	 ProductInstrument laptop = new ProductInstrument(100, "Sony", 8500);
	 ProductInstrument desktop = new ProductInstrument(100, "Sony", 35000);
	 System.out.println("Before Swapping price is ");
     System.out.println("laptop Price : "+laptop.price);
     System.out.println("Desktop Price : "+desktop.price);
     System.out.println("\n------------------------------------\n");
	 swap(laptop,desktop);
     System.out.println("After Swapping price is ");
     System.out.println("laptop Price : "+laptop.price);
     System.out.println("Desktop Price : "+desktop.price);
	}
	
	public static void swap(ProductInstrument laptop, ProductInstrument desktop) {
		
		int tempPrice =laptop.price;
		laptop.price = desktop.price;
		desktop.price = tempPrice;
	}

}
