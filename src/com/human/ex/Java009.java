package com.human.ex;

import java.util.Scanner;

public class Java009 {
	
	public static void main(String[] args) {
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		//1�ܰ� ���ھ�:1�� 2�ܰ�:2�� 3�ܰ�:3�� 4�ܰ�:4��
		//Ʋ���� ������ ����
		int level=0,scour=0;
		for(;;) {
			System.out.print("���Ͻô� ������ ����ּ��� (1~4):");
			level=Integer.parseInt(scanner.nextLine());
			scour+=madeQestionAndDisplay(0,0,level);
			
			System.out.println("���� ���ھ�:"+scour+"��");
			System.out.print("�� �Ͻðڽ��ϱ�? 1.�� 2.�ƴϿ�:");
			int game=Integer.parseInt(scanner.nextLine());
			
			if(game==2) {
				break;
			}
			
		}
		System.out.println("����"+scour+"��");
		System.out.print("��������");

	}
	public static int madeQestionAndDisplay(int a,int b,int level) {
		java.util.Scanner scanner
		=new java.util.Scanner(System.in);
		int sum=0;
		int scour=0;
		a=(int)(Math.random()*99)+1;
		b=(int)(Math.random()*99)+1;
	     	if(level==1) {
	     		sum=a+b;
	     		System.out.print(a+"+"+b+"=?");
	     		int result=Integer.parseInt(scanner.nextLine());
	     		if(result==sum) {
	     			scour++;
	     		}else {
	     			scour--;
	     		}
		    }else if(level==2) {
		    	sum=a-b;
		    	System.out.print(a+"-"+b+"=?");
	     		int result=Integer.parseInt(scanner.nextLine());
	     		if(result==sum) {
	     			scour+=2;
	     		}else {
	     			scour-=2;
	     		}
		    }else if(level==3) {
		    	sum=a*b;
		    	System.out.print(a+"*"+b+"=?");
	     		int result=Integer.parseInt(scanner.nextLine());
	     		if(result==sum) {
	     			scour+=3;
	     		}else {
	     			scour-=3;
	     		}
		    }else if(level==4) {
		    	sum=a/b;
		    	System.out.print(a+"/"+b+"=?");
	     		int result=Integer.parseInt(scanner.nextLine());
	     		if(result==sum) {
	     			scour+=4;
	     		}else {
	     			scour-=4;
	     		}
		    }
	     	return scour;
	  
		
	}

}
