package hasdal.nakliye.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	
	public void sendMail(String text, String subject) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("bilgi@mersinarslannakliyat.com");
		message.setText(text);
		message.setSubject(subject);
		message.setTo("c.hasdalyazilim@gmail.com");
		javaMailSender.send(message);//11.21-12.34 13.36-14.56 => 1.13+1.20+1.50 = 4.23
	}
	
	


}
