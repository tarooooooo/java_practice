package chapter4;

public class output {
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ"));
		System.out.println(appleBasket.get().getName());
		
		appleBasket.replace(new Apple("紅玉"));
		System.out.println(appleBasket.get().getName());
	}
}
