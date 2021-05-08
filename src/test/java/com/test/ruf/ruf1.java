package com.test.ruf;

public class ruf1 {

	public static void main(String[] args) {
		long no=7897899l;
long DigitCollection=0;
long Reversing=0;
int count=0;
while(no>0) {
	DigitCollection=no % 10;
//	Reversing=(Reversing*10)+DigitCollection;
	count++;
	no=no/10;
}
System.out.println(Reversing);		
	}
}
