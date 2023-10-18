//tag::all[]
//tag::allButValidation[]
package tacos;
import java.sql.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;

@Data
public class Order {

  private Long id;
  private Date createdAt;

  //end::allButValidation[]
  @NotBlank(message="Imie i Nazwisko jest wymagane")
  //tag::allButValidation[]
  private String name;
  //end::allButValidation[]

  @NotBlank(message="Adres jest wymagane")
  //tag::allButValidation[]
  private String street;
  //end::allButValidation[]

  @NotBlank(message="Miasto jest wymagane")
  //tag::allButValidation[]
  private String city;
  //end::allButValidation[]

  @NotBlank(message="Kraj jest wymagane")
  //tag::allButValidation[]
  private String state;
  //end::allButValidation[]

  @NotBlank(message="Numer Domu jest wymagane")
  //tag::allButValidation[]
  private String zip;
  //end::allButValidation[]

  @CreditCardNumber(message="To nie jest prawidłowy format karty kredytowej")
  //tag::allButValidation[]
  private String ccNumber;
  //end::allButValidation[]

  @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
           message="Musi być w formacie  MM/YY")
  //tag::allButValidation[]
  private String ccExpiration;
  //end::allButValidation[]

  @Digits(integer=3, fraction=0, message="Nieprawidłowy kod CVV")
  //tag::allButValidation[]
  private String ccCVV;

}
//end::allButValidation[]
//end::all[]
