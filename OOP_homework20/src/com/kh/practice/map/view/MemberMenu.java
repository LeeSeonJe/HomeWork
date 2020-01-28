package com.kh.practice.map.view;

import java.util.Scanner;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();

	public void mainMenu() {
		System.out.println("******* ���� �޴� *******");
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		System.out.println("3. ���� �̸� ȸ�� ã��");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ  >>");
		int input = sc.nextInt();
		if (input == 1) {
			joinMembership();
		} else if (input == 2) {
			login();
		} else if (input == 3) {
			sameName();
		} else if (input == 9) {
			System.out.println("���α׷� ����");
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
		}
	}

	public void joinMembership() {
		sc.nextLine();
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		mc.joinMembership(id, new Member(password, name));
	}

	public void login() {

	}

	public void sameName() {

	}

}
