package hasdal.nakliye.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import hasdal.nakliye.entities.Mail;

public interface MailDao extends JpaRepository<Mail, Integer>{

}
