package oopWithNLayeredApp.core.logging;

public class MailLogger implements Logger {
	public void log(String data) {
		System.out.println("Mail gönderildi : " + data );

}
}