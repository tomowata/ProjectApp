package models.message.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Value;
import lombok.experimental.Accessors;

@Embeddable
@Value
@Accessors(fluent = true)
public class Contents {

	@Column(name = "content")
	@Getter
	private String value;

	public Contents(String value) {
		this.value = value;
	}
}
