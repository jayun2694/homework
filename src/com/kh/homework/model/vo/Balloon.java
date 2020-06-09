package com.kh.homework.model.vo;

public class Balloon {
	private int hp;
	private int exp;
	private String color;
	
	public Balloon() {
		
	}
	
	public Balloon(int hp, int exp, String color) {
		super();
		this.hp = hp;
		this.exp = exp;
		this.color = color;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void sound() {
		System.out.println("풍선이 펑하고 소리를 내며 터집니다.");
	}
	
}
