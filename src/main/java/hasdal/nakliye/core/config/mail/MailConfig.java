package hasdal.nakliye.core.config.mail;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/*@Configuration
public class MailConfig {
	

	@Bean
	public JavaMailSenderImpl getJavaMailSender() {
	    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
	    mailSender.setHost("${SPRING_MAIL_HOST}");
	    mailSender.setPort(587);
	    
	    mailSender.setUsername("${MAIL_USERNAME}");
	    mailSender.setPassword("${MAIL_PASSWORD}");
	    
	    Properties props = mailSender.getJavaMailProperties();
	    props.put("mail.transport.protocol", "smtp");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.debug", "true");
	    
	    return mailSender;
	}

}*/
