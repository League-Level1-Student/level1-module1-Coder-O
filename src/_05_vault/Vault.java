package _05_vault;

public class Vault {
		private int code;
		
		Vault(int code) {
			this.code= code;
		}
		
		public boolean tryCode(int guess) {
			return guess == code;
		}
}
