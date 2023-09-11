package ubaid.group.onlinebank.entities;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="account")

public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	@Column(nullable = false)
	//@Pattern(regexp="(Mr.,Mrs.,Miss")
	private String title;
	@Column(nullable=false)
	private String firstName;
	private String middleName;
	@Column(nullable=false)
	private String lastName;
	@Column(nullable=false)
	private String fathersName;
	@Column(nullable=false)
	private String mobileNumber;
	//@Pattern(regexp="^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$",message="Enter the right email format.")
	private String emailId;
	@Column(nullable=false)
	private String aadharCardNumber;
	@Column(nullable=false)
	private LocalDate dateOfBirth;
	
	

	@Column(nullable=false)
	private String raddressLine1;
	@Column(nullable=false)
	private String raddressLine2;
	private String rlandMark;
	@Column(nullable=false)
	private String rstate;
	@Column(nullable=false)
	private String rcity;
	@Column(nullable=false)
	private int rpincode;
	
	@Column(nullable=false)
	private String paddressLine1;
	@Column(nullable=false)
	private String paddressLine2;
	private String plandMark;
	@Column(nullable=false)
	private String pstate;
	@Column(nullable=false)
	private String pcity;
	@Column(nullable=false)
	private int ppincode;
	
	@Column(nullable=false)
	private String occupationType;
	@Column(nullable=false)
	private String sourceOfIncome;
	@Column(nullable=false)
	private String grossAnnualIncome;
}
