package Aprject;

import java.util.ArrayList;

public class Game {

	public static void main(String[] args) {
		ArrayList<CardDeck> Deck = new ArrayList<>();
		ArrayList<User> user = new ArrayList<>();
		ArrayList<Computer> computer = new ArrayList<Computer>();
		
		}
	}


class User{
	private ArrayList<Card> User = new ArrayList<>();
	
	public User() {}
	public User(Card c) {
		User.add(c);
	}
	
	//중복재거
	public void delUser() {
		
		
		
	}
	
	public ArrayList<Card> getUser() {
		return User;
	}

	public void setUser(ArrayList<Cardk> user) {
		User = user;
	}
	
	
}

class Computer{
	private ArrayList<Card> computer = new ArrayList<>();
	
	public Computer() {}
	
	

	public ArrayList<Card> getComputer() {
		return computer;
	}

	public void setComputer(ArrayList<Card> computer) {
		this.computer = computer;
	}
	
	
}