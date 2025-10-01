package hasdal.nakliye.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailRequest {
	
	@NotBlank(message = "İsim boş olamaz")
	private String name;
    
    @NotBlank(message = "Telefon numarası boş olamaz")
    @Pattern(
        regexp = "^[0-9]{10}$", 
        message = "Telefon numarası sadece 10 haneli rakamlardan oluşmalıdır"
    )
    private String phone;

    @NotBlank(message = "Konu boş olamaz")
    @Size(max = 100, message = "Konu en fazla 100 karakter olabilir")
    private String subject;

    @NotBlank(message = "Mesaj boş olamaz")
    @Size(max = 1000, message = "Mesaj en fazla 1000 karakter olabilir")
    private String message;
    
	
}
