package polymorphismDemo;


public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager (BaseLogger logger) {
		this.logger=logger;
	}
	public void Add() {
		System.out.println("Muşteri Eklendi");
		this.logger.log("Log mesajı ");
	}
	public void add() {
		// TODO Auto-generated method stub
		
	}
}
