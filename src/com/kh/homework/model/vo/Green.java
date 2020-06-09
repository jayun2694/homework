package com.kh.homework.model.vo;

public class Green extends Balloon {
	
	public Green(int hp, int exp, String color ) {
		super(hp, exp, color);
	}
	
	
	@Override
	public void sound() {
		System.out.println("�ʷ� ǳ���� �� �ϰ� �����ϴ�.");
	}
	
	public void hitGreen() {
		System.out.println("�ʷ�ǳ����  hp�� 30��ŭ �����մϴ�.");
		super.setHp(super.getHp() - 30 );
		
		if(super.getHp() <= 0) {
			System.out.println("�ʷ�ǳ���� �������ϴ�. ����ġ" + super.getExp() + "����ϴ�.");
		}
	}
}
