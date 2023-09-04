package weekend;

class Card {
	String kind;
	int number;
	
	Card(){
		this("SPADE",1);
	}
	
	Card(String kind , int number){
		this.kind = kind;
		this.number = number;
	}

}

public class day230408_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제 9-4 toString()
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		//weekend.Card@5594a1b5
		//weekend.Card@6a5fc7f7
	}

}
