package zadaca_6;

public class Zadaca_6 {

	public static void main(String[] args) {
		String article1 = "чоколадо";
		String price1 = "50";
		String quantity = "5";
		String article2 = "сок";
		String price2 = "35";
		String unit = "денари";
		
		int priceChocholate = Integer.parseInt(price1) * Integer.parseInt(quantity);
		int priceJuice = Integer.parseInt(price2) * Integer.parseInt(quantity);
		int total = priceChocholate + priceJuice;
		
		System.out.println("Сметка:");
		System.out.println("Едно" + " " + article1 + "-" + " " + price1 + " " + unit + ".");
		System.out.println(price1 + "x" + quantity + "=" + priceChocholate );
		System.out.println("Еден" + " " + article2 + "-" + " " + price2 + " " + unit + ".");
		System.out.println(price2 + "x" + quantity + "=" + priceJuice);
		System.out.println("Вкупна цена: " + total);

	}

}
