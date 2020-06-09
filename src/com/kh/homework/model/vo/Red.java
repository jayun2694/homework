package com.kh.homework.model.vo;

public class Red extends Balloon {

	public Red(int hp, int exp, String color ) {
		super(hp, exp, color);
	}
	
	@Override
	public void sound() {
		System.out.println("���� ǳ���� ���ϰ� �����ϴ�.");
	}
	
	public void hitRed() {
		System.out.println("����ǳ����  hp�� 50��ŭ �����մϴ�.");
		super.setHp(super.getHp() - 50);
		
		if(super.getHp() <= 0) {
			System.out.println("����ǳ���� �������ϴ�. ����ġ" + super.getExp() + "����ϴ�.");
		}
	}
}
