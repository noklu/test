package de.noklu.test;

//import java.math.BigInteger;;

public class Chu {

//	private BigInteger count;
	private double count2;
	private String name = "horst";
	private String test = "Freek";
	private long zeit;

	public String getTest() {
		return test;
	}

	public String getRandomString(int length) {

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < length; i++) {
			sb.append((char) ((int) (Math.random() * 90) + 33));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Chu chu = new Chu();
		chu.setCount2(1d);
		
		chu.setZeit(chu.gettime());
		

		while (!chu.getName().equals(chu.getTest())) {
			chu.setName(chu.getRandomString(5));
			chu.addCount2();
			
//			if ( chu.getCount2() > 5000000)
//				break;
			
//			System.out.println(chu.getCount2());
//			System.out.println(cha.getName());
		}
		System.out.println((chu.gettime()-chu.getZeit()));
		System.out.println(chu.getCount2());
		System.out.println(chu.getName());
	}
	
	public long gettime() //Methode für aktuelle Zeit in Millisekunden
	{
	return System.currentTimeMillis();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCount2() {
		return count2;
	}

	public void setCount2(double count) {
		this.count2 = count;
	}
	
	public void addCount2(){
		this.count2++;
	}
	
	public long getZeit() {
		return zeit;
	}

	public void setZeit(long zeit) {
		this.zeit = zeit;
	}
}