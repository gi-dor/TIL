package weekend;

public class day230408_02_ch9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value(5);
		Value v2 = new Value(5);
		
		if(v1.equals(v2))
			System.out.println("v1 , v2는 같음");
		else	
			System.out.println("v1 , v2는 다름");
	}

}
class Value {
	int value ;
	Value (int value){ // 생성자
		this.value = value;
	}
	
	// Object의 equals()를 오버라이딩해서 주소가 아닌 value를 비교
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Value) ) {
			return true;
		}
		
		Value v = (Value)obj; 
		return this.value == v.value;
		// return this==obj;  // 주소비교 , 서로다른 객체는 항상 false
		
	}
}
