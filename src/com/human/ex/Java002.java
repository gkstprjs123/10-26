package com.human.ex;

public class Java002 {
	
	

	public static void main(String[] args) {
		
		//����� 1��
		for(int i=0; i<9; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//����� 2��
		int a=8;
		for(int i=0; i<9; i++) {
			for(int j=0; j<a; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			a--;
			System.out.println("");
		}
	    
		//����� 3��
		for(int i=0; i<9; i++) {
			for(int j=0; j<9-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//����� 4��
		for(int i=0; i<9; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<9-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//����� 5��
		a=1;
		for(int i=0; i<9; i++) {
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			if(i<4) {
				a++;
			}else if(i>=4) {
				a--;
			}
			System.out.println("");
		}
		
		//����� 6��
		int b=1;
		int bA=4;
		for(int i=0; i<9; i++) {
			for(int j=0; j<bA; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<b; j++) {
				System.out.print("*");
			}
			if(i<4) {
				b++;
				bA--;
			}else if(i>=4) {
				b--;
				bA++;
			}
			System.out.println("");
			
		}
		
		//����� 7��
		int c=5;
		int cA=0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<c; j++) {
				System.out.print("*");
			}
			for(int j=0; j<cA; j++) {
				System.out.print(" ");
			}
			if(i<4) {
				c--;
				cA++;
			}else if(i>=4) {
				c++;
				cA--;
			}
			System.out.println("");
		}
		
		//����� 8��
		c=5;
		cA=0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<cA; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<c; j++) {
				System.out.print("*");
			}
			if(i<4) {
				c--;
				cA++;
			}else if(i>=4) {
				c++;
				cA--;
			}
			System.out.println("");
		}
		
		//����� 9��
		a=5;
		b=1;
		for(int i=0; i<9; i++) {
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			for(int j=0; j<b; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			if(i<4) {
				a--;
				b+=2;
			}else if(i>=4) {
				a++;
				b-=2;
			}
			System.out.println("");
			
		}
		
		//����� 10��
		a=1;
		b=8;
		for(int i=0; i<9; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			for(int j=0; j<b; j++) {
				System.out.print(" ");
			}
			System.out.println("");
			a+=2;
			b--;
		}
		//����� 11��
		a=17;
		b=0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			for(int j=0; j<b; j++) {
				System.out.print(" ");
			}
			System.out.println("");
			a-=2;
			b++;
		}
		//����� 12��
		a=9;
		b=0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			for(int j=0; j<b; j++) {
				System.out.print(" ");
			}
			if(i<4) {
				a-=2;
				b++;
			}else if(i>=4) {
				a+=2;
				b--;
			}
			System.out.println("");
		}	
			//����� 13��
		a=5;
		b=0;
		c=5;
		for(int i=0; i<9; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			for(int j=0; j<c; j++) {
				System.out.print(" ");
			}
			if(i<4) {
				b++;
				c--;
			}else if(i>=4) {
				b--;
				c++;
			}
			System.out.println("");
		}
		//����� 14��
		a=1;
		b=1;
		c=7;
		System.out.println("        *");
		for(int i=0; i<8; i++) {
		  if(i<7) {
			  for(int j=0; j<c; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<a; j++) {
					System.out.print("*");
				}
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<a; j++) {
					System.out.print("*");
				}
				for(int j=0; j<c; j++) {
					System.out.print(" ");
				}
				c--;
				b+=2;
				System.out.println("");
		  }else{
				for(int j=0; j<17; j++) {
					System.out.print("*");
				}
				System.out.println("");
		  }
		}
		
		//����� 15��
		a=1;
		b=0;
		c=7;
		for(int i=0; i<9; i++) {
			if(i!=4) {
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<a; j++) {
					System.out.print("*");
				}
				for(int j=0; j<c; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<a; j++) {
					System.out.print("*");
				}
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				if(i<3) {
					c-=2;
					b++;
				}else if(i>4){
					c+=2;
					b--;
				}
				System.out.println("");
			}else if(i==4) {
				System.out.println("    *");
			}
		}
		
	}

}
