package weekend;

public class day230410_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기초편 예제 9 - 14 래퍼클래스
		
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i == i2 ? "+ (i==i2));
		System.out.println("i.eqauls(i2) ? "+ (i.equals(i2)));
		System.out.println("i.compareTo(i2) = "+i.compareTo(i2));
		System.out.println("i.toString() = "+i.toString());
	
		System.out.println("MAX_VALUE = " +Integer.MAX_VALUE);
		System.out.println("MIN_VALUE = "+Integer.MIN_VALUE);
		
		System.out.println("SIZE = "+Integer.SIZE+ " bits");
		System.out.println("BYTES = "+Integer.BYTES+ " bytes");
		
		
		System.out.println("TYPE = "+Integer.TYPE);
	}

}