package com.tka.dec9;

public class Bank {
	private static int balance;
	private int accno;

	Bank(int bal, int ano) {
		balance = bal;
		accno = ano;
	}

	public int getBalance(int pin) {
		if (pin == 9999) {
			return balance;
		} else {
			System.out.println("wrong pin");
			return 0;
		}
	}

	public void setBalance(int bal, int pin) {
		if (pin == 9999) {
			if (bal > 0) {
				balance += bal;
			} else {
				System.out.println("amount can't be negative");
			}
		} else {
			System.out.println("wrong pin");
		}
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int ano) {
		accno = ano;
	}
}
