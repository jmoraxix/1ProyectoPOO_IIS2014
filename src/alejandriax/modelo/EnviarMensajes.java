/** 
 * Proyecto Final POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Gabriel Ramirez
 * 201020244
 */
package alejandriax.modelo;

/**
 * @author xDiegoxD 13/09/2014
 *
 * 
 */
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnviarMensajes {
	public void sendMail(String from, String to, String subject, String messageBody) 
			throws MessagingException, AddressException {
		
		// Setup mail server
		String host = "smtp.gmail.com";
		String username = "a.diego.dc@gmail.com";
		String password = "your_email_password"; 
		Properties props = new Properties(); 
		props.put("mail.smtps.auth", "true");
		
		// Get a mail session
		Session session = Session.getDefaultInstance(props, null); 
		
		// Define a new mail message
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(from));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(to)); 
		message.setSubject(subject); 
		message.setText(messageBody); 
		
		// Send the message
		
		Transport t = session.getTransport("smtps");
		try { 
			t.connect(host, username, password);
		t.sendMessage(message, message.getAllRecipients()); }
		finally { t.close(); } }
		
	public static void main(String[] args) {
		try { 
			//MailClient client = new MailClient(); 
			String from="your_email_address";
			String to = "Recipients10DigitNumber@RecipientsCarriersSMTP.com";
			String subject="Test"; 
			String message="I'm testing. Do you see this?"; 
			//client.sendMail(from,to,subject,message); 
			} catch(Exception e) { e.printStackTrace(System.out); } }
	

}
