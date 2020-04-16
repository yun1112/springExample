package fruit3;

public class FruitMain {

	public static void main(String[] args) {
		FruitBuyer buyer = new FruitBuyer();
		FruitSeller seller = new FruitSeller();
		System.out.println("구매자가 " + buyer.myMoney + "원을 지불해서 사과를 구매했습니다.");
		System.out.println("판매자의 판매 정보 출력");
		System.out.println("현재 사과의 개수: "+seller.saleApple(5000));
		System.out.println("판매 금액: "+seller.price);
		System.out.println("-------------------------------------");
		System.out.println("구매자의 구매 정보 출력");
		System.out.println("현재 보유한 금액: "+buyer.buyApple(seller, 500));
		System.out.println("보유한 사과의 개수: "+buyer.numOfApple);
	}

}
