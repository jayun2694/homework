package com.kh.homework.model.vo;

public class Green extends Balloon {
	
	public Green(int hp, int exp, String color ) {
		super(hp, exp, color);
	}
	
	
	@Override
	public void sound() {
		System.out.println("초록 풍선이 펑 하고 터집니다.");
	}
	
	public void hitGreen() {
		System.out.println("초록풍선의  hp가 30만큼 감소합니다.");
		super.setHp(super.getHp() - 30 );
		
		if(super.getHp() <= 0) {
			System.out.println("초록풍선이 터졌습니다. 경험치" + super.getExp() + "얻습니다.");
		}
	}
}
