package pack;

import java.time.LocalDate;

public class Card implements Comparable {
	private String owner;
	private LocalDate validity;
	private CardIssuer issuer;
	private int balance;
	
	public Card(String owner, LocalDate validity, CardIssuer issuer, int balance) {
		super();
		this.owner = owner;
		this.validity = validity;
		this.issuer = issuer;
		this.balance = balance;
	}
	
	public boolean Withdraw(int ammount) {
		if (ammount <= balance && LocalDate.now().isBefore(validity)) {
			balance -= ammount;
			return true;
		}
		return false;
	}

	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public LocalDate getValidity() {
		return validity;
	}

	public void setValidity(LocalDate validity) {
		this.validity = validity;
	}

	public CardIssuer getIssuer() {
		return issuer;
	}

	public void setIssuer(CardIssuer issuer) {
		this.issuer = issuer;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Card [owner=" + owner + ", validity=" + validity + ", issuer=" + issuer + ", balance=" + balance + "]";
	}

	@Override
	public int compareTo(Object o) {
		Card card = (Card) o;
		if (card.validity.isBefore(validity)) {
			return 1;
		}
		else if (card.validity.isAfter(validity)) {
			return -1;
		}
			return 0;
	}
	
	
	
}
