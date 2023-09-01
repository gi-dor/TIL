package day15.연습문제;

public class day230321_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("연습문제 6-1");
			System.out.println("연습문제 6-2");
			
			SutdaCard card1 = new SutdaCard(3,false);
			SutdaCard card2 = new SutdaCard();
					System.out.println(card1.info());
					System.out.println(card2.info());
	}

}

class SutdaCard{
	int num ;
	boolean isKwang;

	
	SutdaCard(){
		this(1,true);
	}
	
	SutdaCard(int num , boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		if( isKwang==true) {
			return num+ "k";
		}else {
			return num+" ";
		}
	}
	
}