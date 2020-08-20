package _05_vault;

import java.util.Random;

public class JamesBond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Vault vault = new Vault(ran.nextInt(1000000));
		findCode(vault);
	}
	
	public static void findCode(Vault vault) {
		int guess = 1000000;
		for(; guess > -1; guess--) {
			if(vault.tryCode(guess)) {
				break;
			}
		}
		System.out.println(guess);
	}
	

}
