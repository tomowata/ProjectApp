package models.accessUser.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Value;
import lombok.experimental.Accessors;

@Embeddable
@Value
@Accessors(fluent = true)
public class Password {

	@Column(name = "password", nullable = false, length = 10)
	private String value;

	public Password(String value) {
		this.value = value;
	}
}
