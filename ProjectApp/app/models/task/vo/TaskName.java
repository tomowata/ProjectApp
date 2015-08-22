package models.task.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Value;
import lombok.experimental.Accessors;

@Embeddable
@Value
@Accessors(fluent = true)
public class TaskName {

	@Column(name = "projectName", nullable = false, length = 20)
	@Getter
	private String value;

	public TaskName(String value) {
		this.value = value;
	}
}
