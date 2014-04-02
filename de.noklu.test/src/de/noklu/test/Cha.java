package de.noklu.test;

import java.math.BigInteger;;

public class Cha {

	private BigInteger count;
	private String name = "horst";
	private String test = "David";
	private long zeit;
	private BigInteger stop;

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
		Cha cha = new Cha();
		cha.setCount(new BigInteger("1"));
	
		cha.setZeit(cha.gettime());

		while (!cha.getName().equals(cha.getTest())) {
			cha.setName(cha.getRandomString(5));
			cha.setCount(cha.getCount().add(BigInteger.ONE));
			cha.setStop(new BigInteger("5000000"));
			
//			System.out.println(cha.getCount().toString());
			
			if ( cha.getCount().equals(cha.getStop()))
				break;
//			System.out.println(cha.getName());
		}
		System.out.println((cha.gettime()-cha.getZeit()));
		System.out.println(cha.getCount());
		System.out.println(cha.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getCount() {
		return count;
	}

	public void setCount(BigInteger count) {
		this.count = count;
	}
	
	public long gettime() //Methode für aktuelle Zeit in Millisekunden
	{
	return System.currentTimeMillis();
	}

	public BigInteger getStop() {
		return stop;
	}

	public void setStop(BigInteger stop) {
		this.stop = stop;
	}

	public long getZeit() {
		return zeit;
	}

	public void setZeit(long zeit) {
		this.zeit = zeit;
	}
}