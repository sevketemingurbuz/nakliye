package hasdal.nakliye.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hasdal.nakliye.business.concretes.MailService;
<<<<<<< HEAD
import hasdal.nakliye.entities.MailDto;
=======
import hasdal.nakliye.entities.MailRequest;
>>>>>>> 200cca3 (.env)
import jakarta.validation.Valid;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/mail")
public class MailController {

	private final MailService mailService;
	
	public MailController(MailService mailService) {
		this.mailService= mailService;
	}
	
	@PostMapping("/send")
<<<<<<< HEAD
	public ResponseEntity<String> send(@RequestBody @Valid MailDto mailRequest) {
		String text = mailRequest.getMessage()
				+ "\n\nGönderici: " + mailRequest.getName()
				+"\n" + mailRequest.getPhone();//4.45-6.05 6.35-7.35 9.37-11.22 /////3.59
		mailService.sendMail(text, mailRequest.getSubject());
=======
	public ResponseEntity<String> send(@RequestBody @Valid MailRequest mailDto) {
		String text = mailDto.getMessage()
				+ "\n\nGönderici: " + mailDto.getName()
				+"\n" + mailDto.getPhone();//4.45-6.05 6.35-7.35 9.37-11.22 /////3.59
		mailService.sendMail(text, mailDto.getSubject());
>>>>>>> 200cca3 (.env)
		return ResponseEntity.ok("Mail başarıyla gönderildi");
	}
	
	
}
