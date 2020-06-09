package com.kh.homework.model.vo;

public class Blue extends Balloon {
	
	public Blue(int hp, int exp, String color) {
		super(hp, exp, color);
	}
	
	
	@Override
	public void sound() {
		System.out.println("�Ķ� ǳ���� �� �ϰ� �����ϴ�.");
	}
	
	public void hitBlue() {
		System.out.println("�Ķ�ǳ����  hp�� 10��ŭ �����մϴ�.");
		super.setHp(super.getHp() - 10 );
		
		if(super.getHp() <= 0) {
			System.out.println("�Ķ�ǳ���� �������ϴ�. ����ġ" + super.getExp() + "����ϴ�.");
		}
	}
}
