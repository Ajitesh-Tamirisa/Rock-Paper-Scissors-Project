package com.java.Rock_Paper_Scissors;

import java.util.Scanner;

public class Player1 extends Players {
	Scanner sc = new Scanner(System.in);
	public void setChoice() {
		System.out.println("Enter your choice- player#1:");
		choice=sc.nextInt();
		if(choice < 1 || choice > 4) {
			System.out.println("Invalid choice. Choose again");
			setChoice();
		}
	}
	public String getChoice() {
		setMap();
		return map.get(choice);		
	}
}
