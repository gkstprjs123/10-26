package com.human.ex;

public class Java006 {

	public static void main(String[] args) {
		java.util.Scanner scanner
		=new java.util.Scanner(System.in);
		int random=(int)(Math.random()*100)+1;
		boolean true1=true;
		int num2=0;
		while(true1){
			System.out.print("���ڸ� �����ּ���:");
			int num=Integer.parseInt(scanner.nextLine());
			if(num<random) {
				System.out.println("up");
				num2++;
			}else if(num>random) {
				System.out.println("down");
				num2++;
			}else if(num==random) {
				System.out.println("����!");
				true1=false;
			}
		}
		System.out.println("�� ����Ƚ��"+num2+"��");
		

	}

}
