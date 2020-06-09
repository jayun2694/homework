package com.kh.homework.model.vo;

public class Blue extends Balloon {
	
	public Blue(int hp, int exp, String color) {
		super(hp, exp, color);
	}
	
	
	@Override
	public void sound() {
		System.out.println("파란 풍선이 펑 하고 터집니다.");
	}
	
	public void hitBlue() {
		System.out.println("파란풍선의  hp가 10만큼 감소합니다.");
		super.setHp(super.getHp() - 10 );
		
		if(super.getHp() <= 0) {
			System.out.println("파란풍선이 터졌습니다. 경험치" + super.getExp() + "얻습니다.");
		}
	}
}
