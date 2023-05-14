package section11.access2;

public class PantsClothesCategory extends ClothesCategory{

	public String pantsClothesKind;
	
	public PantsClothesCategory(String pantsClothesKind) {
		super.clothesKind = "하의";
		this.pantsClothesKind = pantsClothesKind; //값 직접 입력 해야됨 Polymorphism03
		super.discountRate = 0.3; //30% 할인
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("의류 종류: " + clothesKind);
		System.out.println("하의 종류: " + pantsClothesKind);
	}
	
	public void belt() {
		System.out.println("belt를 사은품으로 드려요.");
	}
}
