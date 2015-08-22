package models.accessUser.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Value;
import lombok.experimental.Accessors;

@Embeddable
@Value
@Accessors(fluent = true)
public class UserName {

	@Column(name = "userName", nullable = false, length = 10)
	@Getter
	private String value;

	public UserName(String value) {
		this.value = value;
	}

}
