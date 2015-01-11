package br.fatea.simplebank.model.domains;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.envers.Audited;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="TBL_CREDIT_CARD")
@Audited
public class CreditCard {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CRC_ID")
	private Long id;
	
	@NotNull
	@NotEmpty
	@Column(name="CRC_NUMBER", unique=true)
	private String number;

	@NotNull
	@Embedded
	@Column(name="CRC_VALIDATION_DATE")
	private ValidationDate validationDate;
	
	@NotNull
	@Min(value=1)
	@Column(name="CRC_CODE")
	private Integer code;
	
	@Version
	@Column(name="SYS_VERSION")
	private Integer version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public ValidationDate getValidationDate() {
		return validationDate;
	}

	public void setValidationDate(ValidationDate validationDate) {
		this.validationDate = validationDate;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result
				+ ((validationDate == null) ? 0 : validationDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCard other = (CreditCard) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (validationDate == null) {
			if (other.validationDate != null)
				return false;
		} else if (!validationDate.equals(other.validationDate))
			return false;
		return true;
	}
	
}
