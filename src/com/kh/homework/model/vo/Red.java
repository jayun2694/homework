package com.kh.homework.model.vo;

public class Red extends Balloon {

	public Red(int hp, int exp, String color ) {
		super(hp, exp, color);
	}
	
	@Override
	public void sound() {
		System.out.println("빨간 풍선이 펑하고 터집니다.");
	}
	
	public void hitRed() {
		System.out.println("빨간풍선의  hp가 50만큼 감소합니다.");
		super.setHp(super.getHp() - 50);
		
		if(super.getHp() <= 0) {
			System.out.println("빨간풍선이 터졌습니다. 경험치" + super.getExp() + "얻습니다.");
		}
	}
}
