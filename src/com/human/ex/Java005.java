package com.human.ex;

public class Java005 {

	public static void main(String[] args) {
		java.util.Scanner scanner
		=new java.util.Scanner(System.in);
		boolean b=true;
		int sum=0;
			System.out.println("1.�ְ��� 2.���ı� 3.�߰��� 4.2�ϱ�");
			System.out.print("��� �����Ͻðڽ��ϱ�?");
			int aX=Integer.parseInt(scanner.nextLine());
			while(b) {
				System.out.println("�ο��� ����ּ���");
				System.out.print("1.���� 2.û�ҳ� 3.����/��� 4.���ó�");
				int bX=Integer.parseInt(scanner.nextLine());
				if(bX==1) {
					System.out.print("������ �ο����� �������ּ���:");
					int p=Integer.parseInt(scanner.nextLine());
					if(aX==1) {
						sum+=p*46000;
					}else if(aX==2) {
						sum+=p*38000;
					}else if(aX==3) {
						sum+=p*20000;
					}else if(aX==4) {
						sum+=p*74000;
					}
				}else if(bX==2) {
					System.out.print("û�ҳ��� �ο����� �������ּ���:");
					int p2=Integer.parseInt(scanner.nextLine());
					if(aX==1) {
						sum+=p2*39000;
					}else if(aX==2) {
						sum+=p2*32000;
					}else if(aX==3) {
						sum+=p2*17000;
					}else if(aX==4) {
						sum+=p2*62000;
					}
				}else if(bX==3) {
					System.out.print("����/����� �ο����� �������ּ���:");
					int p3=Integer.parseInt(scanner.nextLine());
					if(aX==1) {
						sum+=p3*36000;
					}else if(aX==2) {
						sum+=p3*29000;
					}else if(aX==3) {
						sum+=p3*16000;
					}else if(aX==4) {
						sum+=p3*58000;
					}
				}else if(bX==4) {
					b=false;
				}
			}
			System.out.print("�� �����Ͻ� �����:"+sum+"�� �Դϴ�.");
			
		

	}

}
