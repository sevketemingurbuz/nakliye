package hasdal.nakliye.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name= "mails")
@AllArgsConstructor
@NoArgsConstructor
public class Mail {
	
	@Column(name= "id")
	private int id;
	
	@Column(name= "name")
	private String name;
	
	@Column(name= "phone")
	private String phone;
	
	@Column(name= "subject")
	private String subject;
}
