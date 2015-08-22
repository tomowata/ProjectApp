package models.project.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Value;
import lombok.experimental.Accessors;

import org.joda.time.DateTime;

@Embeddable
@Value
@Accessors(fluent = true)
public class DeadlineDate {

	@Column(name = "deadlineDate")
	@Getter
	private DateTime value;

	public DeadlineDate(DateTime value) {
		this.value = value;
	}
}
