package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = number.nextInt();
		while (num >= 1) {
			System.out.println(num);
			if (num==1){
				break;
			}else {
				if (num % 2 == 0) {
					num = num / 2;

				} else {
					num = (num * 3) + 1;

				}
			}

		}
	}

}
