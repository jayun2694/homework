package com.kh.homework.controller;

import com.kh.homework.model.vo.Balloon;
import com.kh.homework.model.vo.Blue;
import com.kh.homework.model.vo.Green;
import com.kh.homework.model.vo.Player;
import com.kh.homework.model.vo.Red;

public class PlayerManager {

	public void startPlay(String name) {

		Player p = new Player(name);

		System.out.println(p.getName() + "´Ô²²¼­ µîÀåÇÏ¼Ì½À´Ï´Ù.");

		Balloon barr[] = new Balloon[3];

		barr[0] = new Blue(100, 10, "ÆÄ¶û");
		barr[1] = new Green(500, 30, "ÃÊ·Ï");
		barr[2] = new Red(1000, 50, "»¡°­");

		int random = (int) (Math.random() * 3);

		do {
			System.out.println(barr[random]);
			
			if (barr[random] instanceof Blue) {
				((Blue) barr[random]).hitBlue();

				for (int i = barr[random].getHp(); i > 0; i -= 10) {
					((Blue) barr[random]).hitBlue();
				}

			} else if (barr[random] instanceof Green) {

				for (int i = barr[random].getHp(); i > 0; i -= 50) {
					((Green) barr[random]).hitGreen();
				}

			} else if (barr[random] instanceof Red) {

				for (int i = barr[random].getHp(); i > 0; i -= 100) {
					((Red) barr[random]).hitRed();
				}

			}

			p.setExp(p.getExp() + barr[random].getExp());
		break;
			
		} while (true);
		System.out.println(p);
	}
}
